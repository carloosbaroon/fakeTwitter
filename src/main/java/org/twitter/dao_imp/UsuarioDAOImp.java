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
	
private UsuarioBean usuario;
	
	public UsuarioBean getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioBean usuario) {
		this.usuario = usuario;
	}
	
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
	
	public String login(UsuarioBean usuario) throws Exception{
		System.out.println("Entra Login");
		
		String ret = "error";
      
    	try {
	        String sql = "SELECT id_usuario FROM usuario WHERE";
	        sql+=" mail = ? AND password = ?";
	        PreparedStatement ps = myconnection().prepareStatement(sql);
	        ps.setString(1, usuario.getMail());
	        ps.setString(2, usuario.getPassword());
	        ResultSet rs = ps.executeQuery();
	
	        while (rs.next()) {
	        usuario.setId_usuario(rs.getString(1));
	        ret = "success";
	        }
    	}catch(Exception e) {
			e.printStackTrace();
    	}finally {
			if (myconnection() != null) {
				myconnection().close();
			}
		}
      
      return ret;
	}

}

	

	
	
	
	
	

