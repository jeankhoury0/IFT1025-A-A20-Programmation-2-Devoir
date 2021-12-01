
package tp1;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SearchResultsInterface extends javax.swing.JFrame {

    /**
     * Creates new form SearchResultsInterface
     */
    public SearchResultsInterface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        lblSearchResults = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblSearchResults.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblSearchResults.setText("Search Results");
        DefaultTableModel model = new DefaultTableModel(); 
        jTableResults = new JTable(model); 

        //CREATE the rows
        model.addColumn("Name");
        model.addColumn("Last Name");
        model.addColumn("Account Type");
        model.addColumn("Amount");
        jTableResults.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        
        
        
      //To search a person / or by the first letter 
    	//Choose to implement linearSearch, could be modified in the future
    	try {
        	String elementToSearch = Repository.toSearch.toLowerCase() ;
        	System.out.println(elementToSearch);
        	    for (int i=0; i<Repository.ComptesList.size(); i++) {
        	        if (Repository.ComptesList.get(i).prenom.toLowerCase().contains(elementToSearch) == true ||
        	        		Repository.ComptesList.get(i).DOB.contains(elementToSearch) == true ||
        	        		Repository.ComptesList.get(i).getClass().getSimpleName().toLowerCase().contains(elementToSearch) == true ||
        	        		Repository.ComptesList.get(i).nom.toLowerCase().contains(elementToSearch)== true
        	        	) {
            	        System.out.println(Repository.ComptesList.get(i).prenom);
            	        //Send element to table
            	        model.addRow(new Object[]{Repository.ComptesList.get(i).nom,
            					Repository.ComptesList.get(i).prenom,
            					Repository.ComptesList.get(i).getClass().getSimpleName(),
            					Repository.ComptesList.get(i).getAmount()
            					}
            					);
            	       
            	        
        	        };
        	    }
        	        //TODO send an error if nothing found
        	        if (jTableResults.getRowCount() == 0) {
        	        	//if nothing is found
        	        	JOptionPane.showInternalMessageDialog(null, "Nothing was Found!" );
        	    		System.out.println("nothing is found" );
        	    		
        	        };
    	
        	    
				}catch (Exception e) {
					JOptionPane.showInternalMessageDialog(null, "Something went wrong!" );
				}
        
        jScrollPane1.setViewportView(jTableResults);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSearchResults)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSearchResults)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SearchResultsInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchResultsInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchResultsInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchResultsInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchResultsInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableResults;
    private javax.swing.JLabel lblSearchResults;
    // End of variables declaration                   
}
