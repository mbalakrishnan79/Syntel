package com.bala.ims.IMSDataConversion.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IMSUtil {

	public static Date parseDate(String dateField) {
		try {
			if(dateField.equals("99999999")) {
				return null;
			}
			SimpleDateFormat formatter = new SimpleDateFormat("yyyymmdd");
			return formatter.parse(dateField);
		} catch (ParseException e) {
			System.out.println("ParseException while parsing date field");
		}
		return null;
	}
}
