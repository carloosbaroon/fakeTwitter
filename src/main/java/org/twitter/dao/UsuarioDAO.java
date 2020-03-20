package org.twitter.dao;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

	// method for creating connection
	public static Connection myconnection() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost/twitter?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public String registerUser(String uname, String uemail, String upass) throws SQLException, Exception {
		try {
			String sql = "INSERT INTO Usuario(nombre, correo ,contraseña) VALUES (?,?,?)";
			PreparedStatement ps = myconnection().prepareStatement(sql);
			ps.setString(1, uname);
			ps.setString(2, uemail);
			ps.setString(3, upass);
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