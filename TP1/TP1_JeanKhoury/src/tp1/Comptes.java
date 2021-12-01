package tp1;

import java.util.ArrayList;

public abstract class Comptes implements Comparable<Comptes> {
	String prenom;
	String nom;
	String DOB;
	String adresseMail;
	Double Amount;
	
	public static ArrayList<Products> AlimentFavorie=new ArrayList<Products>();



	public Comptes(String unNom, 
			String unPrenom, 
			String unDOB,
			Double unAmount) {
		prenom = unPrenom;
		nom = unNom;
		DOB= unDOB;
		adresseMail= nom + prenom +"@magasinProg.ca";
		Amount = unAmount;
	};
	 
	public String getAdresseMail() {
		return adresseMail;
	}
	
	public Double getAmount() {
		return Amount;
	}
	

	public void AddAmount(double Added) {
		Amount =  Amount+ Added;
	}
	public void RemoveAmount(double Removed) {
		Amount = Amount- Removed;
	}

	//implementation de Comparable
	public int compareTo(Comptes other) {
		return(this.nom.compareTo(other.nom));
	}




	
	
	


}
