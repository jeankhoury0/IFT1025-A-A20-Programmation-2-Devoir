package tp2JeanKhouryPck;
//JEAN KHOURY
import java.util.Collections;
import java.util.LinkedList;

public class SearchIndex {
	
	//But est de storer les resulats de chaques instances
	static LinkedList<ListResultat> resultatRecherche = new LinkedList<ListResultat>();
	
	public static void search(String ToSearch) {

		String searchTerm = ToSearch;
		
		Tokenizer tokenizer = new Tokenizer();
		tokenizer.lireString(searchTerm);
		tokenizer.creerTokens();
		
		
		//Collecter les resultats de chaques mot Tokeniser
		for(int iToken =0; iToken<tokenizer.textToken.length; iToken++) {
			String beingSearched = tokenizer.textToken[iToken];
			//Iterer tout le mots de l'index inverse
			outerloop:
			for(int iIndexInverse = 0; iIndexInverse< InverseIndex.IndexInverse.size(); iIndexInverse++) {
				if(beingSearched.compareToIgnoreCase(InverseIndex.IndexInverse.get(iIndexInverse).getMot())==0) {
					if (resultatRecherche.isEmpty()==true) {
						//Le premier resultats est toujours sauvegarder
						System.out.println("FOUND 1 "+  InverseIndex.IndexInverse.get(iIndexInverse).getMot());
						for(int iNew=0; iNew<InverseIndex.IndexInverse.get(iIndexInverse).genFile.size(); iNew++ ){
							inverseFileNode fileTemp= InverseIndex.IndexInverse.get(iIndexInverse).genFile.get(iNew);
							resultatRecherche.add(new ListResultat(fileTemp.getFileName(), fileTemp.getFrequence()));
						}
						continue outerloop;
					}
					//si ce n'est pas le premier on itère pour voir si les files sont les mêmes
					//XXX
					
					System.out.println("FOUND not1 "+  InverseIndex.IndexInverse.get(iIndexInverse).getMot());
					//on veut checker si les mots existe dans les autres files
					for(int iresultatRecherche=0; iresultatRecherche<resultatRecherche.size(); iresultatRecherche++) {
						ListResultat fileAlreadyPresent = resultatRecherche.get(iresultatRecherche);
						System.out.println("IMPORTANT" + resultatRecherche.get(iresultatRecherche).FileName);
						for(int iIndexInverseInner=0; iIndexInverseInner<InverseIndex.IndexInverse.get(iIndexInverse).genFile.size();iIndexInverseInner++ ) {
							inverseFileNode IndexInverseFile= InverseIndex.IndexInverse.get(iIndexInverse).genFile.get(iIndexInverseInner);
							//VOIR LE CAS OU LES FILES NAMES MATCHED
							if(fileAlreadyPresent.FileName.compareToIgnoreCase(IndexInverseFile.getFileName()) ==0) {
								//CAS OU EST PRÉSENT DANS La liste finale
								fileAlreadyPresent.addFrequence(IndexInverseFile.getFrequence());
								System.out.println("						FREQUENCE ADDED");
								break;
							}
							}

						}
						
						

					}
					
					
					
					
					//XXX
				}		
		} //END OF MAIN FOR
		
		
		
	

		
				
			
		
		

	

				
			
		//On va itéré maintenant les resultats
				
				
				for(int i=0; i<resultatRecherche.size(); i++) {
					if(resultatRecherche.get(i).Frequence == resultatRecherche.getFirst().Frequence) {
						//System.out.println("DELETE");
						resultatRecherche.remove(i);
						
					}
				}
				Collections.sort(resultatRecherche, Collections.reverseOrder());
				
				System.out.println("=======RESULTAT========");
				System.out.println("LES MOTS CORRESPONDENT AUX DOCUMENTS: ");
				for(int i1=0; i1<resultatRecherche.size(); i1++) {
					System.out.println(resultatRecherche.get(i1).FileName + "   " +resultatRecherche.get(i1).Frequence);
				}
		}
	}

