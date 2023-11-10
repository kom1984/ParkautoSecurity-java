package com.parkauto.parkauto.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name = "CAMION")
public class Camion extends Vehicule{	
	
	@Override
	public String demarrer() {
		return "BRRRRRRRRRR";
	}
	
	
	@Override
	public String accelerer() {
		return "BROUMMMMM";
	}


	public Camion() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Camion(Long id, String anneeModel, String marqueVehicule, double prix, List<Location> locationList,
			List<Lignecmd> lignecmd, List<Agence> agenceList, ModeleVehicule modele) {
		super(id, anneeModel, marqueVehicule, prix, locationList, lignecmd, agenceList, modele);
		// TODO Auto-generated constructor stub
	}


	public Camion(String anneeModel, String marqueVehicule, double prix, List<Location> locationList,
			List<Lignecmd> lignecmd, List<Agence> agenceList, ModeleVehicule modele) {
		super(anneeModel, marqueVehicule, prix, locationList, lignecmd, agenceList, modele);
		// TODO Auto-generated constructor stub
	}


	


	




	

	
	
	
	
}

