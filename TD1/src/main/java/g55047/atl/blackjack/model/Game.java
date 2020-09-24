package g55047.atl.blackjack.model;

import g55047.atl.blackjack.model.Card;
import g55047.atl.blackjack.model.Deck;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marika Winska 55047
 */
public class Game implements Model {

    private boolean tourJoueur = true;

    private final List<Card> main = new ArrayList<Card>();

    private Deck deck;

    private int scorePersonnel;

    private int scoreBanque;

    @Override
    public void demarrerJeu() {
        deck = new Deck();
        deck.shuffle();
        scorePersonnel = 0;
        scoreBanque = 0;
    }


    @Override
    public void piocherCarte() {
            main.add(deck.hit());
    }

    @Override
    public void calculerScore() {
        int score = 0;
        for (int i = 0; i < main.size(); i++) {
            score += main.get(i).getValeur().getValue();
        }
        if (tourJoueur) {
            scorePersonnel = score;
        } else {
            scoreBanque = score;
        }
    }


    @Override
    public void changeTour() {
        main.clear();
        tourJoueur = !tourJoueur;
    }


    @Override
    public List<Card> getMain() {
        return main;
    }

    @Override
    public Deck getDeck() {
        return deck;
    }

    @Override
    public int getScorePersonnel() {
        return scorePersonnel;
    }


    @Override
    public int getScoreBanque() {
        return scoreBanque;
    }
    
    @Override
    public boolean isTourPersonnel() {
        return tourJoueur;
    }

}
