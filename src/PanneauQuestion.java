import javax.swing.*;

/**
 * Created by Javier-Laptop on 3/31/2017.
 */
public class PanneauQuestion extends PanneauOuiNon{

    private JLabel label = new JLabel();

    public PanneauQuestion (BdQuestionsReponses bd, PanneauPrincipal principal, JLabel label){
        super(bd, principal);
        this.label = label;

    }



}
