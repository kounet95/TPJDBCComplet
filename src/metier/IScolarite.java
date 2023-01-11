package metier;

import java.util.*;

public interface IScolarite {
public void addEtudiant(Etudiant e);
public List<Etudiant> listEtudiants();
public List<Etudiant> etudiantsParcMC(String mc);
public Etudiant getEtudiant(Long id);
public void updateEtudiant (Etudiant e);
public void deleteEtudiant(Long id);
}
