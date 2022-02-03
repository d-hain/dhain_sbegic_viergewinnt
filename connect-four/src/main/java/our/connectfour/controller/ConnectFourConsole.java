/*-----------------------------------------------------------------------------
 *              Hoehere Technische Bundeslehranstalt STEYR
 *           Fachrichtung Elektronik und Technische Informatik
 *----------------------------------------------------------------------------*/
/**
 * Kurzbeschreibung
 *
 * @author  : Semin Begic, David Hain
 * @date    : 28.01.2022
 *
 * @details
 *   Hier findet das Spiel seinen Lauf. Es Ruft die nötigen funktionen auf und stellt so
 *   das Spiel zusammen.
 *   generateNumber hilft nur bei der Generierung des Startspielers
 */

package our.connectfour.controller;

import our.connectfour.model.Game;
import our.connectfour.model.PlayField;
import our.connectfour.model.Player;
import our.connectfour.view.ErrorViewConsole;
import our.connectfour.view.InputViewConsole;
import our.connectfour.view.PlayFieldViewConsole;

import java.util.Scanner;

public class ConnectFourConsole{
    private PlayField playField = new PlayField(6, 7);  // playField with 6 rows and 7 columns
    private Player p1;
    private Player p2;
    private PlayFieldViewConsole pfvc = new PlayFieldViewConsole();
    private InputViewConsole ivc = new InputViewConsole();
    private ErrorViewConsole evc = new ErrorViewConsole();
    private Game game = new Game();
    private int currPlayer = 0;

    public void setCurrPlayer(int currPlayer) {
        this.currPlayer = currPlayer;
    }

    public Player getP1() {
        return p1;
    }

    public void setP1(Player p1) {
        this.p1 = p1;
    }

    public Player getP2() {
        return p2;
    }

    public void setP2(Player p2) {
        this.p2 = p2;
    }

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
        Scanner scanner = new Scanner(System.in);

        game.initGame();
        pfvc.display(playField);
        do{
            String tempInput = "";

            ivc.display();
            tempInput = scanner.nextLine();
            input = Integer.parseInt(tempInput);
        }while(input < 0 || input > 6);

        if(currPlayer == 1){
            //TODO: play() Methode
        }
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