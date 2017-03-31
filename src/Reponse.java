import javax.swing.*;
import java.util.ArrayList;

/**
 * Cette classe sert à la sauvegarde des réponses par les attributs assignés.
 *
 *
 *
 *
 * @author Antranik-Anthony Karabian et Javier Beltran
 * @version mars 2017
 */

public class Reponse {

    private String reponse;
    private ImageIcon image;
    private ArrayList<Character> indice = new ArrayList<Character>();

    /**
     * Constructeur de la classe reponse.
     * Inisialisation des atributs.
     * @param reponse String de la reponse
     * @param indice Char "O" ou "N" de la reponse, obtenu par l'utilisateur
     */
    public Reponse(String reponse, ImageIcon image){

        this.reponse = reponse;
        this.image = image;
        //indice.add('+indice+');

    }

}
