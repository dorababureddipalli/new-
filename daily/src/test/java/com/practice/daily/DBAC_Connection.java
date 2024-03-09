package com.practice.daily;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class DBAC_Connection {

	public void db_connection() {
		try {
			//Class.forName("oracle.jdbc.driver.oracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "dorababureddipalli",
					"dora123");
			Statement stmt = con.createStatement();
			//stmt.execute("insert into student values(58,'siri',81)");
			//System.out.println("one row inserted successfully...");
			ResultSet rs = stmt.executeQuery("select * from student order by rollno");
			ResultSetMetaData rm = rs.getMetaData();
			int length = rm.getColumnCount();
			for (int i = 1; i <= length; i++) {
				System.out.print(rm.getColumnName(i) + "\t");
			}
			System.out.println();
			while (rs.next()) {
				for (int i = 1; i <= length; i++) {
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
