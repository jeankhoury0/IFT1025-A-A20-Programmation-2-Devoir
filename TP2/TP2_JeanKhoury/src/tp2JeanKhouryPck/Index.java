package tp2JeanKhouryPck;
//JEAN KHOURY
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public class Index {
	static LinkedList<indexFileNode> fileList = new LinkedList<indexFileNode>();

	public static void Indexation(File x){
		try {
			//Le code qui va faire l'index            		

			//DEBUG// System.out.println("===== "+ x.getName()+" =======");
			Tokenizer tokenizer = new Tokenizer();
		tokenizer.lireFichier(x.getAbsolutePath());
		tokenizer.creerTokens();
			//Ecrire dans la liste

		indexFileNode CurrentFile = new indexFileNode(x.getName());
			fileList.add(CurrentFile);
			//check if le noeud existe
			
		
			//Iterer les elements du tokenizer
			for(int iMotTokenizer=0; iMotTokenizer<tokenizer.textToken.length; iMotTokenizer++) {
				//DEBUG//System.out.println("                         NEW TOKEN "+ tokenizer.textToken[iMotTokenizer]); //1 3
				if(CurrentFile.genMot.isEmpty()== true) {
					//ajouter1er element
					CurrentFile.genMot.addFirst(new indexMotNode(tokenizer.textToken[iMotTokenizer]));
					continue;
				}
				//Pour chaque elements du tokenizer on compare aux mots deja sauvegarder
				for(int iMotSauvegarder=0; iMotSauvegarder <= CurrentFile.genMot.size(); iMotSauvegarder++) {
					//DEBUG//System.out.println("==mot "+ CurrentFile.genMot.get(iMotSauvegarder).getMot()); //4
					//DEBUG//System.out.println("==Tokenise " + tokenizer.textToken[iMotTokenizer]); //5
					
					//DEBUG//System.out.println(CurrentFile.genMot.get(iMotSauvegarder));
					//DEBUG//System.out.println(CurrentFile.genMot.getLast());
					
					if(CurrentFile.genMot.get(iMotSauvegarder) == CurrentFile.genMot.getLast()){
   					//Ici, on n'a pas trouvé le mot sauvegarder donc on en crée un nouveau               					
           			CurrentFile.genMot.add(new indexMotNode(tokenizer.textToken[iMotTokenizer]));
           		//DEBUG//	System.out.println("Nouveau mot ajouter: "+ tokenizer.textToken[iMotTokenizer] );  //2
           			//on recommence la loop tokenizer
           			break;
					}
					
					if(CurrentFile.genMot.get(iMotSauvegarder).getMot().compareToIgnoreCase(tokenizer.textToken[iMotTokenizer]) == 0) {
						//DEBUG//	System.out.println("===MATCH=====");
   					//cas ou existe 
						//On augmente la frequence
						CurrentFile.genMot.get(iMotSauvegarder).addFrequence();
						//DEBUG//	System.out.println("Addedfreq "+ CurrentFile.genMot.get(iMotSauvegarder).getFrequence());
						break;
						}

					
					} 
				}	
			
			//Trie avec interface comparable car string
				Collections.sort(CurrentFile.genMot);
				//DEBUG//	System.out.println("NEXT FILE ");               					
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			
	}
	
	
}
