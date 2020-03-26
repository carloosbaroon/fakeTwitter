package org.twitter.bean;

import java.sql.Timestamp;

public class RespuestaBean {
	
	private String id_respuesta, id_usuario, contenido, nombre_usuario;
	private Timestamp date;
	
	public String getId_respuesta() {
		return id_respuesta;
	}
	public void setId_respuesta(String id_respuesta) {
		this.id_respuesta = id_respuesta;
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
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}

}
