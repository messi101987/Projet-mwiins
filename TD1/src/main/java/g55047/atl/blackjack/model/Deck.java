/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g55047.atl.blackjack.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author g55047
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
    

    Card hit() {
        Card card = cartes.get(0);
        cartes.remove(0);
        return card;
    }
    
    int size() {
        return cartes.size();
    }

    

    
}
