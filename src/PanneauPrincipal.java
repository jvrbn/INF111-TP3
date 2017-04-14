import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * 
 * 
 * @author Antranik-Anthony Karabian et Javier Beltran
 * @version mars 2017
 *
 */

public class PanneauPrincipal extends JPanel{

	private BdQuestionsReponses bd;
	private PanneauPrincipal pp;
	private PanneauOuiNon panOuiNon;
	
	
	
public PanneauPrincipal(BdQuestionsReponses bd,PanneauPrincipal pp){
		
		this.bd= bd;
		this.pp=pp;
	}
	
	
	
private static void createAndShowGUI() {
    //Create and set up the window.
    JFrame frame = new JFrame("BoxLayoutDemo");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   
    JPanel panOuiNon = new JPanel();
	JButton buttonOui = new JButton("OUI");
    JButton buttonNon = new JButton("NON");

    buttonOui.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			JOptionPane.showMessageDialog(null,"OUI");
		}
	});
    buttonNon.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			JOptionPane.showMessageDialog(null,"NON");
		}
	});
    
    
    panOuiNon.setAlignmentX(CENTER_ALIGNMENT);
    panOuiNon.add(buttonOui);
    panOuiNon.add(buttonNon);
    frame.setSize(600, 600);
    frame.add(panOuiNon,BorderLayout.SOUTH);
    //frame.add(pane, BorderLayout.CENTER);
    
    //Display the window.
    frame.setVisible(true);
}


public static void main(String[] args) {
    //Schedule a job for the event-dispatching thread:
    //creating and showing this application's GUI.
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            createAndShowGUI();
        }
    });
}
	
/**
 * Met à jour le panneau principal avec la bd du cadre.  
 * et reconstruit le panneau du centre selon l'arbre de la bd.
 * 
 * @author Pierre Bélisle
         */
public void miseAJour() {
// Pas toujours nécessaire mais toujours fait quand même.
//this.bd = cadreBd.getBd();
//Il arrive au début que la bd est vide.  On crée le panneau seulement si 
//elle n'est pas vide.
if(!bd.estVide()){

    setVisible(true);
    creerPanCentral();        	
    }        
}

public void creerPanCentral(){
	
	if(panOuiNon != null)
	{
		JPanel panCentral = new JPanel();
		
	}
	else{
		
		
	}
	
}
	
	
	

	
}

