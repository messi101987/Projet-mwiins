/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g55047.atl.blackjack.model;

import g55047.atl.blackjack.model.Card;
import g55047.atl.blackjack.model.Deck;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oscartison
 */
public class Game implements Model {

    private boolean tourJoueur = true;

    private final List<Card> main = new ArrayList<Card>();

    private Deck deck;

    private int scorePersonnel;

    private int scoreBanque;

    @Override
    public void demarerJeu() {
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
    public void changeRour() {
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
