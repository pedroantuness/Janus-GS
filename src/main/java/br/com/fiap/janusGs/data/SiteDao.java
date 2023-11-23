package br.com.fiap.janusGs.data;

import java.sql.SQLException;

import br.com.fiap.janusGs.model.Site;

public class SiteDao {

	private static void createMedico(Site site) throws SQLException {
		var con = ConnectionFactory.getConnection();
		
		var medico = con.prepareStatement("SELECT * FROM T_HOSP_JANUS_MEDICO WHERE nr_crm=?");
		medico.setInt(1, site.getMedico().getCrm());
		var rs = medico.executeQuery();
		rs.next();
		
		if (rs.isAfterLast()) {
			var ps = con.prepareStatement("INSERT INTO T_HOSP_JANUS_MEDICO VALUES (?, ?, ?, ?)");
			ps.setInt(1, site.getMedico().getIdMedico());
			ps.setString(2, site.getMedico().getNmMedico());
			ps.setInt(3, site.getMedico().getCrm());
			ps.setString(4, site.getMedico().getUnidadadeFederativa());
			ps.executeUpdate(); 
		}
		
		con.close();
	}
	
	private static void createRemedio(Site site) throws SQLException {
		var con = ConnectionFactory.getConnection();
		
		var ps = con.prepareStatement("INSERT INTO T_HOSP_JANUS_REMEDIO VALUES (?, ?, ?, ?, ?, ?)");
		ps.setInt(1, site.getRemedio().getIdRemedio());
		ps.setInt(2, site.getPaciente().getIdPaciente());
		ps.setString(3, site.getRemedio().getNmRemedio());
		ps.setString(4, site.getRemedio().getDtInicio());
		ps.setString(5, site.getRemedio().getDtFim());
		ps.setInt(6, site.getRemedio().getIntervalo());
		var rs = ps.executeQuery();
		rs.next();	
		
		con.close();
	}
	
	private static void createSintomas(Site site) throws SQLException {
		var con = ConnectionFactory.getConnection();

		var ps = con.prepareStatement("INSERT INTO T_HOSP_JANUS_SINTOMAS VALUES (?, ?, ?, ?, ?)");
		ps.setInt(1, site.getSintomas().getIdSintoma());
		ps.setInt(2, site.getPaciente().getIdPaciente());
		ps.setString(3, site.getSintomas().getDsSintoma());
		ps.setString(4, site.getSintomas().getDtInicio());
		ps.setString(5, site.getSintomas().getDtFim());
		var rs = ps.executeQuery();
		rs.next();	
		
		con.close();
	}

	private static void createConsulta(Site site) throws SQLException {
		var con = ConnectionFactory.getConnection();

		var ps = con.prepareStatement("INSERT INTO T_HOSP_JANUS_CONSULTA VALUES (?, ?, ?, ?)");
		ps.setInt(1, site.getConsulta().getIdConsulta());
		ps.setInt(2, site.getPaciente().getIdPaciente());
		ps.setInt(3, site.getMedico().getIdMedico());
		ps.setString(4, site.getConsulta().getDtConsulta());
		ps.executeUpdate();
		
		con.close();
	}
	
	public static void create(Site site) throws SQLException {
		createMedico(site);
		createRemedio(site);
		createSintomas(site);
		createConsulta(site);		
	}
}
