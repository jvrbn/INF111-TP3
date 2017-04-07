import javax.swing.*;

/**
 * Created by Javier-Laptop on 3/31/2017.
 */
public class PanneauOuiNon extends JPanel{

    private BdQuestionsReponses bd;
    private PanneauPrincipal principal;
    JButton oui = new JButton("Oui");
    JButton non = new JButton("Non");

    public PanneauOuiNon(BdQuestionsReponses bd, PanneauPrincipal principal){

        this.bd = bd;
        this.principal = principal;

    }

    public void affichage(){

        JFrame frame = new JFrame();


    }


}
