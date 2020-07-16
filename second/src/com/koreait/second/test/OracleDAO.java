package com.koreait.second.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleDAO {
	private static OracleDAO dao = null;
	private OracleDAO() {}
	public OracleDAO getInstance() {
		if (dao == null) {
			dao = new OracleDAO();
		}
		return dao;
	}
	
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String userName = "hr";
	private static String password = "1234";
	
	public static Connection getConn() throws Exception{
		Connection conn = DriverManager.getConnection(url, userName, password);
		Class.forName("oracle.jdbc.driver.OracleDriver");
		return conn;
	}
	
	public static void closeConn(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
