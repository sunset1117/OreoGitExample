package utils;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
123branch
public interface ChangeDateFormate {

////把yyyy-MM-dd格式的字串轉成sql.Date
	public static java.sql.Date ChangeDateFormate_Dash(String yyyyMMdd) {
		DateFormat formate = new SimpleDateFormat("yyyy-MM-dd");
		try {
			java.sql.Date sqlDate = new java.sql.Date(formate.parse(yyyyMMdd).getTime());
			return sqlDate;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new java.sql.Date(0);
	}

////把yyyy/MM/dd格式的字串轉成sql.Date
	public static java.sql.Date ChangeDateFormate_Slash(String yyyyMMdd) {
		DateFormat formate = new SimpleDateFormat("yyyy/MM/dd");
		try {
			java.sql.Date sqlDate = new java.sql.Date(formate.parse(yyyyMMdd).getTime());
			return sqlDate;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new java.sql.Date(0);
	}

////把yyyyMMdd格式的字串轉成sql.Date
	public static java.sql.Date ChangeDateFormate(String yyyyMMdd) {
		DateFormat formate = new SimpleDateFormat("yyyyMMdd");
		try {
			java.sql.Date sqlDate = new java.sql.Date(formate.parse(yyyyMMdd).getTime());
			return sqlDate;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new java.sql.Date(0);
	}

////測試上面的幾個方法
	public static void main(String[] args) {
		System.out.println(ChangeDateFormate_Dash("2020-02-31"));
		System.out.println(ChangeDateFormate_Slash("2020/02/31"));
		System.out.println(ChangeDateFormate("20200231"));
		System.out.println(new Timestamp(System.currentTimeMillis()));
	}
}
