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
import javafx.scene.input.MouseEvent;
import our.connectfour.model.*;
import our.connectfour.view.*;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ConnectFourConsole
 *      Game Loop, etc.
 */
public class ConnectFourConsole{
    private PlayField playField = new PlayField(7, 6, 4);  // playField with 7 columns and 6 rows
    private final PlayFieldViewConsole pfvc = new PlayFieldViewConsole();
    private final InputViewConsole ivc = new InputViewConsole();
    private final ErrorViewConsole evc = new ErrorViewConsole();
    private final Game game = new Game();
    private int[] tilesLeft = {5, 5, 5, 5, 5, 5, 5};

    /**
     * starts the play() method
     * @param args System Arguments
     */
    public static void main(String[] args){
        ConnectFourConsole cfc = new ConnectFourConsole();
        cfc.play();
    }

    /**
     * play is the main function, where the game loop is located.
     */
    private void play(){
        int input;
        int win = 0;
        Scanner scanner = new Scanner(System.in);

        // read in names and player shapes
        game.initGame();
        while(win == 0){
            pfvc.display(playField);
            do{
                String tempInput;

                // output which players move it is
                if(game.currPlayer == 1){
                    ivc.display(game.p1);
                }else if(game.currPlayer == 2){
                    ivc.display(game.p2);
                }else{
                    throw new IndexOutOfBoundsException();
                }
                // get player input
                tempInput = scanner.nextLine();
                // check if input is "r" or "restart" and restart the game
                if(checkRestartText(tempInput)){
                    restart();
                }
                input = Integer.parseInt(tempInput);

                // check if input is valid
                if(input < 0 || input > 6){
                    evc.display("That is not a valid input!!!");
                }
                if(tilesLeft[input] < 0){
                    evc.display("No space left in this column!");
                }
            } while(input < 0 || input > 6 || tilesLeft[input] < 0);

            // set the right shape in the playing field
            int col = input;
            int row = evalTilesLeft(col);
            if(game.currPlayer == 1){
                // Player 1's move
                playField.setTile(col, row, game.p1.getTile());
                //TODO: checkWin -> boolean
                //win = playField.checkWin(col, row, game.p1.getTile());
                if(win != 2){
                    game.currPlayer = 2;
                }
            } else if(game.currPlayer == 2){
                // Player 2's move
                playField.setTile(col, row, game.p2.getTile());
                //TODO: checkWin -> boolean
                //win = playField.checkWin(col, row, game.p2.getTile());
                if(win != 2){
                    game.currPlayer = 1;
                }
            } else{
                // Error
                throw new IndexOutOfBoundsException();
            }
        }

        // Winning or Tie message
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

        // Ask to restart the game
        System.out.println("Do you want to restart the game?");
        String temp = scanner.nextLine();
        if(checkRestartYes(temp)){
            restart();
        }
    }

    /**
     * Calculate the row in which the input should happen
     * @param col column
     * @return row
     */
    private int evalTilesLeft(int col){
        tilesLeft[col]--;
        return tilesLeft[col] + 1;
    }

    /**
     * check if input is "yes" or "y" (not case sensitive)
     * @param input player input
     * @return true ... input matches "yes" or "y"
     *         false ... input does not match
     */
    private boolean checkRestartYes(String input){
        Pattern pattern = Pattern.compile("(?i)(yes)|(y)(?i)");
        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }

    /**
     * check if input is "restart" or "r" (not case sensitive)
     * @param input player input
     * @return true ... input matches "restart" or "r"
     *         false ... input does not match
     */
    private boolean checkRestartText(String input){
        Pattern pattern = Pattern.compile("(?i)(restart)|(r)(?i)");
        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }

    /**
     * Restart the game from the beginning
     */
    private void restart(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        playField = new PlayField(6, 7, 4);     // reset Playing Field
        tilesLeft = new int[]{5, 5, 5, 5, 5, 5, 5};     // reset tiles left to drop
        play();
    }


}