package com.twitter.dao;

import com.twitter.bean.UsuarioBean;

public interface CRUD<T> {
	public void insertar(T entidad) throws Exception;

}
