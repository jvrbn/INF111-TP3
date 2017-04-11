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

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    public String getDescription() {
        return this.reponse;
    }

	public void setChemin(Liste cheminParcouru) {
	
		
	}

	public Liste getCheminParcouru() {

		return null;
	}

    public boolean equals(String autreReponse)
	{
		return reponse.equals(autreReponse);
	}

}
