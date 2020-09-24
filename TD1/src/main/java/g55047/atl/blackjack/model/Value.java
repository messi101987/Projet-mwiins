package g55047.atl.blackjack.model;

/**
 *
 * @author Marika Winska 55047
 */
public enum Value {
    AS(1), DEUX(2), TROIS(3), QUATRE(4), CINQ(5), SIX(6), SEPT(7), HUIT(8), NEUF(9), DIX(10), VALET(10), DAME(10), ROI(10);

    final private int valueCard;

    private Value(int valueCard) {
        this.valueCard = valueCard;
    }

    public int getValue() {
        return valueCard;
    }
}
