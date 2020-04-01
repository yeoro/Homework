package common.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ConnectionFactory {
	/**
	 *  연결작업 처리하기
	 */
	
	public static Connection getConnection() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		return DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/scott?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8",
					"ssafy", 
					"ssafy"
				);
	}
	
	public static void close(PreparedStatement pstmt, Connection con) {
		try {
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
