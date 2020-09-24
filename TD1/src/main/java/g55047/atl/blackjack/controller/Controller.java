/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g55047.atl.blackjack.controller;

import g55047.atl.blackjack.model.Game;
import g55047.atl.blackjack.model.Model;
import g55047.atl.blackjack.view.View;

/**
 *
 * @author Marika Winska
 */
public class Controller {

    Model game;
    View view;

    public Controller(Game game, View view) {
        this.game = game;
        this.view = view;
    }

    public void startGame(int n) {
        game.demarerJeu();
        boolean jouer = true;
        while (jouer && !game.getDeck().isEmpty()) {
            for (int i = 0; i < n; i++) {
                game.piocherCarte();
            }
            

        }

    }

}
