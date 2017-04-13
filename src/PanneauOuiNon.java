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

	
	public void ajoute(){
		
	
	}
	
	public void remove(int index){
		
		
		
	}
	
	public void add(Container pane, int index){
		
		
		
		
	}
	
	
	private class MyActionListenerOui implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            
        }
    }

    private class MyActionListenerNon implements  ActionListener{

        public void actionPerformed(ActionEvent e){


        }

    }
	
	
	

    

}
