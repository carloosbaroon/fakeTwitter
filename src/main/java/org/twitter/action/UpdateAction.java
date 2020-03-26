package org.twitter.action;

import org.twitter.dao_imp.ComentarioDAOImp;

import com.opensymphony.xwork2.ActionSupport;
import org.twitter.bean.ComentarioBean;

public class UpdateAction extends ActionSupport {
	private static final long serialVersionUID = -3827439829486925185L;
	// getters and setters
	private String contenidor,id_comentario,msg;
	private ComentarioBean comentario;
	
	
	public String getId_comentario() {
		return id_comentario;
	}

	public void setId_comentario(String id_comentario) {
		this.id_comentario = id_comentario;
	}

	public ComentarioBean getComentario() {
		return comentario;
	}

	public void setComentario(ComentarioBean comentario) {
		this.comentario = comentario;
	}

	ComentarioDAOImp dao = null;

	@Override
	public String execute() throws Exception {
		System.out.println("Entra");
		System.out.println("Contenido: "+ contenidor);
		System.out.println("Id comentario: "+ id_comentario.toString());
		dao = new ComentarioDAOImp();
		setMsg(dao.updateComment(contenidor,id_comentario));
		return "UPDATE";
	}

	public String getMsg() {
		return msg;
	}

	public String getContenidor() {
		return contenidor;
	}

	public void setContenidor(String contenidor) {
		this.contenidor = contenidor;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}