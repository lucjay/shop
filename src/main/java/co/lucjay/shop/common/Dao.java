package co.lucjay.shop.common;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dao {

	public static Connection getConnection() {
		try {
			String user = "lucjay";
			String pw = "lucjay";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			return DriverManager.getConnection(url, user, pw);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
