package util;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class String_Date {
	public static Date Convert(String dateString) {
		
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            java.util.Date parsedDate = dateFormat.parse(dateString);
            java.sql.Date sqlDate = new java.sql.Date(parsedDate.getTime());

            System.out.println("Chuỗi ngày tháng: " + dateString);
            System.out.println("java.sql.Date: " + sqlDate);
            return sqlDate;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
	}
}
