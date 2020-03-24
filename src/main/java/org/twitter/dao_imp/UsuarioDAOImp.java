package org.twitter.dao_imp;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.twitter.bean.UsuarioBean;

import org.twitter.dao.UsuarioDAO;

public class UsuarioDAOImp implements UsuarioDAO{

	// method for creating connection
	@Override
	public  Connection myconnection() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost/twitter?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public  String registerUser(String uname, String uemail, String upass) throws SQLException, Exception {
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
	@Override
	public UsuarioBean verificarUsuario(UsuarioBean usuario) throws Exception {	
	     
			
				 String sql = "SELECT id_usuario,correo,contraseña FROM usuario WHERE";
		         sql+=" id_usuario = ? AND correo = ? AND password_user = ?";
		         PreparedStatement ps = myconnection().prepareStatement(sql);
		         ps.setString(1, usuario.getUsuarioid());
		         ps.setString(2, usuario.getUpass());
		         ps.setString(3, usuario.getUemail());
		         ResultSet rs = ps.executeQuery();

	        
	 			if (myconnection() != null) {
	 				myconnection().close();
	 			}
	      
	      return usuario;
	}
	
	@Override
	public boolean confirmarExistenciaID(String id) throws Exception {
	
	      
  
        String sql = "SELECT * FROM usuario WHERE";
        sql+=" id_usuario = ?";
        PreparedStatement ps = myconnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        
        while (rs.next()) {
        	return true;
        }

        if (myconnection() != null) {
			myconnection().close();
		}
		return false;
	}
	@Override
	public UsuarioBean buscar(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	

	
	
	
	
	

}