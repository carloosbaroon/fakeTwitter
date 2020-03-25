package org.twitter.dao_imp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class ComentarioDAOImp {
	
	
	public static Connection myconnection() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost/twitter?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public String registerComment(String fecha, String contenido) throws SQLException, Exception {
		try {
			String sql = "INSERT INTO Comentario2 (fecha, contenido)";
	        sql+="VALUES (?, ?)";
			PreparedStatement ps = myconnection().prepareStatement(sql);
			
			ps.setString(1, fecha);
			ps.setString(2, contenido);
			
			ps.executeUpdate();
			return "Registration Successful";
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		} finally {
			if (myconnection() != null) {
				myconnection().close();
			}
		}
	}

}
