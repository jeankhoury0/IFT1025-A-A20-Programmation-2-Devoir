package tp1;
import javax.swing.GroupLayout.Alignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class AccountManagementInterface extends javax.swing.JFrame {

    /**
     * Creates new form NewAccount
     */
    public AccountManagementInterface() {
        initComponents();
        //check Account comportment
        if(Repository.viewingMode == "create") {
    	AccountManagementInterface.addAcountComportement();
        }
        if(Repository.viewingMode == "edit") {
        	AccountManagementInterface.addEditComportement();
        }
        if(Repository.viewingMode == "read") {
        	AccountManagementInterface.addReadComportement();
        }

    }

    
    private void initComponents() {
    	
        jLabel1 = new javax.swing.JLabel();
        cBoxAccountType = new javax.swing.JComboBox<>();
        lblAccountType = new javax.swing.JLabel();
        LblName = new javax.swing.JLabel();
        TxtName = new javax.swing.JTextField();
        LblName1 = new javax.swing.JLabel();
        TxtSurname = new javax.swing.JTextField();
        LblDOB = new javax.swing.JLabel();
        TxtDOB = new javax.swing.JTextField();
        LblEmail = new javax.swing.JLabel();
        TxtEmail = new javax.swing.JTextField();
        TxtAccountBalance = new javax.swing.JTextField(); //Event TxtAccountBalanceFocusLost
        LblAccountBalance = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listFavItems = new javax.swing.JList<>();
        LblFavItems = new javax.swing.JLabel();
        jPanelMoney = new javax.swing.JPanel();
        LblMoneyManagement = new javax.swing.JLabel();
        TxtAmount = new javax.swing.JTextField();
        LblAmount = new javax.swing.JLabel();
        BtnAddAmount = new javax.swing.JButton();
        BtnWithdrawAmount = new javax.swing.JButton();
        jPanelManagement = new javax.swing.JPanel();
        LblMoneyManagement1 = new javax.swing.JLabel();
        LblAmount1 = new javax.swing.JLabel();
        BtnAddItem = new javax.swing.JButton();
        BtnWithdrawItem = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        BtnSave = new javax.swing.JButton();
        BtnDiscard = new javax.swing.JButton();
        
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Account Management");

        cBoxAccountType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Client", "Employee", "Director" }));

        lblAccountType.setText("Account type");

        LblName.setText("Name");

        TxtName.setEditable(false);

        LblName1.setText("Surname");

        TxtSurname.setEditable(false);

        LblDOB.setText("DOB");

        TxtDOB.setEditable(false);
        TxtDOB.setText("JJMMYYYY"); 
        TxtDOB.setToolTipText("Enter JJMMYYYY");
        TxtDOB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtDOBFocusLost(evt);
            }
        });
        TxtAccountBalance.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
            	TxtAccountBalanceFocusLost(evt);
            }
        });
       
        LblEmail.setText("Email");

        TxtEmail.setEditable(false);
        TxtEmail.setToolTipText("");
        TxtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtEmailFocusLost(evt);
            }
        });

        TxtAccountBalance.setEditable(false);
        TxtAccountBalance.setToolTipText("");
        TxtAccountBalance.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtAccountBalanceFocusLost(evt);
            }
        });

        LblAccountBalance.setText("Account Balance");

        listFavItems.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Chair", "Strawberry" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listFavItems.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(listFavItems);

        LblFavItems.setText("Favorite Items");

        jPanelMoney.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        LblMoneyManagement.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        LblMoneyManagement.setText("Account Management");

        LblAmount.setText("Amount:");

        BtnAddAmount.setText("Add");
        BtnAddAmount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAddAmountMouseClicked(evt);
            }
        });

        BtnWithdrawAmount.setText("Withdraw");
        BtnWithdrawAmount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnWithdrawAmountMouseClicked(evt);
                            }
            

        });
        

        javax.swing.GroupLayout jPanelMoneyLayout = new javax.swing.GroupLayout(jPanelMoney);
        jPanelMoney.setLayout(jPanelMoneyLayout);
        jPanelMoneyLayout.setHorizontalGroup(
            jPanelMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMoneyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblMoneyManagement)
                    .addGroup(jPanelMoneyLayout.createSequentialGroup()
                        .addGroup(jPanelMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblAmount)
                            .addComponent(BtnAddAmount))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtAmount)
                            .addComponent(BtnWithdrawAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanelMoneyLayout.setVerticalGroup(
            jPanelMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMoneyLayout.createSequentialGroup()
                .addComponent(LblMoneyManagement)
                .addGap(4, 4, 4)
                .addGroup(jPanelMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblAmount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAddAmount)
                    .addComponent(BtnWithdrawAmount))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanelManagement.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        LblMoneyManagement1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        LblMoneyManagement1.setText("Fav Items Management");

        LblAmount1.setText("Item");

        BtnAddItem.setText("Add");
        BtnAddItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAddAmountMouseClicked(evt);
            }
        });

        BtnWithdrawItem.setText("Remove");
        BtnWithdrawItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAddAmountMouseClicked(evt);
            }
        });
        BtnWithdrawItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnWithdrawItemActionPerformed(evt);
            }
        });
        
        

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanelManagementLayout = new javax.swing.GroupLayout(jPanelManagement);
        jPanelManagement.setLayout(jPanelManagementLayout);
        jPanelManagementLayout.setHorizontalGroup(
            jPanelManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelManagementLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblMoneyManagement1)
                    .addGroup(jPanelManagementLayout.createSequentialGroup()
                        .addComponent(BtnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnWithdrawItem, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelManagementLayout.createSequentialGroup()
                        .addComponent(LblAmount1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelManagementLayout.setVerticalGroup(
            jPanelManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelManagementLayout.createSequentialGroup()
                .addComponent(LblMoneyManagement1)
                .addGap(5, 5, 5)
                .addGroup(jPanelManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblAmount1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAddItem)
                    .addComponent(BtnWithdrawItem))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BtnSave.setForeground(java.awt.Color.red);
        BtnSave.setText("SAVE ACCOUNT");
        BtnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSaveMouseClicked(evt);
            }
        });

        BtnDiscard.setForeground(java.awt.Color.red);
        BtnDiscard.setText("DISCARD ACCOUNT");
        BtnDiscard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnDiscardMouseClicked(evt);
            }
        });
        
        //Add employee and manager to combo box //XXX
