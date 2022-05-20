package sample_ex;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// 호출방법 : 원하는 날짜와 시간 타입으로 호출
// getCurrnetDate("yyyy-MM-dd HH:mm:ss")

public class date_format {
	public static void main(String args[]) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
 	    
		
		System.out.println("변경 전 현재 일시 : " + df.format(cal.getTime()));
		
		cal.add(Calendar.MONTH, 1);  //월 더하기
		cal.add(Calendar.DATE, -5);  //일 더하기
		
		cal.add(Calendar.YEAR, 1);  //년 더하기
		cal.add(Calendar.DATE, 3);  //일 더하기
		cal.add(Calendar.HOUR_OF_DAY, 1);  //시간 더하기
		cal.add(Calendar.MINUTE, 20);  //분 더하기
		cal.add(Calendar.SECOND, 10);  //초 더하기

        System.out.println("변경 후 : " + df.format(cal.getTime()));       

		
	}
}


