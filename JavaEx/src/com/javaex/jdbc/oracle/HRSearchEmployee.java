package com.javaex.jdbc.oracle;

import java.util.Scanner;
import java.sql.*;

public class HRSearchEmployee {
	private static String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		System.out.print("검색어:");
		String keyword = scanner.next();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, "HR", "hr");
			String sql = "SELECT first_name || ' ' || last_name as name, " +
					" email, phone_number, hire_date FROM employees " +
					" WHERE lower(first_name) LIKE '%" + keyword.toLowerCase() + "%' OR " +
					" lower(last_name) LIKE '%" + keyword.toLowerCase() + "%'";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				String name = rs.getString("name");
				String email = rs.getString("email");
				String phoneNumber = rs.getString("phone_number");
				String hireDate = rs.getString("hire_date");
				
				System.out.printf("%s: %s, %s, %s%n",
						name, email, phoneNumber, hireDate);
			}
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패!");
		} catch (SQLException e) {
			System.err.println("SQLError!");
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
