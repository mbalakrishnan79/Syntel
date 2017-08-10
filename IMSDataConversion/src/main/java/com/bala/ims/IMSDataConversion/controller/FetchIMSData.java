package com.bala.ims.IMSDataConversion.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.bala.ims.IMSDataConversion.common.IMSUtil;
import com.bala.ims.IMSDataConversion.dao.HDBPOVRTableOperations;
import com.bala.ims.IMSDataConversion.dao.HDBPPRITableOperations;
import com.bala.ims.IMSDataConversion.dao.HDBPRHCTableOperations;
import com.bala.ims.IMSDataConversion.dao.HDBRCODOperations;
import com.bala.ims.IMSDataConversion.model.HDBPOVRData;
import com.bala.ims.IMSDataConversion.model.HDBPPRIData;
import com.bala.ims.IMSDataConversion.model.HDBPRHCData;
import com.bala.ims.IMSDataConversion.model.HDBRCODData;
import com.bala.ims.IMSDataConversion.model.HDBRVRDData;

public class FetchIMSData {

	public HDBRVRDData getHDBRVRDData() {

		HDBRVRDData data = new HDBRVRDData();
		Properties prop = new Properties();
		InputStream input = null;

		try {
			input = getClass().getClassLoader().getResourceAsStream("IMSData.properties");
			if (input == null) {
				throw new IOException("input stream creation failed for IMSData.properties");
			}
			prop.load(input);

			String field[] = prop.getProperty("HDBRVRD").split(",");

			int count = 0;
			data.setHDBRVRD_VRBL_CAT(field[count++].trim());
			data.setHDBRVRD_VRBL_OPT(field[count++].trim());
			
			data.setHDBRVRD_KEY_DTE(IMSUtil.parseDate(field[count++]));
			data.setHDBRVRD_EFF_DTE(IMSUtil.parseDate(field[count++]));
			data.setHDBRVRD_END_DTE(IMSUtil.parseDate(field[count++]));
			data.setHDBRVRD_STS_IND(field[count++].charAt(0));
			data.setHDBRVRD_PRICING_IND(field[count++].charAt(0));
			data.setHDBRVRD_LAST_UPDTE_DTE(IMSUtil.parseDate(field[count++]));
			data.setHDBRVRD_LAST_USERID(field[count++].trim());
			data.setHDBRVRD_PROC_LVL_CDE(field[count++].charAt(0));
			data.setHDBRVRD_PRIRTY_LVL(Integer.parseInt(field[count++].trim()));
			data.setHDBRVRD_VRBL_CNT(Integer.parseInt(field[count++].trim()));

			String[] VRBL_TYPE_CODE = data.getHDBRVRD_VRBL_TYPE_CDE();
			if (field[count] != null) {
				char[] subField = field[count].toCharArray();
				int totalSubFieldCount = 0;
				int i = 0;
				while (i < subField.length) {
					if (totalSubFieldCount >= 5) {
						break;
					}
					VRBL_TYPE_CODE[totalSubFieldCount] = new StringBuilder()
							.append(subField[i]).append(subField[++i])
							.toString();

					++i;
					++totalSubFieldCount;
				}
			}
			++count;

			data.setHDBRVRD_TXT_LINE_SHORT(field[count++].trim());
			data.setHDBRVRD_TXT_LINE_1(field[count++].trim());
			data.setHDBRVRD_TXT_LINE_2(field[count++].trim());
			data.setHDBRVRD_TXT_LINE_3(field[count++].trim());
			data.setHDBRVRD_TXT_LINE_4(field[count++].trim());
			data.setHDBRVRD_LAST_VRBL_OPT(field[count++].trim());

			char[] PLACE_OF_SVC_IND = data.getHDBRVRD_PLACE_OF_SVC_IND();
			if (field[count] != null) {
				PLACE_OF_SVC_IND = field[count].toCharArray();
			}
			++count;

			data.setHDBRVRD_RVN_CDE(field[count++].trim());
			data.setHDBRVRD_CATEGORY_CDE(field[count++].trim());

			String[] LICENSURE_CDE = data.getHDBRVRD_LICENSURE_CDE();
			if (field[count] != null) {
				char[] subField = field[count].toCharArray();

				int totalSubFieldCount = 0;
				int i = 0;
				while (i < subField.length) {
					if (totalSubFieldCount >= 10) {
						break;
					}
					LICENSURE_CDE[totalSubFieldCount] = new StringBuilder()
							.append(subField[i]).append(subField[++i])
							.toString();

					++i;
					++totalSubFieldCount;
				}
			}
			++count;

			String[] CONTRACT_CDE = data.getHDBRVRD_CONTRACT_CDE();
			if (field[count] != null) {
				char[] subField = field[count].toCharArray();

				int totalSubFieldCount = 0;
				int i = 0;
				while (i < subField.length) {
					if (totalSubFieldCount >= 10) {
						break;
					}
					CONTRACT_CDE[totalSubFieldCount] = new StringBuilder()
							.append(subField[i]).append(subField[++i])
							.append(subField[++i]).append(subField[++i])
							.toString();

					++i;
					++totalSubFieldCount;
				}
			}
			++count;

		} catch (IOException io) {
			System.out.println("IO exception while reading properties file");
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return data;

	}

	public HDBRCODData[] getHDBRCODData() {
		
		HDBRCODData[] CODData = new HDBRCODData[2];
		HDBRCODOperations operation = new HDBRCODOperations();
		Properties prop = new Properties();
		InputStream input = null;
		
		try {
			input = getClass().getClassLoader().getResourceAsStream("IMSData.properties");
			if (input == null) {
				throw new IOException("input stream creation failed for IMSData.properties");
			}
			prop.load(input);
			
			CODData[0] = operation.parseCODData(prop.getProperty("HDBRCOD1").split(","));
			CODData[1] = operation.parseCODData(prop.getProperty("HDBRCOD2").split(","));
			
		} catch(IOException e) {
			System.out.println("Error while parsing HDBRCOD data from properties file and composing the Java object");
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return CODData;
	}
	
	public HDBPRHCData[] getHDBPRHCData(String HCPCSCode) {
		Properties prop = new Properties();
		InputStream input = null;
		HDBPRHCData[] data = null;
		
		try {
			input = getClass().getClassLoader().getResourceAsStream("config.properties");
			if (input == null) {
				throw new IOException("input stream creation failed for config.properties");
			}
			prop.load(input);
		
			String dataSource = prop.getProperty("datasource");
			
			HDBPRHCTableOperations operation = new HDBPRHCTableOperations();
			
			switch(dataSource) {
				case "UDB":
					data = operation.fetchFromUDB(HCPCSCode);
					break;
				case "MongoDB":
					data = operation.fetchFromMongoDB(HCPCSCode);
					break;
				case "HDFS":
					data = operation.fetchFromHDFS(HCPCSCode);
					break;
				case "Exadata":
					data = operation.fetchFromExadata(HCPCSCode);
					break;
			}
		} catch(IOException e) {
			System.out.println("Error while parsing HDBRCOD data from properties file and composing the Java object");
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return data;	
	}
	
	public HDBPPRIData[] getHDBPPRIData(String HCPCSCode, String pricngPrdtCde, int effDte) {
		Properties prop = new Properties();
		InputStream input = null;
		HDBPPRIData[] data = null;
		
		try {
			input = getClass().getClassLoader().getResourceAsStream("config.properties");
			if (input == null) {
				throw new IOException("input stream creation failed for config.properties");
			}
			prop.load(input);
		
			String dataSource = prop.getProperty("datasource");
			
			HDBPPRITableOperations operation = new HDBPPRITableOperations();
			
			switch(dataSource) {
				case "UDB":
					data = operation.fetchFromUDB(HCPCSCode, pricngPrdtCde, effDte);
					break;
				case "MongoDB":
					data = operation.fetchFromMongoDB(HCPCSCode);
					break;
				case "HDFS":
					data = operation.fetchFromHDFS(HCPCSCode);
					break;
				case "Exadata":
					data = operation.fetchFromExadata(HCPCSCode);
					break;
			}
		} catch(IOException e) {
			System.out.println("Error while parsing HDBRCOD data from properties file and composing the Java object");
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return data;	
	}
	
	public HDBPOVRData[] getHDBPOVRData(String HCPCSCode, String pricngPrdtCde, String prdtVarn, 
										String rgnCde, int effDte) {
		Properties prop = new Properties();
		InputStream input = null;
		HDBPOVRData[] data = null;
		
		try {
			input = getClass().getClassLoader().getResourceAsStream("config.properties");
			if (input == null) {
				throw new IOException("input stream creation failed for config.properties");
			}
			prop.load(input);
		
			String dataSource = prop.getProperty("datasource");
			
			HDBPOVRTableOperations operation = new HDBPOVRTableOperations();
			
			switch(dataSource) {
				case "UDB":
					data = operation.fetchFromUDB(HCPCSCode, pricngPrdtCde, prdtVarn, rgnCde, effDte);
					break;
				case "MongoDB":
					data = operation.fetchFromMongoDB(HCPCSCode);
					break;
				case "HDFS":
					data = operation.fetchFromHDFS(HCPCSCode);
					break;
				case "Exadata":
					data = operation.fetchFromExadata(HCPCSCode);
					break;
			}
		} catch(IOException e) {
			System.out.println("Error while parsing HDBRCOD data from properties file and composing the Java object");
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return data;	
	}

}
