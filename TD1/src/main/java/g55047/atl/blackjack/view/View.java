package g55047.atl.blackjack.view;

import g55047.atl.blackjack.model.Game;
import java.util.Scanner;

/**
 *
 * @author Marika Winska 55047
 */
public class View {

    public void demandeDePiocher(Game game) {
        boolean continuer = true;
        while (continuer) {
            System.out.println("Voulez-vous encore piocher une carte ?");
            Scanner clavier = new Scanner(System.in);
            String answer = clavier.next().toUpperCase();
            if (answer.equals("oui")) {
                game.piocherCarte();
                game.calculerScore();
                afficherDerniereCarte(game);
                afficherScore(game);
                //continuer = game.getScorePersonnel() < 21;
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

    public void afficherDerniereCarte(Game game) {
        System.out.println(game.getMain().get(0).toString());
    }

    public void afficherScore(Game game) {
        if (game.isTourPersonnel()) {
            System.out.println("Votre score est de " + game.getScorePersonnel());
        } else {
            System.out.println("Le score du banquier est de  " + game.getScoreBanque());
        }
    }
    
    public void afficherVictoire() {
        System.out.println("Félicitations ! Vous avez gagné !");
    }
    
    public void afficherDefaite() {
        System.out.println("Dommage !");
    }
}
