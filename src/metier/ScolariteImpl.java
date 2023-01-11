package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.SingletonConnection;

public class ScolariteImpl implements IScolarite {

	@Override
	public void addEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Etudiant> listEtudiants() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Etudiant> etudiantsParcMC(String mc) {
	List<Etudiant> etuds =new ArrayList<Etudiant>();
	Connection conn = SingletonConnection.getConnection();
	try {
		PreparedStatement ps = conn.prepareStatement("select * from ETUDIANTS where nom like ?");
		ps.setString(1, "%"+ mc + "%");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			Etudiant et = new Etudiant ();
			et.setIdEtudiant(rs.getLong("id_etu"));
	    	et.setNom(rs.getString("nom"));
	    	et.setPrenom(rs.getString("prenom"));
	    	et.setEmail(rs.getString("email"));
	    	et.setVille(rs.getString("ville"));
	    	etuds.add(et);
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
		return etuds;
	}

	@Override
	public Etudiant getEtudiant(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEtudiant(Long id) {
		// TODO Auto-generated method stub
		
	}

}
