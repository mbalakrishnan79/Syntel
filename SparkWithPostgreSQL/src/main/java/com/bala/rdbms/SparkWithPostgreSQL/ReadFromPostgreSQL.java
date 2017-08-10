package com.bala.rdbms.SparkWithPostgreSQL;

import java.util.Properties;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SQLContext;
import org.apache.spark.sql.SparkSession;

public class ReadFromPostgreSQL {

	 public static void main(String[] args) {

		  JavaSparkContext sc = new JavaSparkContext(new SparkConf().setAppName("SparkJdbcDs").setMaster("local[*]"));
		  SQLContext sqlContext = new SQLContext(sc);
		  SparkSession spark = SparkSession.builder().appName("SparkPostgreSQLExample").getOrCreate();
		  Properties connectionProperties = new Properties();
		  connectionProperties.put("user", "postgres");
		  connectionProperties.put("password", "Syntel123$");
		  String query = "sparkour.people";
		  query = "(select * from employee)";
		  Dataset<Row> jdbcDF2 = spark.read().jdbc("jdbc:postgresql://localhost:5432/postgres", query,connectionProperties);
		  jdbcDF2.show();

		 }
}
