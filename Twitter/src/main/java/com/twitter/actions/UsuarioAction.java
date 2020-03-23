package com.twitter.actions;

import java.util.ArrayList;


import com.opensymphony.xwork2.ActionSupport;


import com.twitter.bean.UsuarioBean;
import com.twitter.dao_imp.DAOUsuarioImpl;
import com.twitter.dao.DAOUsuario;

public class UsuarioAction extends ActionSupport {
	
	private UsuarioBean usuario;
	private String msg;
	public UsuarioBean getUsuario() {return usuario;}
	public void setUsuario(UsuarioBean usuario) {this.usuario = usuario;}
	
	public String crearUsuario() {
		DAOUsuario daoUsuario= new DAOUsuarioImpl();
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
