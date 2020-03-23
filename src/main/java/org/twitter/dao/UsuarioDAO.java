package org.twitter.dao;

import java.sql.Connection;
import java.sql.SQLException;


import org.twitter.bean.UsuarioBean;

public interface UsuarioDAO {
	public Connection myconnection() throws Exception;
	public UsuarioBean verificarUsuario(UsuarioBean usuario) throws Exception;
	public boolean confirmarExistenciaID(String id) throws Exception;
	public String registerUser(String uname, String uemail, String upass) throws SQLException, Exception;
	public UsuarioBean buscar(String id) throws Exception;
	
}
