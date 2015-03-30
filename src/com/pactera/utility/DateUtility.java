package com.pactera.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtility {
	public static Date convertStringDateToUilDate(String dateStr){
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    Date convertedCurrentDate = null;
		try {
			convertedCurrentDate = sdf.parse(dateStr);
			//String date = sdf.format(convertedCurrentDate );
		    
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		return convertedCurrentDate;
	}
	
	public static Date milliesToDate(long millis){
		Date date = new Date(millis);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    Date convertedCurrentDate = null;
		try {
			convertedCurrentDate = convertStringDateToUilDate(sdf.format(date));
			//String date = sdf.format(convertedCurrentDate );
		    
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		return convertedCurrentDate;
	}

}
