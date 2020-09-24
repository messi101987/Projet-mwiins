/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g55047.atl.blackjack.view;

import g55047.atl.blackjack.model.Game;
import java.util.Scanner;

/**
 *
 * @author oscartison
 */
public class View {

    public void askPlaying(Game game) {
        boolean continuer = true;
        while (continuer) {
            System.out.println("Voulez-vous encore piocher une carte?");
            Scanner clavier = new Scanner(System.in);
            String answer = clavier.next().toUpperCase();
            if (answer.equals("oui")) {
                game.piocherCarte();
                game.calculerScore();
                afficherMain(game);
                afficherScore(game);
            } else {
                continuer = false;
            }
        }
    }

    public void afficherMain(Game game) {
        for (int i = 0; i < game.getMain().size(); i++) {
            System.out.println(game.getMain().get(i).toString());
        }
    }

    public void afficherScore(Game game) {
        if (game.isTourPersonnel()) {
            System.out.println("votre score est de " + game.getScorePersonnel());
        } else {
            System.out.println("Le score du banquier est de  " + game.getScoreBanque());
        }
    }
}
