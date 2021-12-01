package tp1;

public class meubles extends Products {
	String type; //ComboBox?
	Double prix; //Validation
	Double hMax; //Validation *cm

	meubles(tp1.Directeur unDirecteur, 
			String unType,
			Double unPrix,
			Double unHMax) {
		super(unDirecteur);
		type= unType;
		prix = unPrix;
		hMax=unHMax;
	}

}
