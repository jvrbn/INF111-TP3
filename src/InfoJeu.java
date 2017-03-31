/**
 * Cette classe contient tout le fonctionnement de l'arborescence
 *
 * Ça relie chaque noeud par les références gauches droites.
 *
 * @author Antranik-Anthony Karabian et Javier Beltran
 * @version mars 2017
 */

public class InfoJeu extends ArbreConnaissance{


    public InfoJeu premierNoeud;
    public InfoJeu noeudCourant;
    public InfoJeu noeudPrecedent;
    public boolean derniereReponseEtaitPositive;



	public InfoJeu(int indiceQuestionOuReponse, ArbreConnaissance reponsePositive, ArbreConnaissance reponseNegative) {

        super(indiceQuestionOuReponse, reponsePositive, reponseNegative);
	}


}
