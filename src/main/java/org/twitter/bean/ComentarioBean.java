package org.twitter.bean;

import java.sql.Date;

public class ComentarioBean {
	
	private String id_comentario, id_usuario, contenido;
	private Date fecha;
	public String getId_comentario() {
		return id_comentario;
	}
	public void setId_comentario(String id_comentario) {
		this.id_comentario = id_comentario;
	}
	public String getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(String id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
