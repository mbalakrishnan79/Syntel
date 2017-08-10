package com.bala.mongo.SparkWithMongo;

import java.util.List;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SaveMode;
import org.apache.spark.sql.SparkSession;
import org.bson.Document;

import com.mongodb.spark.MongoSpark;
import com.mongodb.spark.rdd.api.java.JavaMongoRDD;

public final class ReadFromMongoDB {

  public static void main(final String[] args) throws InterruptedException {

    SparkSession spark = SparkSession.builder()
      .master("local[*]")
      .appName("MongoSparkConnectorIntro")
      .config("spark.mongodb.input.uri", "mongodb://127.0.0.1/test.employee")
      .config("spark.mongodb.output.uri", "mongodb://127.0.0.1/test.employee")
      .getOrCreate();

    // Create a JavaSparkContext using the SparkSession's SparkContext object
    JavaSparkContext jsc = new JavaSparkContext(spark.sparkContext());

    /*Start Example: Read data from MongoDB************************/
    //JavaMongoRDD<Document> rdd = MongoSpark.load(jsc);
    // Load data and infer schema, disregard toDF() name as it returns Dataset
    Dataset<Row> implicitDS = MongoSpark.load(jsc).toDF();
    implicitDS.printSchema();
    implicitDS.show();
    
    Employee.composeEmployee(implicitDS.collectAsList());
    //Employee employee = null;
    //Row result = implicitDS.collect();
    System.out.print("Employee name = ");
//    System.out.println(implicitDS);
    
    System.out.println("Before saving in MongoDB mycol");
    MongoSpark.write(implicitDS.limit(1)).option("collection", "mycol").mode("overwrite").save();
    System.out.println("After saving in mongodb mycol");
    /*End Example**************************************************/

    // Analyze data from MongoDB
/*    System.out.println(rdd.count());
    System.out.println(rdd.first().toJson());
*/
    jsc.close();

  }
  
  

}
