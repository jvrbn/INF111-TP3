import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
/**
 * 
 * 
 *@author Antranik-Anthony Karabian et Javier Beltran
 * @version mars 2017
 *
 */

public class CadreDivinateur extends JFrame implements Runnable{
	
	private BdQuestionsReponses bd;
    private PanneauPrincipal principal;
    
	public CadreDivinateur(PanneauPrincipal principal, BdQuestionsReponses bd) throws HeadlessException {
		super();
		this.principal = principal;
		this.bd=bd;
	}



	@Override
	public void run() {
		
		BdQuestionsReponses bd = new BdQuestionsReponses();
		//PanneauPrincipal principal= new PanneauPrincipal();
		
	}

}
