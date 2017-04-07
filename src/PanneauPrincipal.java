import javax.swing.*;
import java.awt.*;

/**
 * Created by Javier-Laptop on 3/31/2017.
 */
public class PanneauPrincipal {

    private JPanel panel;
    private PanneauOuiNon panneauOuiNon;
    private BdQuestionsReponses bd;
    private PanneauPrincipal principal;

    JPanel panelCentre = new PanneauOuiNon(bd, principal);


    public PanneauPrincipal(){



    }

    /**
     * Met à jour le panneau principal avec la bd du cadre.
     * et reconstruit le panneau du centre selon l'arbre de la bd.
     *
     * @author Pierre Bélisle
     */
    public void miseAJour() {
        // Pas toujours nécessaire mais toujours fait quand même.
        this.bd = cadreBd.getBd();
// Il arrive au début que la bd est vide.  On crée le panneau seulement si
// elle n'est pas vide.
        if(!bd.estVide()){

            setVisible(true);
            creerPanCentral();
        }
    }

    public void creerPanCentral(){

        if(panneauOuiNon == null){


        }

    }

}
