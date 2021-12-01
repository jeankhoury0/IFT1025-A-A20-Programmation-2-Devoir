package tp1;

public class Aliments extends Products {
	String nom;
	String couleur; //Combobox?
	Double poids; //Validation 
	
	//Constructeur
	Aliments(tp1.Directeur unDirecteur, 
			String unNom, 
			String unCouleur,
			Double unPoids) {
		super(unDirecteur);
		nom= unNom;
		couleur=unCouleur;
		poids= unPoids;
		
	}
	

	
}
