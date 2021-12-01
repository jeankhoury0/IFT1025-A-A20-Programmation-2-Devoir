package tp2JeanKhouryPck;
//JEAN KHOURY
import java.util.*;

public class indexFileNode {
	String fileName;
	LinkedList<indexMotNode> genMot = new LinkedList<indexMotNode>();
	
	public indexFileNode(String name) {
		fileName= name;
	}
	
	public String getFileName() {
		return fileName;
	}
		
	
}
//
