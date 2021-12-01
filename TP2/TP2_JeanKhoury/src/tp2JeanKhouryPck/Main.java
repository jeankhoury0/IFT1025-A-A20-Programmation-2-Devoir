package tp2JeanKhouryPck;
//JEAN KHOURY
import java.io.*;
import java.util.Arrays;


import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		//File Chooser 
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        FileNameExtensionFilter filterTxt = new FileNameExtensionFilter(".txt (Only text file)", "txt");
        //Laisser uniquement l'utilisateur choisir un file texte
        jfc.setAcceptAllFileFilterUsed(false);
        jfc.addChoosableFileFilter(filterTxt);
        jfc.setDialogTitle("Choisir les fichiers qui vont être indexer:");
        jfc.setMultiSelectionEnabled(true);
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        //TODO implementer pour les directory avec parents

        int returnValue = jfc.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File[] files = jfc.getSelectedFiles();
            //pour chaques files on va faire la tockanisation
            Arrays.asList(files).forEach(x -> {
                if (x.isFile()) {
               		
               			Index.Indexation(x);
               		
                }
                });
        }
        
        //Index Inverse
        InverseIndex.IndexationInverse();
        
        //Afficher la liste
        System.out.println("====INDEX NORMAL====");
        for(int iFile=0; iFile<Index.fileList.size(); iFile++) {
        	System.out.println(Index.fileList.get(iFile).getFileName());
        	for(int iMot=0; iMot<Index.fileList.get(iFile).genMot.size(); iMot++) {
        		System.out.println(" ⎣" + rightPadding(Index.fileList.get(iFile).genMot.get(iMot).getMot(), 14)+
        				Index.fileList.get(iFile).genMot.get(iMot).getFrequence());
        	}	
        }
        

  
        System.out.println("====INDEXE INVERSER====");
        for(int iMot=0; iMot<InverseIndex.IndexInverse.size();iMot++) {
        	System.out.println(InverseIndex.IndexInverse.get(iMot).getMot());
        	for(int iFile=0;iFile<InverseIndex.IndexInverse.get(iMot).genFile.size();iFile++) {
        		System.out.println(" ⎣" + rightPadding(InverseIndex.IndexInverse.get(iMot).genFile.get(iFile).getFileName(),25) + 
        	InverseIndex.IndexInverse.get(iMot).genFile.get(iFile).getFrequence());
        	}
        }
        
        
        //OUVRIR LE GUI
        UserInterface newUserInterface = new UserInterface();
        newUserInterface.show();
        
        System.out.println("======== RECHERCHE =========");
        
        
	} 
	
	//Pour formater le tableau
	public static String rightPadding(String str, int num) {
	    return String.format("%1$-" + num + "s", str);
	  }


} 


