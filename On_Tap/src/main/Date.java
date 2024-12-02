package main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Date {
    public static void main(String[] args) {
    	// currentTimeMIllis() - mili giấy tính từ 1/1/1970 đến nay
    	// đo khoảng thời gian thực hiện câu lệnh, làm mã, id của một đối tượng
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            System.out.println("Test");
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Trc khi chạy for:  " + t1);
        System.out.println("Sau khi chạy for:  " + t2);
        System.out.println("Thời gian chạy:  " + (t2 - t1) + "ms");

       // TimeUnit=> chuyển đổi thời gian
        System.out.println("3000 năm = " + TimeUnit.DAYS.toSeconds(3000 * 365) + "s");
        System.out.println("25h = " + TimeUnit.HOURS.toSeconds(25) + "s");

       /// Date
		java.sql.Date d = new java.sql.Date(System.currentTimeMillis());
		System.out.println(d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900));
		
		//Calendar
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));
		
		c.add(Calendar.HOUR, 30); // Thêm thời gian
		System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));
		
		c.add(Calendar.DATE, 14);
		System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));
		
		// DateFormat
		DateFormat df = new SimpleDateFormat();
		System.out.println(df.format(d));
		df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(d));
}

	private int getYear() {
		// TODO Auto-generated method stub
		return 0;
	}

	private String getDate() {
		// TODO Auto-generated method stub
		return null;
	}

	private int getMonth() {
		// TODO Auto-generated method stub
		return 0;
	}
	}
