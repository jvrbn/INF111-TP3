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
    private Reponse description;

    /**
     * Constructeur de la classe reponse.
     * Inisialisation des atributs.
     * @param reponse String de la reponse
     * @param image Image de la reponse
     */
    public Reponse(String reponse, ImageIcon image){

        this.reponse = reponse;
        this.image = image;

    }

    public ImageIcon getImage() {
        return this.image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    public Reponse getDescription() {
        return description;
    }

    public void setDescription(Reponse description) {
        this.description = description;
    }

	public void setChemin(Liste cheminParcouru) {

	}

	public Liste getCheminParcouru() {
		return 0;
	}

}
