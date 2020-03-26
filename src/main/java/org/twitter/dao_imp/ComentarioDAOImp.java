package org.twitter.dao_imp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.twitter.bean.UsuarioBean;
import org.twitter.bean.ComentarioBean;


public class ComentarioDAOImp {
	
	private UsuarioBean usuario;
	private ComentarioBean comentario;
	
	public ComentarioBean getComentario() {
		return comentario;
	}

	public void setComentario(ComentarioBean comentario) {
		this.comentario = comentario;
	}

	public UsuarioBean getUsuario() {
		return usuario;
	}
	
	public static Connection myconnection() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost/twitter?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "014420200116145966");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public String registerComment(String id, String contenido, String nombreUser) throws SQLException, Exception {
		try {
			String sql = "INSERT INTO Comentario (id_usuario, date, contenido, nombre_usuario)";
	        sql+="VALUES (?, NOW(), ?, ?)";
			PreparedStatement ps = myconnection().prepareStatement(sql);
			//System.out.println("Id usuario: "+ usuario.getId_usuario());
			ps.setString(1, id);
			ps.setString(2, contenido);
			ps.setString(3, nombreUser);
			
			ps.executeUpdate();
			return "Registration Successful";
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		} finally {
			if (myconnection() != null) {
				myconnection().close();
			}
		}
	}
	public String registerAnswer(String ida, String contenidoa, String nombreUsera) throws SQLException, Exception {
		try {
			String sql = "INSERT INTO respuesta2 (date, contenido,id_usuario, nombre_usuario)";
	        sql+="VALUES (NOW(), ?, ?, ?)";
			PreparedStatement ps = myconnection().prepareStatement(sql);
			//System.out.println("Id usuario: "+ usuario.getId_usuario());
			ps.setString(1, contenidoa);
			ps.setString(2, ida);
			ps.setString(3, nombreUsera);
			
			ps.executeUpdate();
			return "Registration Successful";
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		} finally {
			if (myconnection() != null) {
				myconnection().close();
			}
		}
	}
	
	public ResultSet report() throws SQLException, Exception {
		ResultSet rs = null;
		try {
			String sql = "SELECT nombre_usuario,date,contenido,id_comentario FROM Comentario";
			PreparedStatement ps = myconnection().prepareStatement(sql);
			rs = ps.executeQuery(sql);
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (myconnection() != null) {
				myconnection().close();
			}
		}
	}
	
	

	public String updateComment(String contenido, String id) throws SQLException, Exception {

		try {
			
			String sql = "UPDATE Comentario SET contenido= ?, date= NOW()";
			PreparedStatement ps = myconnection().prepareStatement(sql);
			ps.setString(1, contenido);
			
			
			ps.executeUpdate();
			return "Update Successful";
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		} finally {
			if (myconnection() != null) {
				myconnection().close();
			}
		}
	}
	
	public String deleteTweet(String idComent) throws SQLException, Exception {
		try {
			String sql = "DELETE FROM Comentario WHERE id_comentario=?";
			PreparedStatement ps = myconnection().prepareStatement(sql);
			ps.setString(1, idComent);
			ps.executeUpdate();
			return "Delete Successful";
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		} finally {
			if (myconnection() != null) {
				myconnection().close();
			}
		}
	}

}
