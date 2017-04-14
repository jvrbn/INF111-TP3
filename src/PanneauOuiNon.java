import java.awt.BorderLayout;
import java.awt.Component;
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

	private int index;
	private BdQuestionsReponses bd;
    private PanneauPrincipal principal;
    

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
		
		pane.add(pane, index);
		
		
	}
	
	public static void addComponents() {
		

        
    }
 
	private void addPanneau(){

        
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
	

    

}
