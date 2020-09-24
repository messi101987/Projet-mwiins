/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g55047.atl.blackjack.model;

import java.util.List;

/**
 *
 * @author oscartison
 */
public interface Model {

    public void demarrerJeu();

    public void piocherCarte();

    public void calculerScore();

    public void changeTour();

    public List<Card> getMain();

    public Deck getDeck();

    public int getScorePersonnel();

    public int getScoreBanque();

    public boolean isTourPersonnel();
}
