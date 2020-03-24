package org.twitter.action;

import org.twitter.dao_imp.UsuarioDAOImp;

import com.opensymphony.xwork2.ActionSupport;



import org.twitter.bean.UsuarioBean;
import org.twitter.dao_imp.UsuarioDAOImp;

import org.twitter.dao.UsuarioDAO;

public class RegisterAction extends ActionSupport{
	private UsuarioBean usuario;
	public void setUsuario(UsuarioBean usuario) {this.usuario = usuario;}

	public UsuarioBean getUsuario() {return usuario;}

	private static final long serialVersionUID = -3827439829486925185L;

	private String uname, uemail, upass, msg;
	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUpass() {
		return upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	UsuarioDAOImp dao = null;

	@Override
	public String execute() throws Exception {
		
		
		try {
			dao = new UsuarioDAOImp();
			msg = dao.registerUser(uname, uemail, upass);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			msg = "Error al crear paciente";
			return ERROR;
		}
		
	}
	
	
	
	
	
	

	
	

}





