package org.twitter.action;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.twitter.bean.ComentarioBean;
import org.twitter.dao_imp.ComentarioDAOImp;

import com.opensymphony.xwork2.ActionSupport;

public class ReportAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	ResultSet rs = null;
	ComentarioBean bean = null;
	List<ComentarioBean> beanList = null;
	ComentarioDAOImp admin = new ComentarioDAOImp();

	@Override
	public String execute() throws Exception {
		try {
			beanList = new ArrayList<ComentarioBean>();
			rs = admin.report();
			if (rs != null) {
				while (rs.next()) {
					bean = new ComentarioBean();
					bean.setId_usuario(rs.getString("id_usuario"));
					bean.setFecha(rs.getDate("date"));
					bean.setContenido(rs.getString("contenido"));
					beanList.add(bean);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "REPORT";
	}

	public List<ComentarioBean> getBeanList() {
		return beanList;
	}

	public void setBeanList(List<ComentarioBean> beanList) {
		this.beanList = beanList;
	}
}

