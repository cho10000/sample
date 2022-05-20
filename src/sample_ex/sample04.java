package sample_ex;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class sample04 {
	public static void main(String[] args)  throws IOException, ParseException {
		// TODO Auto-generated method stub
		String testDate = "20160421";
		
		SimpleDateFormat  formatter01 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		SimpleDateFormat  formatter02 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat  formatter03 = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat  formatter04 = new SimpleDateFormat("yyyy-MM-dd");
		

		//현재 날짜 구하기
		String todate01=   formatter01.format(new Date());
		String todate02 =  formatter02.format(new Date());
		String todate03 =  formatter03.format(new Date());
		String todate04 =  formatter04.format(new Date());
		         
		System.out.println("현재시간 년월일 = " + todate01);
		System.out.println("현재시간 년월일 = " + todate02);
		System.out.println("현재시간 년월일 = " + todate03);
		
		//이부분은 날짜의 계산을 위해 Date 형식으로 형변환 한다는 의미 입니다.
		
		Date todate_date =  formatter03.parse(todate03);
		Date test_date   =  formatter03.parse(testDate);
		        
		System.out.println(todate_date + "====== " + test_date);
		long diff = todate_date.getTime() - test_date.getTime();
		// 시간차이를 시간,분,초를 곱한 값으로 나누면 하루 단위가 나옴
		long diffDays = diff / (24 * 60 * 60 * 1000);
		     
		System.out.println("날짜계산차이 : " + diff);
		System.out.println("일차이 : " + diffDays);
		System.out.println("년차이 : " + diffDays / 365);
			
			
		System.out.println(testDate);
		
		System.out.println("월  ===> " + DateUtil.getMonth(1));
		System.out.println("일  ===> " + DateUtil.getDay(41));
		System.out.println("시간  ===> " + DateUtil.getTime(13));
		System.out.println("해당일자첫날  ===> " + DateUtil.getCurrentFirstDateOfMonth());
		System.out.println("해당마지막날  ===> " + DateUtil.getCurrentEndDateOfMonth());		
		
		System.out.println("해당시작일첫날 ===> " + DateUtil.getFirstDateOfMonth("2021-01-22"));
		System.out.println("해당시작일마지막 ===> " + DateUtil.getEndDateOfMonth("2020-01-21"));
		
		 Calendar cal = Calendar.getInstance();
	        cal.setTime(new Date());
	        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	        System.out.println("current: " + df.format(cal.getTime()));

	        cal.add(Calendar.MONTH, 2);
	        cal.add(Calendar.DATE, -3);	        
	        
	        System.out.println("after: " + df.format(cal.getTime()));
	        
	        cal.set(Calendar.DAY_OF_MONTH, 1);
	        System.out.println("첫날 " + df.format(cal.getTime()));
	        
	        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
	        System.out.println("마지막날: " + df.format(cal.getTime()));
		
		
		
		
	}
}


