package tp2JeanKhouryPck;
//JEAN KHOURY
import java.util.Collections;
import java.util.LinkedList;


public class InverseIndex {
	static LinkedList<inverseMotNode> IndexInverse = new LinkedList<inverseMotNode>();

	public static void IndexationInverse() {

	for(int iCurrentFile=0; iCurrentFile<Index.fileList.size();iCurrentFile++) {
    	String CurrentFile = Index.fileList.get(iCurrentFile).getFileName();
    	//niveau des files
    	for(int iCurrentMot=0;iCurrentMot<Index.fileList.get(iCurrentFile).genMot.size(); iCurrentMot++) {
    		indexMotNode CurrentMot = Index.fileList.get(iCurrentFile).genMot.get(iCurrentMot);
    		
    		//DEBUG//System.out.println(CurrentMot.getMot());
    		//On va comparer les mots de l'index au mots déja présent dans l'indexinverse
    		
    		
			for(int iCurrentMotIndexInverse=0; iCurrentMotIndexInverse <= IndexInverse.size();iCurrentMotIndexInverse++) {
    			if(IndexInverse.isEmpty() ==true) {
    				//Si est vide, on ajoute un premier element
    				IndexInverse.addFirst(new inverseMotNode(CurrentMot.getMot()));
    				IndexInverse.getFirst().genFile.add(new inverseFileNode(CurrentFile, CurrentMot.getFrequence()));
    				//DEBUG//	System.out.println("WAS EMPTY");
    				//DEBUG//	System.out.println("Element Added: "+ IndexInverse.getFirst().genFile.getFirst().fileName 
    				//DEBUG//			+ "    " +IndexInverse.getFirst().genFile.getFirst().frequence);
    				break;
    			}

    			inverseMotNode MotComparer= IndexInverse.get(iCurrentMotIndexInverse);
    				
    			if(MotComparer.getMot().compareToIgnoreCase(CurrentMot.getMot())== 0) {
    				MotComparer.genFile.add(new inverseFileNode(Index.fileList.get(iCurrentFile).getFileName(), CurrentMot.getFrequence()));
    				//DEBUG//System.out.println("MOT ADDED");
    				break;
    			}
    			
    			//On remarque que n'existe pas
    			if(MotComparer==IndexInverse.getLast()){
    				IndexInverse.addLast(new inverseMotNode(CurrentMot.getMot()));
    				IndexInverse.getLast().genFile.add(new inverseFileNode(Index.fileList.get(iCurrentFile).getFileName(), CurrentMot.getFrequence()));
    				//On rajoute le file
    				//DEBUG//System.out.println("NOT FOUND: " +IndexInverse.getFirst().getMot());
    				break;
    					
    			}}
			Collections.sort(IndexInverse);
			for(int iMot=0; iMot<IndexInverse.size();iMot++) {
	        	//On fait le trie dans les fichiers
	        	IndexInverse.get(iMot).sortInternal();
	        	}
			}
			
    		}
    	}
    }
			
		
	



