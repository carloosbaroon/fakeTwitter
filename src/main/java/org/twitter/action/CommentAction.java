package org.twitter.action;


import java.sql.Date;

import org.twitter.bean.UsuarioBean;
import org.twitter.dao_imp.ComentarioDAOImp;

import com.opensymphony.xwork2.ActionSupport;

public class CommentAction extends ActionSupport {
	private static final long serialVersionUID = -3827439829486925185L;
	// getters and setters...
	private UsuarioBean usuario;
	private String contenido, msg, fecha, idUsuario;
	ComentarioDAOImp dao = null;
	
	@Override
	public String execute() throws Exception {
		System.out.println("Entra");
		System.out.println("Id usuario: "+ idUsuario);
		dao = new ComentarioDAOImp();
		
		msg = dao.registerComment(fecha,contenido);
		return "REGISTER";
	}
	
	
	
	public String getIdUsuario() {
		return idUsuario;
	}



	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}



	public UsuarioBean getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioBean usuario) {
		this.usuario = usuario;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	

	
}

