package org.twitter.action;

import org.twitter.dao.UsuarioDAO;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{

	private static final long serialVersionUID = -3827439829486925185L;
	// getters and setters...
	private String uname, uemail, upass, msg;
	UsuarioDAO dao = null;

	@Override
	public String execute() throws Exception {
		dao = new UsuarioDAO();
		msg = dao.registerUser(uname, uemail, upass);
		return "REGISTER";
	}

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

	public UsuarioDAO getDao() {
		return dao;
	}

	public void setDao(UsuarioDAO dao) {
		this.dao = dao;
	}

}





