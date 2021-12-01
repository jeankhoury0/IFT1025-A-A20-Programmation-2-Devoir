//JEAN KHOURY
package tp1;


import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class Main extends javax.swing.JFrame {


    public Main() {
        initComponents();
    }

                      
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnEditAccount = new javax.swing.JButton();
        btnAddAcount1 = new javax.swing.JButton();
        btnDeleteAccount = new javax.swing.JButton();
        btnOperation = new javax.swing.JButton();
        BtnGestionProduit = new javax.swing.JButton();
        BtnGestionProduit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
        		btnGestionProduitActionPerformed(evt);
        		//
        	} 
        });
        btnSearch.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
        		btnSearchActionPerformed(evt);
        		
        	}
        });
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultTableModel model = new DefaultTableModel(); 
        jTable2 = new JTable(model); 

        //CREATE the rows
        model.addColumn("Name");
        model.addColumn("Last Name");
        model.addColumn("Account Type");
        model.addColumn("Amount");
        jTable2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        
        
        //FiLl the table
        //TODO peut etre implementer un sort
        	// Collections.sort(Repository.ComptesList);
        for(int i=0; i<Repository.ComptesList.size(); i++) {
			model.addRow(new Object[]{Repository.ComptesList.get(i).nom,
					Repository.ComptesList.get(i).prenom,
					Repository.ComptesList.get(i).getClass().getSimpleName(),
					Repository.ComptesList.get(i).getAmount()
					}
					);
		}
		
		
        jScrollPane1.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));


        btnSearch.setText("Search");

        btnEditAccount.setText("Edit Selected Account");
        btnEditAccount.setActionCommand("Edit Selected Account");
        btnEditAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            }
        });
        btnEditAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditAccountActionPerformed(evt);
            }
        });

        btnAddAcount1.setText("Add Account");
        btnAddAcount1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddAcount1dosomething(evt);
            }
        });

        btnDeleteAccount.setText("Delete Selected Account");
        btnDeleteAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            }
        });
        btnDeleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAccountActionPerformed(evt);
            }
        });

        btnOperation.setText("Operation on Selected Account");
        btnOperation.setToolTipText("Add, Remove Money");
        btnOperation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            }
        });
        btnOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperationActionPerformed(evt);
            }
        });

        BtnGestionProduit.setBackground(java.awt.Color.green);
        BtnGestionProduit.setText("Gestion Produits");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch)
                .addGap(100, 100, 100))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEditAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeleteAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addComponent(btnOperation, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addComponent(BtnGestionProduit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(btnAddAcount1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 63, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(78, 78, 78)
                .addComponent(btnEditAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnGestionProduit)
                .addGap(32, 32, 32))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addComponent(btnAddAcount1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(318, Short.MAX_VALUE)))
        );

        btnOperation.getAccessibleContext().setAccessibleName("Operation on Selected Account");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }                      

    //Define the actions
    private void btnDeleteAccountActionPerformed(java.awt.event.ActionEvent evt) { 
    	//Delete the row if pressed
    	try {
    		int selectedPosition =  jTable2.getSelectedRow();
        	Repository.ComptesList.remove(selectedPosition);
        	((DefaultTableModel)jTable2.getModel()).removeRow(jTable2.getSelectedRow());
        	
        	} catch (Exception e){
        		//Catch if nothing is selected
        		JOptionPane.showInternalMessageDialog(null, "Nothing is Selected!" );

        	};
    }                                                
                                        

    private void btnAddAcount1dosomething(java.awt.event.MouseEvent evt) {                                          
        //To add an account
    	//We will open the Account Managmenet Interface 
    	//Le mode de l'interface sera CREATE
    	Repository.viewingMode= "create";
    	AccountManagementInterface AccountManagementInterface = new AccountManagementInterface();
    	AccountManagementInterface.setVisible(true);
    	super.dispose();
    }                                         

    private void btnEditAccountActionPerformed(java.awt.event.ActionEvent evt) {                                               
        //to Edit an account
    	//On sauvegarde le compte à passer
    	try {
    		int selectedPosition =  jTable2.getSelectedRow(); 
    		System.out.println(selectedPosition);
    		//We take the selected and pass it to Repository.compteToPass
    		Repository.compteToPass = Repository.ComptesList.get(selectedPosition);
    		
    		//We put the viewingMode to edit
    		Repository.viewingMode = "edit";
    		AccountManagementInterface AccountManagementInterface = new AccountManagementInterface();
        	AccountManagementInterface.setVisible(true);
        	super.dispose();

    		
    		
    		
    		
    	}catch (Exception e) {
    		//Catch if nothing is selected
    		JOptionPane.showInternalMessageDialog(null, "Nothing is Selected!" );
    		System.out.println(e.getMessage());
		}
    }                                               


    private void btnOperationActionPerformed(java.awt.event.ActionEvent evt) {                                             
    	try {
    		int selectedPosition =  jTable2.getSelectedRow(); 
    		System.out.println(selectedPosition);
    		//We take the selected and pass it to Repository.compteToPass
    		Repository.compteToPass = Repository.ComptesList.get(selectedPosition);
    		
    		//We put the viewingMode to read
    		Repository.viewingMode = "read";
    		AccountManagementInterface AccountManagementInterface = new AccountManagementInterface();
        	AccountManagementInterface.setVisible(true);
        	super.dispose();

    		
    		
    		
    	}catch (Exception e) {
    		//Catch if nothing is selected
    		JOptionPane.showInternalMessageDialog(null, "Nothing is Selected!" );
    		System.out.println(e.getMessage());
		}
    }
    
    private void btnGestionProduitActionPerformed(java.awt.event.ActionEvent evt) {
    	//To open the product Frame
    	AlimentManagement alimentManagement = new AlimentManagement();
    	alimentManagement.setVisible(true);;
    	super.dispose();
    	
    }
    private static void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {
    	//Search
    	Repository.toSearch= txtSearch.getText().toLowerCase();
    	SearchResultsInterface searchresultsinterface = new SearchResultsInterface();
    	searchresultsinterface.setVisible(true);
    	
    	}

    	
    
    


    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
        
        //Some fake data
        Client Jean = new Client("Jean", "Khoury", "13022001", 0.01);
        Repository.ComptesList.add(Jean);
        Employee Colleen = new Employee("Colleen", "Wright", "0722180", 0.02);
        Repository.ComptesList.add(Colleen);
        Client Stephen = new Client("Stephen", "Branch", "02022002", 0.30);
        Repository.ComptesList.add(Stephen);
        Directeur Irma = new Directeur ("Irma", "Hood", "09161979", 0.40);
        Repository.ComptesList.add(Irma);
        Directeur MrBoss = new Directeur("MrBoss", "Rich", "010101", 100.00);
        Repository.ComptesList.add(MrBoss);
        meubles chaise = new meubles(MrBoss, "Chaise", 0.00, 200.0);
        Repository.MeublesList.add(chaise);
        Aliments strawberry = new Aliments(MrBoss, "strawberry", "red", 0.1);
        Repository.AlimentsList.add(strawberry);
        meubles table = new meubles(MrBoss, "Table", 0.00, 200.0);
        Repository.MeublesList.add(table);

        

        
        
        

    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton BtnGestionProduit;
    private javax.swing.JButton btnAddAcount1;
    private javax.swing.JButton btnDeleteAccount;
    private javax.swing.JButton btnEditAccount;
    private javax.swing.JButton btnOperation;
    private javax.swing.JButton btnSearch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable2;
    private static javax.swing.JTextField txtSearch;
    // End of variables declaration                
    
    
    
    
}
