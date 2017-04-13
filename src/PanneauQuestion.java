import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Javier-Laptop on 3/31/2017.
 */
public class PanneauQuestion extends PanneauOuiNon{

    private BdQuestionsReponses bd;
    private PanneauPrincipal principal;

    public PanneauQuestion(BdQuestionsReponses bd, PanneauPrincipal principal){

        super(bd, principal);
        JLabel label = new JLabel();
    }

    private class MyActionListenerOui implements ActionListener{

        public void actionPerformed(ActionEvent event) {

            if(event.getSource() == ){


            }
        }
    }

    private class MyActionListenerNon implements  ActionListener{

        public void actionPerformed(ActionEvent eventt){


        }

    }

}
