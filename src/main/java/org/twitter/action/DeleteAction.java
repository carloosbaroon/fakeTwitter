package org.twitter.action;

import org.twitter.dao_imp.ComentarioDAOImp;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteAction extends ActionSupport{
	private String id_comentario, msg;

	public String getId_comentario() {
		return id_comentario;
	}

	public void setId_comentario(String id_comentario) {
		this.id_comentario = id_comentario;
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String execute() throws Exception {
		System.out.println("Entra a delete?");
		ComentarioDAOImp dao = new ComentarioDAOImp();
		System.out.println("Id usuario: "+ id_comentario);
		msg = dao.deleteTweet(id_comentario);
		return "DELETE";
	}

}
