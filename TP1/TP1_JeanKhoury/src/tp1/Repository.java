package tp1;

import java.util.ArrayList;
//The idea of this class is to do parameter passing between GUIs
//so that they dont get destroyed by super.dispose()


public class Repository {
	
	//We save instances of persons
	public static ArrayList<Comptes> ComptesList=new ArrayList<Comptes>();
	//We save instances of meubles
		public static ArrayList<meubles> MeublesList=new ArrayList<meubles>();
	//We save instances of Aliments
		public static ArrayList<Aliments> AlimentsList=new ArrayList<Aliments>();

		//We instanciate director
	    public static ArrayList<Directeur> DirectorList=new ArrayList<Directeur>();

		
	//To check how the AccountManagement interface will open
	//CHECK 3 valeurs possible: create, edit, read
	public static String viewingMode;
	
	//To pass the person selected in Main View to AccountManagement interface
	public static Comptes compteToPass;
	//To pass the search text
	public static String toSearch;
	


}
