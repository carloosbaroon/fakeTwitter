package org.twitter.action;

import org.twitter.dao_imp.ComentarioDAOImp;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateAction extends ActionSupport {
	private static final long serialVersionUID = -3827439829486925185L;
	// getters and setters
	private String contenido,msg;
	
	ComentarioDAOImp dao = null;

	@Override
	public String execute() throws Exception {
		dao = new ComentarioDAOImp();
		msg = dao.updateUser(contenido);
		return "UPDATE";
	}
}