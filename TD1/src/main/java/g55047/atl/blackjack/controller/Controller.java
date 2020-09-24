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

    public void deroulementDuJeu(int n) {
        game.demarrerJeu();
        boolean jouer = true;
        //while (jouer && !game.getDeck().isEmpty()) {
            for (int i = 0; i < n; i++) {
                game.piocherCarte();
            }
            view.afficherMain((Game) game);
            game.calculerScore();
            view.afficherScore((Game) game);
            view.demandeDePiocher((Game) game);
            game.calculerScore();
            view.afficherScore((Game) game);
            game.changeTour();
            if (game.getScorePersonnel() == 21) {
                view.afficherVictoire();
            } else if (game.getScorePersonnel() > 21) {
                view.afficherDefaite();
            } else {
                while (game.getScoreBanque() < 17) {
                    game.piocherCarte();
                    view.afficherMain((Game) game);
                    game.calculerScore();
                    view.afficherScore((Game) game);
                }
                if (game.getScoreBanque() > 21 || game.getScorePersonnel() > game.getScoreBanque()) {
                    view.afficherVictoire();
                } else {
                    view.afficherDefaite();
                }
            }
        }

    }

//}
