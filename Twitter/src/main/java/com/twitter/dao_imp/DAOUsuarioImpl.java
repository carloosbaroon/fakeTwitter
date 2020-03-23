package com.twitter.dao_imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.twitter.database.Conexion;


import com.twitter.dao.DAOUsuario;
import com.twitter.bean.UsuarioBean;


public class DAOUsuarioImpl extends Conexion implements DAOUsuario{
	

	@Override
	public void insertar(UsuarioBean usuario) throws Exception {
		Connection conn = null;
	      
   	 	establishConnection();
        conn = getCon();
        String sql = "INSERT INTO usuario (nombre, correo, contraseña)";
        sql+="VALUES (?, ?, ?)";
        
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, usuario.getId_usuario());
        ps.setString(2, usuario.getNombre());
        ps.setString(3, usuario.getCorreo());
     
        
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