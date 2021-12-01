package tp2JeanKhouryPck;
//JEAN KHOURY


public class inverseFileNode implements Comparable<inverseFileNode> {

	
	String fileName;
	int frequence;
	
	//constructeur 
	public inverseFileNode(String file, int laFrequence) {
		fileName=file;
		frequence = laFrequence;
	}
	
	
	public void addFrequence(int rajout) {
		frequence += rajout;
	}
	
	public int getFrequence() {
		return frequence;
	}
	
	//get mot
	public String getFileName() {
		return fileName;
	}
	
	@Override
	public int compareTo(inverseFileNode other) {
	
		return(this.fileName.compareTo(other.fileName));
	}

	
}
