/*-----------------------------------------------------------------------------
 *              Hoehere Technische Bundeslehranstalt STEYR
 *           Fachrichtung Elektronik und Technische Informatik
 *----------------------------------------------------------------------------*/
/**
 * Kurzbeschreibung
 *
 * @author : Semin Begic, David Hain
 * @date : 28.01.2022
 * @details Hier findet das Spiel seinen Lauf. Es Ruft die nötigen funktionen auf und stellt so
 * das Spiel zusammen.
 * generateNumber hilft nur bei der Generierung des Startspielers
 */

package our.connectfour.controller;
import our.connectfour.model.*;
import our.connectfour.view.*;

import java.util.Scanner;

public class ConnectFourConsole{
    private PlayField playField = new PlayField(6, 7);  // playField with 6 rows and 7 columns
    private PlayFieldViewConsole pfvc = new PlayFieldViewConsole();
    private InputViewConsole ivc = new InputViewConsole();
    private ErrorViewConsole evc = new ErrorViewConsole();
    private Game game = new Game();
    private int[] tilesLeft = {5, 5, 5, 5, 5, 5, 5};

    public static void main(String[] args){
        ConnectFourConsole cfc = new ConnectFourConsole();
        cfc.play();
    }

    /**
     *
     * play is the main function, where the game is getting started.
     */
    private void play(){
        int input = -1;
        int win = 0;
        Scanner scanner = new Scanner(System.in);

        game.initGame();
        while(win == 0){
            pfvc.display(playField);
            do{
                String tempInput = "";

                ivc.display();
                tempInput = scanner.nextLine();
                input = Integer.parseInt(tempInput);

                if(input < 0 || input > 6){
                    evc.display("That is not a valid input!!!");
                }
                if(evalTilesLeft(input) < 0){
                    evc.display("No space left in this column!");
                }
            } while(input < 0 || input > 6 || evalTilesLeft(input) < 0); // TODO: eine col kann zu "hoch" werden

            int col = input;
            int row = evalTilesLeft(col);
            if(game.currPlayer == 1){
                // Player 1's move
                playField.setTile(row, col, game.p1.getTile());
                win = playField.checkWin(col, row, game.p1.getTile());
                game.currPlayer = 2;
            } else if(game.currPlayer == 2){
                // Player 2's move
                playField.setTile(row, col, game.p2.getTile());
                win = playField.checkWin(col, row, game.p2.getTile());
                game.currPlayer = 1;
            } else{
                // Error
                throw new IndexOutOfBoundsException();
            }
        }

        pfvc.display(playField);
        if (win == 2 && game.currPlayer == 1) {
            // Player 1 has won
            game.endGame(game.p1, false);
        } else if (win == 2 && game.currPlayer == 2) {
            // Player 2 has won
            game.endGame(game.p2, false);
        } else if (win == 1) {
            game.endGame(new Player("NONEXISTENTPERSON"), true);
        }
    }

    public int evalTilesLeft(int col){
        tilesLeft[col]--;
        return tilesLeft[col] + 1;
    }

    /**
     *
     * @param start ist der Startwert, bei dem die randomNumber beginnen soll.
     * @param end ist der Endwert, bei dem die randomNumber aufhören soll.
     * @return gibt die generierte zufällige Zahl zurück.
     */
    private int generateNumber(int start, int end){
        return (int) (Math.random() * (end - start + 1)) + start;
    }
}