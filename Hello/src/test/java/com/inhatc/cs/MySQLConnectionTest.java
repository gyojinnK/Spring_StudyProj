package com.inhatc.cs;

import java.sql.*;

import org.junit.Test;

public class MySQLConnectionTest {
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = 
			"jdbc:mysql://127.0.0.1:3306/basicboard?serverTimezone=UTC&characterEncoding=UTF-8&useSSL=false"; 
	private static final String USER = "root";
	private static final String PW = "kang063606!";
	
	@Test
	public void testConnection() throws Exception{
		Class.forName(DRIVER);
		try (Connection con = DriverManager.getConnection(URL, USER, PW)){
				System.out.println(con);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
