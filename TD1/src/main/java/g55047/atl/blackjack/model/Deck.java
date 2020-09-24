package g55047.atl.blackjack.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Marika Winska 55047
 */
public class Deck {

    private List<Card> cartes = new ArrayList<Card>();

    public Deck() {
        for (Color color : Color.values()) {
            for (Value value : Value.values()) {
                cartes.add(new Card(color, value));
            }
        }

    }

    public void shuffle() {
        Collections.shuffle(cartes);
    }

    public boolean isEmpty() {
        return cartes.isEmpty();
    }

    public Card hit() {
        Card card = cartes.get(0);
        cartes.remove(0);
        return card;
    }

    public int size() {
        return cartes.size();
    }

    public String toString() {
        String paquet = "";
        for (int i = 0; i < cartes.size(); i++) {
            paquet += cartes.get(i).toString() + " ";
        }
        return paquet;
    }

}
