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
import our.connectfour.model.Tile;
import our.connectfour.view.PlayFieldViewConsole;

import java.util.Scanner;

public class ConnectFourConsole{
    PlayFieldViewConsole displayField;
    Game game;

    /**
     *
     * play is the main function, where the game is getting started.
     */
    private void play(){

//        do{
//        displayField.display(game.playField);
//        Scanner in = new Scanner(System.in);
//        int inputLine = 0;
//
//        if(generateNumber(1,2) == 1){
//            System.out.println(game.p1.getName() + " beginnt das Spiel!\n");
//        }else{
//            System.out.println(game.p2.getName() + " beginnt das Spiel!\n");
//        }
//
//        do{
//            System.out.println("Bitte geben Sie ihre Gewünschte Spalte an, in der Sie Ihren Stein setzen wollen: ");
//            inputLine = in.nextInt();
//
//        }while(true); //TODO: game.playField.isLegalMove(inputLine)
//
//       //TODO: new PlayFieldViewConsole(game.playField.checkWin());
//
//        }while(game.playField.checkWin() == 3); //TODO: muss geändert werden mit checkTie
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