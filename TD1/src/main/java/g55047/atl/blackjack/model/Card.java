package g55047.atl.blackjack.model;

/**
 *
 * @author Marika Winska 55047
 */
public class Card {

    private Color couleur;
    private Value valeur;

    public Card(Color couleur, Value valeur) {
        this.couleur = couleur;
        this.valeur = valeur;
        if (couleur == null || valeur == null) {
            throw new IllegalArgumentException("Impossible");
        }
    }

    public Color getCouleur() {
        return couleur;
    }

    public Value getValeur() {
        return valeur;
    }

    @Override
    public String toString() {
        return valeur + " DE " + couleur;
    }

}
