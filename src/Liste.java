/**
 * Created by Javier-Laptop on 3/29/2017.
 */
public class Liste {

	// indice de la liste
	private int nbElements = 0;
	private Maillon head;
	/**
	 * Ajouter les indices dynamiquement dans une liste 
	 * 
	 * @param reponseUtil : indices donnés (juste des ‘O’ et des ‘N’) 
	 * par l'utilisateur pour aboutir la reponse
	 * 
	 */
	public void insererApres(char reponseUtil) {		
		++nbElements;
		if (this.estVide()) {
			this.head = new Maillon(reponseUtil);
		} else {

			Maillon tmp = this.head;
			while (tmp.getNext() != null) {
				tmp = tmp.getNext();
			}
			tmp.setNext(new Maillon(reponseUtil));
		}
	}
	/**
	 * estVide
	 * @return
	 */
	public boolean estVide() {
		return this.nbElements == 0;
	}
	
	public int getNbElements() {
		return this.nbElements;
	}

	public void setPcDebut() {
        this.nbElements=0;
	}

	public char getElement() throws Exception{
		if(!estVide())
		{
			throw new Exception("Element est vide");
				 	
		}
		Maillon tmp = this.head;
		return tmp.getValeur();
	}
	
	public void setPcSuivant() {
		this.nbElements++;
	}

}
