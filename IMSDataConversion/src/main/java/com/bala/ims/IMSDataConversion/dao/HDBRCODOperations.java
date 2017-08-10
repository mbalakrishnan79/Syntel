package com.bala.ims.IMSDataConversion.dao;

import com.bala.ims.IMSDataConversion.common.IMSUtil;
import com.bala.ims.IMSDataConversion.model.HDBRCODCodeGroup;
import com.bala.ims.IMSDataConversion.model.HDBRCODData;

public class HDBRCODOperations {

	public HDBRCODData parseCODData(String[] field) {
		HDBRCODData data = new HDBRCODData();
		
		int count = 0;
		
		data.setHDBRCOD_COMP_CNCL_DTE(IMSUtil.parseDate(field[count++]));
		data.setHDBRCOD_SEQ_NBR(Integer.parseInt(field[count++].trim()));

		HDBRCODCodeGroup[] codeGroups = data.getHDBRCOD_CDE_GRP();

		for(int i=0; i<30; i++) {
			String fieldData = field[count++];
			
			if(fieldData != null) {
				char[] subField = fieldData.toCharArray();
				codeGroups[i] = new HDBRCODCodeGroup();

				int j=0;
				codeGroups[i].setHDBRCOD_CDE_TYPE(new StringBuilder()
							.append(subField[j]).append(subField[++j])
							.append(subField[++j]).toString().trim());
				codeGroups[i].setHDBRCOD_CDE_1(new StringBuilder()
							.append(subField[++j]).append(subField[++j])
							.append(subField[++j]).append(subField[++j])
							.append(subField[++j]).append(subField[++j])
							.append(subField[++j]).append(subField[++j])
							.toString().trim());
				codeGroups[i].setHDBRCOD_CDE_2(new StringBuilder()
							.append(subField[++j]).append(subField[++j])
							.append(subField[++j]).append(subField[++j])
							.append(subField[++j]).append(subField[++j])
							.append(subField[++j]).append(subField[++j])
							.toString().trim());
				codeGroups[i].setHDBRCOD_CONN(Character.getNumericValue(subField[++j]));
				
			}
			fieldData = null;
		}
		data.setHDBRCOD_CDE_GRP(codeGroups);
		
		data.setHDBRCOD_LAST_USERID(field[count++].trim());
		data.setHDBRCOD_LAST_UPDT_DTE(IMSUtil.parseDate(field[count++])); 
		return data;
	}
}
