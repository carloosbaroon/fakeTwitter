package org.twitter.action;



import org.twitter.bean.UsuarioBean;
import org.twitter.dao_imp.ComentarioDAOImp;

import com.opensymphony.xwork2.ActionSupport;

public class CommentAction extends ActionSupport {
	private static final long serialVersionUID = -3827439829486925185L;
	// getters and setters...
	private UsuarioBean usuario;
	private String contenido, msg, id, nombre;
	ComentarioDAOImp dao = null;
	
	@Override
	public String execute() throws Exception {
		System.out.println("Entra");
		System.out.println("Id usuario: "+ id.toString());
		System.out.println("Nombre usuario: "+ nombre.toString());
		dao = new ComentarioDAOImp();
		
		msg = dao.registerComment(id,contenido, nombre);
		return "REGISTER";
	}
	
	public UsuarioBean getUsuario() {
		return usuario;
	}
	
	public void setUsuario(UsuarioBean usuario) {
		this.usuario = usuario;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	

	

	
}

