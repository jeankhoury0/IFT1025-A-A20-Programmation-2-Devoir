package tp2JeanKhouryPck;
//JEAN KHOURY
import java.util.Collections;
import java.util.LinkedList;

public class inverseMotNode implements Comparable<inverseMotNode> {
	String mot;
	LinkedList<inverseFileNode> genFile = new LinkedList<inverseFileNode>();
	
	public inverseMotNode(String Mot) {
		mot= Mot;
	}
	
	public String getMot() {
		return mot;
	}
	
	public void sortInternal() {
		Collections.sort(genFile);
	}
	@Override
	public int compareTo(inverseMotNode other) {
		return(this.mot.compareTo(other.mot));
	}


}

