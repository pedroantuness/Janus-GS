package br.com.fiap.janusGs.data;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.janusGs.model.Paciente;

public class PacienteDao {

	
	
	public static List<Paciente> findAll() throws SQLException {
		List<Paciente> Clientes = new ArrayList<>();	
		
	var con = ConnectionFactory.getConnection();
	var rs = con.createStatement().executeQuery("SELECT * FROM T_HOSP_JANUS_PACIENTE");
	
	while(rs.next()) {
		Clientes.add(new Paciente(
				    rs.getInt("ID_CLIENTE"),
				    rs.getString("NM_CLIENTE"),
				    rs.getDate("DT_NASCIMENTO"),
				    rs.getString("NR_CPF"),
				    rs.getString("DS_EMAIL"),
					rs.getInt("DS_PESO"),
					rs.getInt("DS_ALTURA")
				));
	}
	
	con.close();
		
		return Clientes;
	}

	public static Paciente findById(int id) throws SQLException {
		
		var con = ConnectionFactory.getConnection();
		var rss = con.prepareStatement("SELECT * FROM T_HOSP_JANUS_PACIENTE WHERE id_cliente = ?");
		rss.setInt(1, id);
		var rs = rss.executeQuery();
		rs.next();
		if (rs.isAfterLast()) {
		    return null;
		}
		System.out.println(rs);
		var paciente = new Paciente(
						rs.getInt("ID_CLIENTE"),
				    	rs.getString("NM_CLIENTE"),
				    	rs.getDate("DT_NASCIMENTO"),
				    	rs.getString("NR_CPF"),
				    	rs.getString("DS_EMAIL"),
						rs.getInt("DS_PESO"),
						rs.getInt("DS_ALTURA")
					);
		
		con.close();
		return paciente;
			
		}

	public static void create(Paciente paciente)  throws SQLException {
		var con = ConnectionFactory.getConnection();
		var ps = con.prepareStatement("INSERT INTO FROM T_HOSP_JANUS_PACIENTE (ID_CLIENTE, NM_CLIENTE, DT_NASCIMENTO, NR_CPF, DS_EMAIL, DS_PESO, DS_ALTURA) VALUES (?, ?, ?, ?, ?, ?, ?)");
		ps.setInt(1, paciente.getIdCliente());
		ps.setString(2, paciente.getNmCliente());
		ps.setDate(3, paciente.getDtNascimento());
		ps.setString(4, paciente.getCpf());
		ps.setString(5, paciente.getDsEmail());
		ps.setInt(6, paciente.getDsPeso());
		ps.setInt(7, paciente.getDsAltura());

		ps.executeUpdate();
			
		con.close();
		}
	
	public static void update(Paciente paciente) throws SQLException {
		var con = ConnectionFactory.getConnection();
		var ps = con.prepareStatement("UPDATE T_HOSP_JANUS_PACIENTE SET NM_CLIENTE=?, DT_NASCIMENTO=?, NR_CPF=?, DS_EMAIL=?, DS_PESO=?, DS_ALTURA=? WHERE ID_CLIENTE=?");
		ps.setString(1, paciente.getNmCliente());
		ps.setDate(2, paciente.getDtNascimento());
		ps.setString(3, paciente.getCpf());
		ps.setString(4, paciente.getDsEmail());
		ps.setInt(5, paciente.getDsPeso());
		ps.setInt(6, paciente.getDsAltura());
		ps.setInt(7, paciente.getIdCliente());
		
		ps.executeUpdate();
		con.close();		
	}
	
	 public static void delete(Paciente id) throws SQLException {
	        var con = ConnectionFactory.getConnection();
	        var ps = con.prepareStatement("DELETE FROM T_HOSP_JANUS_PACIENTE WHERE ID_CLIENTE=?");
	        ps.setInt(1, id.getIdCliente());
	        ps.executeUpdate();
	        con.close();
	    }
	

}
