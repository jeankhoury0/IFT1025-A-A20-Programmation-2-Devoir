package tp2JeanKhouryPck;
//JEAN KHOURY
import java.io.*;



//Lire le texte
public class Tokenizer{
	
	public String texte;
	public String[] textToken;
	
	public void lireFichier(String pathFichier) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(pathFichier));
		String ligne= "";
		String TexteLu= "" ; 
		
		while((ligne = reader.readLine())!= null) {
			TexteLu += ligne + " ";
		}
		
		this.texte = TexteLu;
		reader.close();
	}
	
	//Tokenizing de la string de recherche
	public void lireString(String aLire) {
		this.texte = aLire;
	}
	
	//faire la tokenisation
	public void creerTokens() {
		texte = texte.replaceAll("[^A-z0-9'éèêàçæœ$@£€-]"," ");
		this.textToken = this.texte.split(" +");
		//TODO implement the trie
		//Cree une liste
		
		
		//for(int i=0; i<textToken.length;i++) {
		//	System.out.println(textToken[i]);
		//}
	}
	

	
}
