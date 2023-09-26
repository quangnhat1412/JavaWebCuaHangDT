package dao;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
	// Tạo phương thức kết nối với cơ sở dữ liệu
	public static Connection getConnection() {
		Connection conn = null;
		try {
			// Đăng ký My SQL Driver với DriverManager
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			// Các thông số của CSDL
			String url = "jdbc:mySQL://localhost:3306/cuahangdt";
			String username = "root";
			String password = "";
			
			// tạo kết nối
			conn = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			System.out.println("Kết nối CSDL thất bại");
			e.printStackTrace();
		}
		return conn;
	}
	public static void closeConnection(Connection c) {
		try {
			if(c!=null) {
				c.close();
			}
		} catch (Exception e) {
			System.out.println("Đóng CSDL thất bại");
			e.printStackTrace();
		}
	}
	
	public static void printInfo(Connection c) {
		try {
			if(c!=null) {
				DatabaseMetaData mtdt = c.getMetaData();
				System.out.println(mtdt.getDatabaseProductName());
				System.out.println(mtdt.getDatabaseProductVersion());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
