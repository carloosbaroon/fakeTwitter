package org.twitter.dao_imp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.twitter.database.Conexion;


import org.twitter.dao.UsuarioDAO;
import org.twitter.bean.UsuarioBean;


public class UsuarioDAOImp extends Conexion implements UsuarioDAO{
	
	
	public static Connection myconnection() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost/twitter?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	

	@Override
	public void insertar(UsuarioBean usuario) throws Exception {
		System.out.println("Entro");
		try {
			  String sql = "INSERT INTO Usuario (name, mail, password)";
		        sql+="VALUES (?, ?, ?)";
		        
		        PreparedStatement ps = myconnection().prepareStatement(sql);
		        ps.setString(1, usuario.getName());
		        ps.setString(2, usuario.getMail());
		        ps.setString(3, usuario.getPassword());
		        
		        System.out.println(usuario.getName());
		        System.out.println(usuario.getMail());
		        System.out.println(usuario.getPassword());
		        
		        ps.execute();
		}
		catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			if (myconnection() != null) {
				myconnection().close();
			}
		}
      

     
	}

}

	

	
	
	
	
	

