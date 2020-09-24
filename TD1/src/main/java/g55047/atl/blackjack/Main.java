package g55047.atl.blackjack;

import g55047.atl.blackjack.controller.Controller;
import g55047.atl.blackjack.model.Game;
import g55047.atl.blackjack.view.View;

/**
 *
 * @author Marika Winska 55047
 */
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Game(), new View());
        controller.deroulementDuJeu(2);
    }
}
