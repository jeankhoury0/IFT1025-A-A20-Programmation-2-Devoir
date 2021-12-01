package tp1;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class AlimentManagement extends javax.swing.JFrame {

    /**
     * Creates new form AlimentManagement
     */
    public AlimentManagement() {
        initComponents();
    }
//Array des directeurs

    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        lblProductManagemet = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelFurniture = new javax.swing.JPanel();
        lblFurniture = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableFurniture = new javax.swing.JTable();
        cBoxManagerFurniture = new javax.swing.JComboBox<>();
        lblDirector1 = new java.awt.Label();
        lblFurnitureType = new javax.swing.JLabel();
        lblFurniturePrice = new javax.swing.JLabel();
        txtFurnitureHmax = new javax.swing.JTextField();
        LblFurnitureHMax = new javax.swing.JLabel();
        btnDeleteSelectedFurniture = new javax.swing.JButton();
        btnAddFurniture = new javax.swing.JButton();
        btnCloseInFurniture = new javax.swing.JButton();
        cBoxFurnitureType = new javax.swing.JComboBox<>();
        txtFurniturePrice = new javax.swing.JTextField();
        jPanelFood = new javax.swing.JPanel();
        lblFood = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFood = new javax.swing.JTable();
        cBoxManagerFood = new javax.swing.JComboBox<>();
        lblDirector = new java.awt.Label();
        txtFoodName = new javax.swing.JTextField();
        lblFoodName = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        txtFoodWeight = new javax.swing.JTextField();
        lblWeight = new javax.swing.JLabel();
        jBoxColor = new javax.swing.JComboBox<>();
        btnDeleteSelectedFood = new javax.swing.JButton();
        btnAddFood = new javax.swing.JButton();
        btnCloseInFood = new javax.swing.JButton();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblProductManagemet.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblProductManagemet.setText("Product Management");

        lblFurniture.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblFurniture.setText("Furniture");

        jTableFurniture.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultTableModel model = new DefaultTableModel(); 
        jTableFurniture = new JTable(model); 

        
        
        
        //CREATE the rows
        model.addColumn("Type");
        model.addColumn("Price");
        model.addColumn("hMax cm");
        model.addColumn("Director");

        
        
        //FiLl the table
        //TODO peut etre implementer un sort
        for(int i=0; i<Repository.MeublesList.size(); i++) {
			model.addRow(new Object[]{Repository.MeublesList.get(i).type,
					Repository.MeublesList.get(i).prix,
					Repository.MeublesList.get(i).hMax,
					(Repository.MeublesList.get(i).Directeur.prenom + " "+ Repository.MeublesList.get(i).Directeur.nom),
					}
					);
			
		}
        
        //Find all Diectors
        Repository.DirectorList.clear();
        for(int i=0; i<Repository.ComptesList.size(); i++) {
     	   if (Repository.ComptesList.get(i) instanceof Directeur) {
     		   Repository.DirectorList.add((Directeur) Repository.ComptesList.get(i));
     	   } 
        };
        
        jTableFurniture.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableFurniture.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jTableFurniture);

        cBoxManagerFurniture.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        for(int i=0; i<Repository.DirectorList.size(); i++) {
        	 cBoxManagerFurniture.addItem(Repository.DirectorList.get(i).nom);
        }
       

        lblDirector1.setText("Director");

        lblFurnitureType.setText("Type");

        lblFurniturePrice.setText("Price");

        txtFurnitureHmax.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
            }
        });

        LblFurnitureHMax.setText("Hmax");
        LblFurnitureHMax.setToolTipText("Maximum Height (CM)");

        btnDeleteSelectedFurniture.setText("Delete Selected");
        btnDeleteSelectedFurniture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteSelectedFurnitureMouseClicked(evt);
            }
        });

        btnAddFurniture.setText("Add Furniture");
        btnAddFurniture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddFurnitureMouseClicked(evt);
            }
        });

        btnCloseInFurniture.setBackground(java.awt.Color.red);
        btnCloseInFurniture.setText("CLOSE");
        btnCloseInFurniture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClose(evt);
            }
        });

        cBoxFurnitureType.setEditable(true);
        cBoxFurnitureType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sofas", "Sectionals", "Sleeper Sofas", "Accent Chairs", "Loveseats", "Chaises", "Chairs-and-a-half", "Recliners", "Swivels", "Gliders", "Chair Ottomans", "Coffee tables", "End tables", "Benches", "Accent tables", "Accent chests", "Bookcases", "Open shelving", "Credenzas", "Consoles", "Dining tables", "Arm Chairs", "Side Chairs", "Bar", "", "Counter stools", "Sideboards", "Console tables", "Beds", "Headboards", "Nightstands", "Dressers", "Chests", "Armoires", "Mirrors", "Mattresses", "Benches", "Desks", "Storage cabinets", "Bookcases" }));
        cBoxFurnitureType.setToolTipText("");

        javax.swing.GroupLayout jPanelFurnitureLayout = new javax.swing.GroupLayout(jPanelFurniture);
        jPanelFurniture.setLayout(jPanelFurnitureLayout);
        jPanelFurnitureLayout.setHorizontalGroup(
            jPanelFurnitureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFurnitureLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFurnitureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFurnitureLayout.createSequentialGroup()
                        .addComponent(lblFurniture, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(379, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFurnitureLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelFurnitureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFurnitureLayout.createSequentialGroup()
                                .addComponent(lblFurniturePrice)
                                .addGap(18, 18, 18)
                                .addGroup(jPanelFurnitureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cBoxFurnitureType, 0, 138, Short.MAX_VALUE)
                                    .addComponent(txtFurniturePrice))
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFurnitureLayout.createSequentialGroup()
                                .addComponent(LblFurnitureHMax)
                                .addGap(18, 18, 18)
                                .addComponent(txtFurnitureHmax, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFurnitureLayout.createSequentialGroup()
                                .addComponent(lblDirector1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(171, 171, 171))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFurnitureLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelFurnitureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeleteSelectedFurniture, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddFurniture, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanelFurnitureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelFurnitureLayout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                    .addGroup(jPanelFurnitureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelFurnitureLayout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(lblFurnitureType)
                            .addGap(11, 11, 11)
                            .addComponent(cBoxManagerFurniture, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFurnitureLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCloseInFurniture, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(3, 3, 3)))
        );
        jPanelFurnitureLayout.setVerticalGroup(
            jPanelFurnitureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFurnitureLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFurniture, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(lblDirector1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(cBoxFurnitureType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFurnitureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFurniturePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFurniturePrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFurnitureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFurnitureHmax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblFurnitureHMax))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddFurniture, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteSelectedFurniture, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(jPanelFurnitureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelFurnitureLayout.createSequentialGroup()
                    .addContainerGap(83, Short.MAX_VALUE)
                    .addGroup(jPanelFurnitureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelFurnitureLayout.createSequentialGroup()
                            .addComponent(cBoxManagerFurniture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(51, 51, 51)
                            .addComponent(lblFurnitureType)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCloseInFurniture, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
        );

        jTabbedPane1.addTab("Furniture", jPanelFurniture);

        lblFood.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblFood.setText("Food");

        jTableFood.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultTableModel model1 = new DefaultTableModel(); 
        jTableFood = new JTable(model1); 

        
        
        
        //CREATE the rows
        model1.addColumn("Name");
        model1.addColumn("Color");
        model1.addColumn("Weight (KG)");
        model1.addColumn("Director");

        
        
        //FiLl the table
        //TODO peut etre implementer un sort
        for(int i=0; i<Repository.AlimentsList.size(); i++) {
			model1.addRow(new Object[]{Repository.AlimentsList.get(i).nom,
					Repository.AlimentsList.get(i).couleur,
					Repository.AlimentsList.get(i).poids,
					(Repository.AlimentsList.get(i).Directeur.prenom + " "+ Repository.MeublesList.get(i).Directeur.nom),
					}
					);}
			

        jTableFood.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableFood.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTableFood);

        cBoxManagerFood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        for(int i=0; i<Repository.DirectorList.size(); i++) {
        	cBoxManagerFood.addItem(Repository.DirectorList.get(i).nom);
       }
        

        lblDirector.setText("Director");

        lblFoodName.setText("Name");

        lblColor.setText("Color");

        txtFoodWeight.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
            }
        });

        lblWeight.setText("Weight");

        jBoxColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NA", "White", "Yellow", "Blue", "Red", "Green", "Black", "Brown", "Azure", "Ivory", "Teal", "Silver", "Purple", "Navy blue", "Pea green", "Gray", "Orange", "Maroon", "Charcoal", "Aquamarine", "Coral", "Fuchsia", "Wheat", "Lime", "Crimson", "Khaki", "Hot pink", "Magenta", "Olden", "Plum", "Olive", "Cyan" }));

        btnDeleteSelectedFood.setText("Delete Selected");
        btnDeleteSelectedFood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteSelectedFoodMouseClicked(evt);
            }
        });

        btnAddFood.setText("Add Food");
        btnAddFood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddFoodMouseClicked(evt);
            }
        });

        btnCloseInFood.setBackground(java.awt.Color.red);
        btnCloseInFood.setText("CLOSE");
        btnCloseInFood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	btnClose(evt);
            }
        });

        javax.swing.GroupLayout jPanelFoodLayout = new javax.swing.GroupLayout(jPanelFood);
        jPanelFood.setLayout(jPanelFoodLayout);
        jPanelFoodLayout.setHorizontalGroup(
            jPanelFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFoodLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFoodLayout.createSequentialGroup()
                        .addComponent(lblFood, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelFoodLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFoodLayout.createSequentialGroup()
                                    .addGroup(jPanelFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblDirector, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblColor)
                                            .addComponent(lblFoodName)))
                                    .addGroup(jPanelFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanelFoodLayout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanelFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanelFoodLayout.createSequentialGroup()
                                                    .addGap(6, 6, 6)
                                                    .addComponent(txtFoodName)
                                                    .addContainerGap())
                                                .addComponent(cBoxManagerFood, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanelFoodLayout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(jBoxColor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addContainerGap())))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFoodLayout.createSequentialGroup()
                                    .addGroup(jPanelFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFoodLayout.createSequentialGroup()
                                            .addComponent(lblWeight)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtFoodWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnDeleteSelectedFood, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAddFood, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap()))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFoodLayout.createSequentialGroup()
                                .addComponent(btnCloseInFood, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanelFoodLayout.setVerticalGroup(
            jPanelFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFoodLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFood, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanelFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelFoodLayout.createSequentialGroup()
                        .addGroup(jPanelFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cBoxManagerFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanelFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFoodName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFoodName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblColor)
                            .addComponent(jBoxColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFoodWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblWeight))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddFood, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteSelectedFood, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCloseInFood, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        lblDirector.getAccessibleContext().setAccessibleName("D");
        lblDirector.getAccessibleContext().setAccessibleDescription("");
        lblFoodName.getAccessibleContext().setAccessibleName("Name");
        lblWeight.getAccessibleContext().setAccessibleName("");

        jTabbedPane1.addTab("Food", jPanelFood);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProductManagemet, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProductManagemet, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }                    

                               

    private void btnAddFoodMouseClicked(java.awt.event.MouseEvent evt) {                                        
    	 try {
      	   //Find the director
      	   int DirectorIndex = cBoxManagerFood.getSelectedIndex();
      	 
      	   
             //Find the Director
      	 Aliments toAddAliment = new Aliments(Repository.DirectorList.get(DirectorIndex), 
      			  txtFoodName.getText(), 
      			 jBoxColor.getSelectedItem().toString(),
      			 Double.parseDouble(txtFoodWeight.getText()));
      	   
      	   Repository.AlimentsList.add(toAddAliment);
      	   
      	   //Refresh the table
      	   
      	   AlimentManagement newInstanceAM = new AlimentManagement();
      	   newInstanceAM.setVisible(true);
      	   super.dispose();
      	   
         } catch (Exception e) {
      	   JOptionPane.showInternalMessageDialog(null, "Something went Wrong. Please check your values and try again!" );
      	 System.out.println(e.getMessage());
      	System.out.println(txtFoodName.getText());
  	}
    }                                       

    private void btnDeleteSelectedFoodMouseClicked(java.awt.event.MouseEvent evt) {                                                   
    	  //To delete furniture
    	try {
    		int selectedPosition =  jTableFood.getSelectedRow();
        	Repository.AlimentsList.remove(selectedPosition);
        	((DefaultTableModel)jTableFood.getModel()).removeRow(jTableFood.getSelectedRow());
        	
        	} catch (Exception e){
        		//Catch if nothing is selected
        		JOptionPane.showInternalMessageDialog(null, "Nothing is Selected!" );

        	};
    }                                                  

    private void btnClose(java.awt.event.MouseEvent evt) {                                            
        //Close the page
    	Main main = new Main();
    	main.setVisible(true);
    	super.dispose();
    	}                                           


    private void btnDeleteSelectedFurnitureMouseClicked(java.awt.event.MouseEvent evt) {                                                        
        //To delete furniture
    	try {
    		int selectedPosition =  jTableFurniture.getSelectedRow();
        	Repository.MeublesList.remove(selectedPosition);
        	((DefaultTableModel)jTableFurniture.getModel()).removeRow(jTableFurniture.getSelectedRow());
        	
        	} catch (Exception e){
        		//Catch if nothing is selected
        		JOptionPane.showInternalMessageDialog(null, "Nothing is Selected!" );

        	};
    }                                                       



    private void btnAddFurnitureMouseClicked(java.awt.event.MouseEvent evt) {                                             
       try {
    	   //Find the director
    	   
    	   int DirectorIndex = cBoxManagerFurniture.getSelectedIndex();

    	   
           //Find the Director
    	   meubles toAddFurniture = new meubles(Repository.DirectorList.get(DirectorIndex), 
    			   cBoxFurnitureType.getSelectedItem().toString(), 
    			   Double.parseDouble(txtFurniturePrice.getText()), 
    			   Double.parseDouble(txtFurniturePrice.getText()));
    	   
    	   Repository.MeublesList.add(toAddFurniture);
    	   System.out.println(toAddFurniture);
    	   
    	   //Refresh the table
    	   
    	   AlimentManagement newInstanceAM = new AlimentManagement();
    	   newInstanceAM.setVisible(true);
    	   super.dispose();
    	   
       } catch (Exception e) {
    	   JOptionPane.showInternalMessageDialog(null, "Something went Wrong. Please check your values and try again!" );
	}
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
            java.util.logging.Logger.getLogger(AlimentManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlimentManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlimentManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlimentManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlimentManagement().setVisible(true);
            }
        });
    }

    // Variables declaration               
    private javax.swing.JLabel LblFurnitureHMax;
    private javax.swing.JButton btnAddFood;
    private javax.swing.JButton btnAddFurniture;
    private javax.swing.JButton btnCloseInFood;
    private javax.swing.JButton btnCloseInFurniture;
    private javax.swing.JButton btnDeleteSelectedFood;
    private javax.swing.JButton btnDeleteSelectedFurniture;
    private javax.swing.JComboBox<String> cBoxFurnitureType;
    private javax.swing.JComboBox<String> cBoxManagerFood;
    private javax.swing.JComboBox<String> cBoxManagerFurniture;
    private javax.swing.JComboBox<String> jBoxColor;
    private javax.swing.JPanel jPanelFood;
    private javax.swing.JPanel jPanelFurniture;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableFood;
    private javax.swing.JTable jTableFurniture;
    private javax.swing.JLabel lblColor;
    private java.awt.Label lblDirector;
    private java.awt.Label lblDirector1;
    private javax.swing.JLabel lblFood;
    private javax.swing.JLabel lblFoodName;
    private javax.swing.JLabel lblFurniture;
    private javax.swing.JLabel lblFurniturePrice;
    private javax.swing.JLabel lblFurnitureType;
    private javax.swing.JLabel lblProductManagemet;
    private javax.swing.JLabel lblWeight;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTextField txtFoodName;
    private javax.swing.JTextField txtFoodWeight;
    private javax.swing.JTextField txtFurnitureHmax;
    private javax.swing.JTextField txtFurniturePrice;
    // End of variables declaration                   
}