//        System.out.print(Repository.compteToPass instanceof Client);
//
//        String cBoxitems[] = new String[1] ;
//        int compteur = 0;
//        for(int i=0; i<Repository.ComptesList.size(); i++) {
//	    	if (Repository.compteToPass instanceof Employee) {
//	    		cBoxitems[i]=Repository.ComptesList.get(i).nom;
//	    		compteur++;
//	    	}
//	    	if (Repository.compteToPass instanceof Directeur) {
//	        	cBoxAccountType.setSelectedIndex(2);
//	        	
//	    	}
//        }
//    	
      JComboBox cBoxAutority = new JComboBox();
      cBoxAutority.setToolTipText("Select a manager or employee to effectuate this action");
        
       
    	
        
        
        JLabel lblNewLabel = new JLabel("Authority");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 351, GroupLayout.PREFERRED_SIZE)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(6)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        									.addGroup(layout.createSequentialGroup()
        										.addComponent(lblAccountType)
        										.addPreferredGap(ComponentPlacement.UNRELATED)
        										.addComponent(cBoxAccountType, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE))
        									.addGroup(layout.createSequentialGroup()
        										.addComponent(LblName)
        										.addGap(18)
        										.addComponent(TxtName))
        									.addGroup(layout.createSequentialGroup()
        										.addComponent(LblName1)
        										.addGap(18)
        										.addComponent(TxtSurname))
        									.addGroup(layout.createSequentialGroup()
        										.addComponent(LblDOB)
        										.addGap(18)
        										.addComponent(TxtDOB))
        									.addGroup(layout.createSequentialGroup()
        										.addComponent(LblEmail)
        										.addGap(18)
        										.addComponent(TxtEmail))
        									.addGroup(layout.createSequentialGroup()
        										.addComponent(LblAccountBalance)
        										.addGap(18)
        										.addComponent(TxtAccountBalance)))
        								.addComponent(LblFavItems)))
        						.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 274, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        							.addComponent(jPanelManagement, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addGroup(layout.createSequentialGroup()
        								.addComponent(BtnSave)
        								.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
        								.addComponent(BtnDiscard, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE))
        							.addComponent(jPanelMoney, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(lblNewLabel)
        							.addGap(18)
        							.addComponent(cBoxAutority, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)))
        					.addGap(63))))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(cBoxAccountType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblAccountType)
        				.addComponent(cBoxAutority, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblNewLabel))
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(11)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(LblName)
        						.addComponent(TxtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(LblName1)
        						.addComponent(TxtSurname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(17)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(LblDOB)
        						.addComponent(TxtDOB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(LblEmail)
        						.addComponent(TxtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(28)
        					.addComponent(jPanelMoney, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addGap(20)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(LblAccountBalance)
        						.addComponent(TxtAccountBalance, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(LblFavItems)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jPanelManagement, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(BtnSave)
        						.addComponent(BtnDiscard))))
        			.addContainerGap(31, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }
    
    

    private void TxtDOBFocusLost(java.awt.event.FocusEvent evt) {                                 
        // TODO CHECK FOR VALID DATE:
    	try {
    		int DOBdate = Integer.parseInt(TxtDOB.getText());
    		if (TxtDOB.getText().length() != 6) {
    			JOptionPane.showInternalMessageDialog(null, "Something went Wrong. Enter a DOB on the format DDMMYY ");
    			
    		}
    	}catch (Exception e) {
      	   JOptionPane.showInternalMessageDialog(null, "Something went Wrong. Enter a DOB on the format DDMMYY "+ e.getMessage() );

			
		}
    	
    }                                

    private void TxtEmailFocusLost(java.awt.event.FocusEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void TxtAccountBalanceFocusLost(java.awt.event.FocusEvent evt) {                                            
        //Check if double
    	try {
    		double Amount = Double.parseDouble(TxtAmount.getText());
    	}catch (Exception e) {
      	   JOptionPane.showInternalMessageDialog(null, "Something went Wrong. Please enter a number in absolute format "+ e.getMessage() );
		}
    	
    }                                           

    private void BtnWithdrawItemActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void BtnWithdrawAmountMouseClicked(java.awt.event.MouseEvent evt) {            
    	//Remove cash
    	try {
    		double Amount = Double.parseDouble(TxtAmount.getText());
    		if (Amount > Repository.compteToPass.getAmount() ) {
    	     	   JOptionPane.showInternalMessageDialog(null, "Oups! U have no more money in our accounts!" );
    		}else {
    			Repository.compteToPass.RemoveAmount(Amount);
        		AccountManagementInterface newInterfaceAMI = new AccountManagementInterface();
        		newInterfaceAMI.setVisible(true);
        		super.dispose();
    		}
    		
    		
    	}catch (Exception e) {
     	   JOptionPane.showInternalMessageDialog(null, "Something went Wrong. Please check your values and try again! "+ e.getMessage() );
		}
    }            
                                                

    private void BtnAddAmountMouseClicked(java.awt.event.MouseEvent evt) {                                          
    	//Add Money
    	try {
    		double Amount = Double.parseDouble(TxtAmount.getText());
    		Repository.compteToPass.AddAmount(Amount);
    		
    		AccountManagementInterface newInterfaceAMI = new AccountManagementInterface();
    		newInterfaceAMI.setVisible(true);
    		super.dispose();
    		
    	}catch (Exception e) {
     	   JOptionPane.showInternalMessageDialog(null, "Something went Wrong. Please check your values and try again! "+ e.getMessage() );
		}
    }                                         

    private void BtnSaveMouseClicked(java.awt.event.MouseEvent evt) {         
    	try {
    		//Check the comportement/state to follow 
    		//IF CREATE
        	if (Repository.viewingMode == "create") {
        		//check what type of account is selected
        		int ItemIndex = cBoxAccountType.getSelectedIndex();
        		System.out.println(ItemIndex);
        		
        		
        		if (ItemIndex == 0 ) {
        			Client newClient= new Client(
        					TxtName.getText()
        					,TxtSurname.getText(), 
        					TxtDOB.getText(),0.00
        					);
        			Repository.ComptesList.add(newClient);
            		System.out.println("SAS");
        		}
    			if (ItemIndex == 1 ) {
        			Employee newEmployee= new Employee(
        					TxtName.getText()
        					,TxtSurname.getText(), 
        					TxtDOB.getText(),
        					0.00
        					);
        			Repository.ComptesList.add(newEmployee);
    			}
        		
        		if (ItemIndex == 2) {
        			Directeur newDirector= new Directeur(TxtName.getText()
        					, TxtSurname.getText(), 
        					TxtDOB.getText(),
        					0.00);
        			Repository.ComptesList.add(newDirector);
        			
        		}
        		
        		Main Nmain = new Main();
            	Nmain.setVisible(true);
            	super.dispose();
        		

        		
        	}
        	//IF EDIT 
        	if (Repository.viewingMode == "edit") {
        			//Change info 
        		Repository.compteToPass.nom=TxtName.getText();
        		Repository.compteToPass.prenom=TxtSurname.getText();
        		Repository.compteToPass.DOB=TxtDOB.getText();
        		
        		Main Nmain = new Main();
            	Nmain.setVisible(true);
            	super.dispose();	

        	}

    	}catch (Exception e) {
			// TODO: handle exception
		}
        
    		
    	
    }                                    

    private void BtnDiscardMouseClicked(java.awt.event.MouseEvent evt) {                                      
        // To discard an account:
    	//modal to prevent user of leaving without saving
    	
    	//TODO implement logic to check if account is modify
    	//TODO modal to check if really want to close
    		Main Nmain = new Main();
        	Nmain.setVisible(true);
        	super.dispose();

   }                                    

    /**
     * @param args the command line arguments
     */
    public static void Nmain(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
                
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AccountManagementInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountManagementInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountManagementInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountManagementInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountManagementInterface().setVisible(true);
            }
        });
    }

    public static void addAcountComportement() {
    	//If the window is in add mode
    	//Make name, surname and DOB editable
    	TxtName.setEditable(true);
    	TxtSurname.setEditable(true);
    	TxtDOB.setEditable(true);
    	//Hide Account Management Group
    	jPanelManagement.setVisible(false);
    	jPanelMoney.setVisible(false);
    	listFavItems.setEnabled(false);
    	TxtAccountBalance.setText("0");
    	BtnSave.setText("CREATE ACCOUNT");
    	
    	//Next Step when Save Account is clicked save all info
    	
    }
    
    public static void addEditComportement() {
    	//Make name, surname and DOB editable
    	TxtName.setEditable(true);
    	TxtSurname.setEditable(true);
    	TxtDOB.setEditable(true);
    	//Give the values
    	//Set the ComboBox
    	System.out.print(Repository.compteToPass instanceof Client);
    	if ( Repository.compteToPass.getClass().getSimpleName().toString() == "Client") {
        	cBoxAccountType.setSelectedIndex(0);
        	
    	}
    	if (Repository.compteToPass instanceof Employee) {
        	cBoxAccountType.setSelectedIndex(1);

    	}
    	if (Repository.compteToPass instanceof Directeur) {
        	cBoxAccountType.setSelectedIndex(2);
        	
    	}
    	cBoxAccountType.setEnabled(false);
    	
    	TxtName.setText(Repository.compteToPass.nom);
    	TxtSurname.setText(Repository.compteToPass.prenom);
    	TxtDOB.setText(Repository.compteToPass.DOB);
    	TxtEmail.setText(Repository.compteToPass.getAdresseMail());
    	TxtAccountBalance.setText( Repository.compteToPass.getAmount() + "$");
    	jPanelManagement.setVisible(false);
    	jPanelMoney.setVisible(false);
    	listFavItems.setEnabled(false);
    	
    }
    
    public static void addReadComportement() {
    	//Give the values
    	//Set the ComboBox
    	System.out.print(Repository.compteToPass instanceof Client);
    	if ( Repository.compteToPass.getClass().getSimpleName().toString() == "Client") {
    		//Client cannot withdraw money 
        	
        	cBoxAccountType.setSelectedIndex(0);
        	
        	
    	}
    	if (Repository.compteToPass instanceof Employee) {
        	cBoxAccountType.setSelectedIndex(1);

    	}
    	if (Repository.compteToPass instanceof Directeur) {
        	cBoxAccountType.setSelectedIndex(2);
        	
    	}
    	cBoxAccountType.setEnabled(false);
    	
    	TxtName.setText(Repository.compteToPass.nom);
    	TxtSurname.setText(Repository.compteToPass.prenom);
    	TxtDOB.setText(Repository.compteToPass.DOB);
    	TxtEmail.setText(Repository.compteToPass.getAdresseMail());
    	TxtAccountBalance.setText( Repository.compteToPass.getAmount() + "$");
    	
    	//FAV ITEM MANAGEMENT
    	//Show all items
    	//for(int i=0; i<Comptes.AlimentFavorie.size(); i++) {
    	//	listFavItems.addElement()
    	//}
    	
    	

    	
    	
    	
    	
    	
    	//TODO Client can only add money
    	//Other can Withdraw
    }
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton BtnAddAmount;
    private javax.swing.JButton BtnAddItem;
    private static javax.swing.JButton BtnSave;
    private javax.swing.JButton BtnDiscard;
    private static javax.swing.JButton BtnWithdrawAmount;
    private javax.swing.JButton BtnWithdrawItem;
    private javax.swing.JLabel LblAccountBalance;
    private javax.swing.JLabel LblAmount;
    private javax.swing.JLabel LblAmount1;
    private javax.swing.JLabel LblDOB;
    private javax.swing.JLabel LblEmail;
    private javax.swing.JLabel LblFavItems;
    private javax.swing.JLabel LblMoneyManagement;
    private javax.swing.JLabel LblMoneyManagement1;
    private javax.swing.JLabel LblName;
    private javax.swing.JLabel LblName1;
    private static javax.swing.JTextField TxtAccountBalance;
    private static javax.swing.JTextField TxtAmount;
    private static javax.swing.JTextField TxtDOB;
    private static javax.swing.JTextField TxtEmail;
    private static javax.swing.JTextField TxtName;
    private static javax.swing.JTextField TxtSurname;
    private static javax.swing.JComboBox<String> cBoxAccountType;
    private static javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private static javax.swing.JPanel jPanelMoney;
    private static javax.swing.JPanel jPanelManagement;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAccountType;
    private static javax.swing.JList<String> listFavItems;
}
