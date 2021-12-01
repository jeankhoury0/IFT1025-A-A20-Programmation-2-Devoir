package tp2JeanKhouryPck;

//JEAN KHOURY

//Le but de la classe est de definir un mot et sa frequence 
//on crée un constructeur qui va initialiser un mot et mettre sa fréquence a 1
//puis après quand l'on encontre le mot, on va tout simplement incrementer la fréquence de 1


public class indexMotNode implements Comparable<indexMotNode> {
	String motTexte;
	int frequence;
	
	//constructeur par default pour rajouter un mot
	public indexMotNode(String m) {
		motTexte = m;
		frequence = 1;
	}
	//XXX constructeur "cheat" pour rajouter une frequence
	public indexMotNode(String m, int freq) {
		motTexte = m;
		frequence = freq;
	}
	
	public void addFrequence() {
		frequence += 1;
	}
	
	public int getFrequence() {
		return frequence;
	}
	
	//get mot
	public String getMot() {
		return motTexte;
	}
	
	
	
	
	//Pour le trie 
	@Override
	public int compareTo(indexMotNode other) {
		return(this.motTexte.compareTo(other.motTexte));
	}
}
