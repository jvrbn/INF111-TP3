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

<<<<<<< HEAD
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
	
	
	
	
	
	
=======
    private BdQuestionsReponses bd;
    private PanneauPrincipal principal;
    private JButton buttonOui = new JButton();
    private JButton buttonNon = new JButton();

    public PanneauOuiNon(BdQuestionsReponses bd, PanneauPrincipal principal){
        this.bd = bd;
        this.principal = principal;
    }

    public BdQuestionsReponses getBd() {
        return bd;
    }

    public void setBd(BdQuestionsReponses bd) {
        this.bd = bd;
    }

    public PanneauPrincipal getPrincipal() {
        return principal;
    }

    public void setPrincipal(PanneauPrincipal principal) {
        this.principal = principal;
    }
>>>>>>> origin/master

}
