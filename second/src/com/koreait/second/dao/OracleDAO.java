package com.koreait.second.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleDAO {
	//싱글톤패턴
	private static OracleDAO dao = null;
	private OracleDAO() {}
	public OracleDAO getInstance() {
		if(dao == null) {
			dao = new OracleDAO();
		}
		return dao;
	}
//	public static void main(String[] args){
//		OracleDAO o = new OracleDAO();
//		try {
//			o.getConn();
//		} catch (Exception e) {
//			System.out.println("접속 실패");
//		}
//	}
	public Connection getConn() throws Exception {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userName = "hr";
		String password = "koreait2020";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//DB연결
		Connection con = DriverManager.getConnection(url, userName, password);
		// 암기 필요
		// SQL : preparestatement
		// resultset : db로 부터 read
		
//		try {
//			// 드라이버가 여러개 있으면 필요함
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			con = DriverManager.getConnection(url, userName, password);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		System.out.println("접속 성공");
		return con;
	}
	
	public void closeConn(Connection conn){
		if(conn != null) {
			try {
				conn.close();
			} catch(Exception e) {}
		}
	}
}
