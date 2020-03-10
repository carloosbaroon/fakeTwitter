package org.websparrow;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class StrutsJsonAction extends ActionSupport {
	private static final long serialVersionUID = -3385807446537067813L;
	List<StrutsJsonDTO> dtoList = null;
	ResultSet rs = null;
	StrutsJsonDTO dtoObj = null;
	String countryVal = null;

	@Override
	// method for the country data
	public String execute() throws Exception {
		try {
			rs = org.websparrow.StrutsJsonDAO.fetchCountry();

			if (rs != null) {
				dtoList = new ArrayList<StrutsJsonDTO>();
				while (rs.next()) {
					dtoObj = new StrutsJsonDTO();
					dtoObj.setCountry(rs.getString("country"));
					dtoList.add(dtoObj);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "SUCCESS";
	}

	// method for the state data
	public String fetchStateList() throws Exception {
		try {
			rs = org.websparrow.StrutsJsonDAO.fetchState(countryVal.trim());
			if (rs != null) {
				dtoList = new ArrayList<StrutsJsonDTO>();
				while (rs.next()) {
					dtoObj = new StrutsJsonDTO();
					dtoObj.setState(rs.getString("state"));
					dtoList.add(dtoObj);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "SUCCESS";
	}

	public String getCountryVal() {
		return countryVal;
	}

	public void setCountryVal(String countryVal) {
		this.countryVal = countryVal;
	}

	public List<StrutsJsonDTO> getDtoList() {
		return dtoList;
	}

	public void setDtoList(List<StrutsJsonDTO> dtoList) {
		this.dtoList = dtoList;
	}
}