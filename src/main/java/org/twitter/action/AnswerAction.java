package org.twitter.action;



import org.twitter.bean.UsuarioBean;
import org.twitter.dao_imp.ComentarioDAOImp;

import com.opensymphony.xwork2.ActionSupport;

public class AnswerAction extends ActionSupport {
	private static final long serialVersionUID = -3827439829486925185L;
	// getters and setters...
	private UsuarioBean usuario;
	private String contenidoa, msg, ida, nombrea;
	ComentarioDAOImp dao = null;
	
	@Override
	public String execute() throws Exception {
		System.out.println("Respuesta");
		System.out.println("Id usuario: "+ ida.toString());
		System.out.println("Nombre usuario: "+ nombrea.toString());
		System.out.println("Contenido: "+ contenidoa.toString());
		dao = new ComentarioDAOImp();
		
		msg = dao.registerAnswer(ida,contenidoa, nombrea);
		return "REGISTER ANSWER";
	}
	
	public UsuarioBean getUsuario() {
		return usuario;
	}
	
	public void setUsuario(UsuarioBean usuario) {
		this.usuario = usuario;
	}

	public String getContenidoa() {
		return contenidoa;
	}

	public void setContenidoa(String contenidoa) {
		this.contenidoa = contenidoa;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getIda() {
		return ida;
	}

	public void setIda(String ida) {
		this.ida = ida;
	}

	public String getNombrea() {
		return nombrea;
	}

	public void setNombrea(String nombrea) {
		this.nombrea = nombrea;
	}

	

	
}