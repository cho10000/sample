package sample_ex;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateUtil {

		public static String getMonth(int month) {
			if (month > 0 && month < 10) {
				return "0" + String.valueOf(month);			
			}else {
				return String.valueOf(month);
			}
				
		}
		
		public static String getDay(int day) {
			if (day > 0 && day < 10) {
				return "0" + String.valueOf(day);			
			}else {
				return String.valueOf(day);
			}
				
		}
		
		public static String getTime(int num) {
			if (num > 0 && num < 10) {
				return "0" + String.valueOf(num);			
			}else {
				return String.valueOf(num);
			}
				
		} 
		
		
		  public static String getFirstDateOfMonth(String orginaldate) throws ParseException {
		  
		  Calendar cal = Calendar.getInstance(); 
          //"YYYY-MM-DD
		  cal.setTime(getStringToDate(orginaldate));
		  

		  cal.set(Calendar.DAY_OF_MONTH, 1);		  
		  
		  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
		  return  sdf.format(cal.getTime()); 
		  }
		  
			public static String getEndDateOfMonth(String orginaldate) throws  ParseException {
				 Calendar cal = Calendar.getInstance(); 
//			     SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
//				 Date orginal_date   =  df.parse(orginaldate);
				 // cal.setTime(orginal_date);
				 cal.setTime(getStringToDate(orginaldate));
				 cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
				
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				return sdf.format(cal.getTime());		
			}
			
			
			
		  
	  	public static String getCurrentFirstDateOfMonth() {
			Calendar cal = Calendar.getInstance();
			cal.set(Calendar.DAY_OF_MONTH, 1);
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			return sdf.format(cal.getTime());		
		}
		
		public static String getCurrentEndDateOfMonth() {
			Calendar cal = Calendar.getInstance();
			cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			return sdf.format(cal.getTime());		
		}
		
		public static String getCurrentDate(String format) {
			return getDateToString(format, System.currentTimeMillis());
			
		}
		
		//문자열을 Date 타입으로

		public static Date convertStringToDate(String dateInString) {
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date date = null;
			try {
				date = format.parse(dateInString);
			}catch (ParseException e) {
				e.printStackTrace();
			}
			return date;
		}
		
		//문자열을 date 타입으로
		public static String getDateToString(Date sdate) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			return sdf.format(sdate);
		}

		public static String getDateToString(String format, long milliTimes) {
			SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.getDefault());
		    return sdf.format(milliTimes);	
		}

		public static String getDate() {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			return sdf.format(new Date());
		}

		//이전 날짜, 다음 날짜 가져오기
		public static String getPreviousDate(String curentDate) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(getStringToDate(curentDate));
			cal.add(cal.DATE,  -1); //하루전
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			return sdf.format(cal.getTime());
		}
		
		public static String getNextDate(String curentDate) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(getStringToDate(curentDate));
			cal.add(cal.DATE,  +1); //하루전
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			return sdf.format(cal.getTime());
		}
		
		public static Date getStringToDate(String dateString) {
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			try {
				Date date = sdf.parse(dateString);
				return date;
			}catch (ParseException e) {
				//TODO Auto-generated catch block			
				e.printStackTrace();
			}
			return null;
		}	
		
		//년도 가져오기
		public static int getYear() {
			Calendar cal = Calendar.getInstance();
			cal.setTime(new Date());
			int year = cal.get(Calendar.YEAR);
			
			//int month = cal.get(Calendar.MONTH);
			//int day = cal.get(Calendar.DAY_OF_MONTH);
			
			//cal.add(Calendar.YEAR, 2);
			// cal.add(Calendar.MONTH, 2);
			//cal.add(Calendar.DATE, -3);
			//cSystem.out.println("after: " + df.format(cal.getTime()));
			return year;
			
		}
		
      
		
		
}



	// 호출방법 : 원하는 날짜와 시간 타입으로 호출
	// getCurrnetDate("yyyy-MM-dd HH:mm:ss")


