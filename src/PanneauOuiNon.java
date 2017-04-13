import javax.swing.*;

/**
 * Created by Javier-Laptop on 3/31/2017.
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

}
