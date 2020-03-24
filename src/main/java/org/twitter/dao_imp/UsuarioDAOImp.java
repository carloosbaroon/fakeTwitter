package org.twitter.dao_imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.twitter.database.Conexion;


import org.twitter.dao.UsuarioDAO;
import org.twitter.bean.UsuarioBean;


public class UsuarioDAOImp extends Conexion implements UsuarioDAO{
	

	@Override
	public void insertar(UsuarioBean usuario) throws Exception {
		Connection conn = null;
	      
   	 	establishConnection();
        conn = getCon();
        String sql = "INSERT INTO usuario (nombre, correo, contraseña)";
        sql+="VALUES (?, ?, ?)";
        
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, usuario.getNombre());
        ps.setString(2, usuario.getCorreo());
        ps.setString(3, usuario.getContraseña());
     
        
        ps.execute();

        if (conn != null) {
           try {
              closeConnection();
           } catch (Exception e) {
				e.printStackTrace();
           }
        }
	}

}

	

	
	
	
	
	

