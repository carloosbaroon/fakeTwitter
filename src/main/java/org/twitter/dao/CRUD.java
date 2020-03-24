package org.twitter.dao;

import org.twitter.bean.UsuarioBean;

public interface CRUD<T> {
	public void insertar(T entidad) throws Exception;

}
