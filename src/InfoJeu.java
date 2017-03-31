/**
 * Cette classe contient tout le fonctionnement de l'arborescence
 *
 * Ça relie chaque noeud par les références gauches droites.
 *
 * @author Antranik-Anthony Karabian et Javier Beltran
 * @version mars 2017
 */

public class InfoJeu extends ArbreConnaissance{

<<<<<<< Updated upstream
    public InfoJeu premierNoeud;
    public InfoJeu noeudCourant;
    public InfoJeu noeudPrecedent;
    public boolean derniereReponseEtaitPositive;

    public InfoJeu (){

        super();

    }
=======
	public InfoJeu(int indiceQuestionOuReponse, ArbreConnaissance reponsePositive, ArbreConnaissance reponseNegative) {
		super(indiceQuestionOuReponse, reponsePositive, reponseNegative);
		// TODO Auto-generated constructor stub
	}
	public InfoJeu noeudCourant;
    public boolean dernierIndice;
	public InfoJeu premierNoeud;
	public boolean derniereReponseEtaitPositive;
	public InfoJeu noeudPrecedent;

   
>>>>>>> Stashed changes


}
