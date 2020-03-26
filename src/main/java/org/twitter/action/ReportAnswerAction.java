package org.twitter.action;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.twitter.bean.RespuestaBean;
import org.twitter.dao_imp.ComentarioDAOImp;

import com.opensymphony.xwork2.ActionSupport;

public class ReportAnswerAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	ResultSet rs = null;
	RespuestaBean bean = null;
	List<RespuestaBean> beanList = null;
	ComentarioDAOImp admin = new ComentarioDAOImp();

	@Override
	public String execute() throws Exception {
		try {
			beanList = new ArrayList<RespuestaBean>();
			rs = admin.reportAns();
			if (rs != null) {
				while (rs.next()) {
					bean = new RespuestaBean();
					bean.setNombre_usuario(rs.getString("nombre_usuario"));
					bean.setDate(rs.getTimestamp("date"));
					bean.setContenido(rs.getString("contenido"));
					bean.setId_respuesta(rs.getString("id_respuesta"));
					beanList.add(bean);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "REPORT";
	}

	public List<RespuestaBean> getBeanList() {
		return beanList;
	}

	public void setBeanList(List<RespuestaBean> beanList) {
		this.beanList = beanList;
	}
}

