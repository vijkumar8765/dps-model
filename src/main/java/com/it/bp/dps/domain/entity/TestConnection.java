package com.it.bp.dps.domain.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestConnection {

	private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String USERNAME = "scott";
	private static final String PASSWORD = "tiger";
	
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				if(con != null){
					ps = con.prepareStatement("SELECT * FROM EMP");
					if(ps != null){
						rs = ps.executeQuery();
						if(rs != null){
							while(rs.next()){
								System.out.println(rs.getInt(1) + " " + rs.getString(2) + "\n");
							}
						}else{
							System.out.println("ResultSet is null......");
						}	
					}else{
						System.out.println("PreparedStatement is null......");
					}
				}else{
					System.out.println("Connection is null......");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally{
			try {
				if(rs != null){System.out.println("ResultSet closed.........");rs.close();}
				if(ps != null){System.out.println("PreparedStatement closed.........");ps.close();}
				if(con != null){System.out.println("Connection closed.........");con.close();}
			} catch (Exception e2) {
			}
		}
	}
}
