package org.twitter.action;

import org.twitter.bean.UsuarioBean;
import org.twitter.dao.UsuarioDAO;
import org.twitter.dao_imp.UsuarioDAOImp;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	   private UsuarioBean usuario;
	   
	   public UsuarioBean getUsuario() {
	      return usuario;
	   }

	   public void setUsuario(UsuarioBean usuario) {
	      this.usuario = usuario;
	   }
	   
	   public String execute() {
	      String ret = ERROR;
		  UsuarioDAO userDao = new UsuarioDAOImp();
		  //userDao.setUsario(usuario);
		  
		  System.out.println(usuario.getMail() + usuario.getPassword());
		 
	      try {
	    	  ret = userDao.login(usuario);
	    	  System.out.println("ret: "+ ret);
	    	  if(ret == "success") {
	    		  ret = SUCCESS;
	    	  }else {
	    		  ret = ERROR;
	    	  }
	    	  
	      } catch (Exception e) {
			 e.printStackTrace();
	         ret = ERROR;
	      }
	      return ret;
	   }

}
