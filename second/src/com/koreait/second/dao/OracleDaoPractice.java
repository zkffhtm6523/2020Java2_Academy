package com.koreait.second.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleDaoPractice {
//	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
//	private static final String user = "root";
//	private static final String password = "root";
//	
//	public static Connection getCon() throws Exception{
//		Connection con = DriverManager.getConnection(url, user, password);
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		return con;
//	}
//	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
//	private static final String user = "root";
//	private static final String password = "root";
//	
//	public static Connection getCon() throws Exception{
//		Connection con = DriverManager.getConnection(url, user, password);
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		return con;
//	}
//	private static OracleDaoPractice dao = null;
//	private OracleDaoPractice() {}
//	public OracleDaoPractice getInstance() {
//		if (dao == null) {
//			dao = new OracleDaoPractice();
//		}
//		return dao;
//	}
//	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
//	private static final String user = "root";
//	private static final String password = "root";
//	
//	public static Connection getCon() throws Exception{
//		Connection con  = DriverManager.getConnection(url, user, password);
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		return con;
//	}
//	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
//	private static final String user = "root";
//	private static final String password = "root";
//	
//	public static Connection getCon() throws Exception{
//		Connection con = DriverManager.getConnection(url, user, password);
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		return con;
//	}
//	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
//	private static final String USER = "root";
//	private static final String PASSWORD = "root";
//	
//	public static Connection getCon() throws Exception{
//		Connection con = DriverManager.getConnection(url, user, password);
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		return con;
//	}
//	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
//	private static final String USER = "root";
//	private static final String PASSWORD = "root";
//
//	public static Connection getCon() throws Exception{
//		Connection con = DriverManager.getConnection(URL,USER,PASSWORD);
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		return con;
//	}
	
//	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
//	private static final String USER = "root";
//	private static final String PASSWORD = "root";
//	
//	public static Connection getCon() throws Exception{
//		Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		return con;
//	}
	
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "root";
	private static final String password = "root";
	
	public static Connection getCon() throws Exception{
		Connection con = DriverManager.getConnection(URL, USER, password);
		Class.forName("oracle.jdbc.driver.OracleDriver");
		return con;
	}
	public static void closeCon(Connection con) {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

