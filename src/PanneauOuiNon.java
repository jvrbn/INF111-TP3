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

public class PanneauOuiNon extends JPanel{

	private final BdQuestionsReponses bd;
	private final PanneauPrincipal pp;
	
	public PanneauOuiNon(BdQuestionsReponses bd,PanneauPrincipal pp){
		
		this.bd= bd;
		this.pp=pp;
	}
	
	public void ajoute(){
		
		
	JButton boui = new JButton("OUI"); 
	JButton bnon = new JButton("NON"); 
	
	boui.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}
	});
	
	bnon.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}
	});
	
	
	
	}
	
	public void remove(int index){
		
		
		
	}
	
	public void add(Container pane, int index){
		
		
		
		
	}
	
	
	
	
	
	

}
