package tp2JeanKhouryPck;
//JEAN KHOURY
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;


public class UserInterface{
    private JFrame mainFrame;
    private JPanel jPanelFaireUneRecherche;
    private int width = 500;
    private int height = 500;
    private JTextField txtRecherche;
    private JLabel lblNewLabel;
    private JTable table;
    public UserInterface(){
        prepareGUI();
    }
    
    public void prepareGUI(){
        mainFrame = new JFrame("Recherche utilisateur JEAN KHOURY"); //Initiates the JFrame. The string parameter is the title that appears on the top of the program.
        mainFrame.setSize(width, height); //As the method implies, this sets the size of the JFrame. The methods calls for two int parameters, width and height respectively.
        mainFrame.getContentPane().setLayout(new GridLayout(0, 1)); //this creates the layout for the JFrame. There are numerous different types of layouts, but GridLayout typically works the best for JFrames. More on different layouts will be //mentioned later.
        
        mainFrame.addWindowListener(new WindowAdapter(){//this section of code looks somewhat intimidating, but it's purpose is to simply tell the JFrame to close when you x out.
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        
        jPanelFaireUneRecherche = new JPanel();//initiates JPanel example
       // jPanelMain.setLayout(new FlowLayout()); //sets the layout for the JPanel. FlowLayout is very limited, but it's easy to begin with
        mainFrame.getContentPane().add(jPanelFaireUneRecherche);
        
        lblNewLabel = new JLabel("Faire une recherche");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 37));
        
        txtRecherche = new JTextField();
        txtRecherche.setToolTipText("Entrer une query");
        txtRecherche.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
        txtRecherche.setColumns(20);
        
        JButton btnRecherche = new JButton("RECHERCHE");
        btnRecherche.setForeground(Color.BLACK);
        btnRecherche.setMnemonic('R');
        
        JScrollPane scrollPane = new JScrollPane();
        GroupLayout gl_jPanelFaireUneRecherche = new GroupLayout(jPanelFaireUneRecherche);
        gl_jPanelFaireUneRecherche.setHorizontalGroup(
        	gl_jPanelFaireUneRecherche.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_jPanelFaireUneRecherche.createSequentialGroup()
        			.addGroup(gl_jPanelFaireUneRecherche.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_jPanelFaireUneRecherche.createSequentialGroup()
        					.addGap(20)
        					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 456, GroupLayout.PREFERRED_SIZE))
        				.addGroup(gl_jPanelFaireUneRecherche.createSequentialGroup()
        					.addGap(20)
        					.addComponent(txtRecherche, GroupLayout.PREFERRED_SIZE, 456, GroupLayout.PREFERRED_SIZE))
        				.addGroup(gl_jPanelFaireUneRecherche.createSequentialGroup()
        					.addGap(359)
        					.addComponent(btnRecherche, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
        				.addGroup(gl_jPanelFaireUneRecherche.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)))
        			.addContainerGap())
        );
        gl_jPanelFaireUneRecherche.setVerticalGroup(
        	gl_jPanelFaireUneRecherche.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_jPanelFaireUneRecherche.createSequentialGroup()
        			.addGap(20)
        			.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
        			.addGap(12)
        			.addComponent(txtRecherche, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(btnRecherche)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
        			.addContainerGap())
        );
        
        DefaultTableModel model = new DefaultTableModel(); 
        table = new JTable(model);
        table.setForeground(Color.BLACK);
        
        //Create the column
        model.addColumn("File");
        model.addColumn("Score");
        
        //FILL THE TABLE
        for(int i=0; i<SearchIndex.resultatRecherche.size();i++) {
        	model.addRow(new Object[] {
        			SearchIndex.resultatRecherche.get(i).FileName,
        			SearchIndex.resultatRecherche.get(i).Frequence
        			
        	} );
        }


        
        		
        scrollPane.setViewportView(table);
        jPanelFaireUneRecherche.setLayout(gl_jPanelFaireUneRecherche);
        
        btnRecherche.addMouseListener(new java.awt.event.MouseAdapter() {
        	public void mouseClicked(java.awt.event.MouseEvent evt) {
        		BtnRechercheMouseClicked(evt);
        	}
        });
        
    }
    
    private void BtnRechercheMouseClicked(java.awt.event.MouseEvent evt) {  
    	try {
    		String Reserched = txtRecherche.getText();
    		//Lancer la recherche
    		SearchIndex.search(Reserched);
    		UserInterface newUser = new UserInterface();
    		newUser.show();
    		

    		
    	}catch (Exception e) {
			// TODO: handle exception
		}
    	
    }
    
    public void show(){
        mainFrame.setVisible(true);//makes the JFrame visible
    }
}