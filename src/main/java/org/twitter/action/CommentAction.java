package org.twitter.action;


import java.sql.Date;

import org.twitter.dao_imp.ComentarioDAOImp;

import com.opensymphony.xwork2.ActionSupport;

public class CommentAction extends ActionSupport {
	private static final long serialVersionUID = -3827439829486925185L;
	// getters and setters...
	private String contenido, msg;
	private String fecha;
	ComentarioDAOImp dao = null;

	@Override
	public String execute() throws Exception {
		dao = new ComentarioDAOImp();
		msg = dao.registerComment(fecha,contenido);
		return "REGISTER";
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

