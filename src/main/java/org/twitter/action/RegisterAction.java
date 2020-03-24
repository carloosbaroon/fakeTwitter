package org.twitter.action;

import java.util.ArrayList;


import com.opensymphony.xwork2.ActionSupport;


import org.twitter.bean.UsuarioBean;
import org.twitter.dao_imp.UsuarioDAOImp;
import org.twitter.dao.UsuarioDAO;

public class RegisterAction extends ActionSupport {
	
	private UsuarioBean usuario;
	private String msg;
	public UsuarioBean getUsuario() {return usuario;}
	public void setUsuario(UsuarioBean usuario) {this.usuario = usuario;}
	
	public String crearUsuario() {
		UsuarioDAO daoUsuario= new UsuarioDAOImp();
		try {
			daoUsuario.insertar(usuario);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			msg = "Error al crear usuario";
			return ERROR;
		}
	}


}




