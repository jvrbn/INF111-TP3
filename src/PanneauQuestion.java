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

public class PanneauQuestion extends PanneauOuiNon{

    private BdQuestionsReponses bd;
    private PanneauPrincipal principal;
    
    
    public PanneauQuestion(BdQuestionsReponses bd, PanneauPrincipal principal){

        super(bd, principal);
        
    }

    public void addQuestion(){
    	JLabel label = new JLabel((String) bd.getLaChaineActuelle());

    }
    
    

}

