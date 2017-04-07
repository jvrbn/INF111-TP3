
public class Maillon {
	//ATTRIBUTS
    private char valeur;
    private Maillon next;

    /**
     * Constructeur
     *
     * @param valeur
     */
    public Maillon(char valeur) {
        this.valeur = valeur;
    }

    /**
     *
     * @return
     */
    public char getValeur() {
        return valeur;
    }

    /**
     *
     * @param valeur
     */
    public void setValeur(char valeur) {
        this.valeur = valeur;
    }

    /**
     *
     * @return
     */
    public Maillon getNext() {
        return next;
    }

    /**
     *
     * @param next
     */
    public void setNext(Maillon next) {
        this.next = next;
    }

}
