/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g55047.atl.blackjack.model;

/**
 *
 * @author g55047
 */
public enum Value {
    ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(10), QUEEN(10), KING(10);
    
 final private int valueCard;
        
        private Value(int valueCard) {
        this.valueCard = valueCard;
    }

    public int getValue() {
        return valueCard;
    }
}
