package com.bala.RDBMS.controller;

import java.util.List;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

import com.bala.RDBMS.model.MDLR_CLM_Subset;

public class RDBMSReadOperation {

	public static void main(String[] args) {

		SparkConf conf = new SparkConf().setAppName(
				"Read RDBMS").set("spark.executor.instances", "4");
		JavaSparkContext context = new JavaSparkContext(conf);

		RDBMSOperations read = new RDBMSOperations();

		int setId = 0, subSetId = 0;
		MDLR_CLM_Subset subSet = new MDLR_CLM_Subset();
		List<MDLR_CLM_Subset> tableRecords = read.readFromRDBMS(subSet, setId,
				subSetId);
		for (MDLR_CLM_Subset tableRec : tableRecords) {
			System.out.println("parsing the returned value in main");
			System.out.println(tableRec.toString());
		}
	}
}
