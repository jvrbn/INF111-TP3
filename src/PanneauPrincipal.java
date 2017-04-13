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
	
	
	
public static void main(String[] args){
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	
            	
               
                
                
            }
        });
	}
	
/**
 * Met � jour le panneau principal avec la bd du cadre.  
 * et reconstruit le panneau du centre selon l'arbre de la bd.
 * 
 * @author Pierre B�lisle
         */
public void miseAJour() {
// Pas toujours n�cessaire mais toujours fait quand m�me.
//this.bd = cadreBd.getBd();
//Il arrive au d�but que la bd est vide.  On cr�e le panneau seulement si 
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

