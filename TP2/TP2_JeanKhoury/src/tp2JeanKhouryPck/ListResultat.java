package tp2JeanKhouryPck;

//JEAN KHOURY
public class ListResultat implements Comparable<ListResultat>{
	String FileName;
	Integer Frequence;
	
	public ListResultat(String aFileName, Integer aFrequence) {
		this.FileName= aFileName;
		this.Frequence= aFrequence;
	}
	
	public void addFrequence(int freq) {
		this.Frequence += freq;
	}
	public Integer getFrequence() {
		return this.Frequence;
	}

	//Utilisation de Integer pour pouvoir utiliser comparable
	@Override
	public int compareTo(ListResultat other) {
		
		return this.getFrequence().compareTo(other.getFrequence());
	}
}
