package com.parkauto.parkauto.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="vehicule")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Vehicule {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IDVEHICULE")
	private Long id;
	
	@Column(name = "ANNEEMODEL")
	private String anneeModel;
	
	@Column(name = "MARQUEVEHICULE")
	private String marqueVehicule;
	
	@Column(name = "PRIX")
	private double prix;
	
	@JsonIgnore
	@ManyToMany
	@JoinTable(name="location_vehicule")
	private List<Location> locationList;
	
	@OneToMany(mappedBy="vehicule")
	private List<Lignecmd> lignecmd;
	
	@ManyToMany
	@JoinTable(name="agence_vehicule")
	private List<Agence> agenceList;
	
	
	@ManyToOne
	@JoinColumn(name="modele_id")
	private ModeleVehicule modele;
	
	
	
	public ModeleVehicule getModele() {
		return modele;
	}

	public void setModele(ModeleVehicule modele) {
		this.modele = modele;
	}

	public Vehicule(String anneeModel, String marqueVehicule, double prix, List<Location> locationList,
			List<Lignecmd> lignecmd, List<Agence> agenceList, ModeleVehicule modele) {
		super();
		this.anneeModel = anneeModel;
		this.marqueVehicule = marqueVehicule;
		this.prix = prix;
		this.locationList = locationList;
		this.lignecmd = lignecmd;
		this.agenceList = agenceList;
		this.modele = modele;
	}

	public Vehicule(Long id, String anneeModel, String marqueVehicule, double prix, List<Location> locationList,
			List<Lignecmd> lignecmd, List<Agence> agenceList, ModeleVehicule modele) {
		super();
		this.id = id;
		this.anneeModel = anneeModel;
		this.marqueVehicule = marqueVehicule;
		this.prix = prix;
		this.locationList = locationList;
		this.lignecmd = lignecmd;
		this.agenceList = agenceList;
		this.modele = modele;
	}

	public Vehicule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Agence> getAgenceList() {
		return agenceList;
	}

	public void setAgenceList(List<Agence> agenceList) {
		this.agenceList = agenceList;
	}

	@Override
	public String toString() {
		return "Vehicule [id=" + id + ", anneeModel=" + anneeModel + ", marqueVehicule=" + marqueVehicule + ", prix="
				+ prix + ", locationList=" + locationList + ", lignecmd=" + lignecmd + ", agenceList=" + agenceList
				+ "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAnneeModel() {
		return anneeModel;
	}

	public void setAnneeModel(String anneeModel) {
		this.anneeModel = anneeModel;
	}

	public String getMarqueVehicule() {
		return marqueVehicule;
	}

	public void setMarqueVehicule(String marqueVehicule) {
		this.marqueVehicule = marqueVehicule;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public List<Location> getLocationList() {
		return locationList;
	}

	public void setLocationList(List<Location> locationList) {
		this.locationList = locationList;
	}

	public List<Lignecmd> getLignecmd() {
		return lignecmd;
	}

	public void setLignecmd(List<Lignecmd> lignecmd) {
		this.lignecmd = lignecmd;
	}

	public String demarrer() {
		return "Véhicule démarré";
	}
	
	public String accelerer() {
		return "Véhicule accéleré";
	}
	

	
}
