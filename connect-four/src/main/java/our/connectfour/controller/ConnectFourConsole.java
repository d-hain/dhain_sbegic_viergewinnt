package our.connectfour.controller;

import our.connectfour.model.PlayField;
import our.connectfour.model.Player;
import our.connectfour.model.Tile;

public class ConnectFourConsole{
    PlayField playField = new PlayField(new Tile[42]);  // playField with 6 rows and 7 columns
    Player p1 = new Player();
    Player p2 = new Player();

    private void play(){

    }

    private int generateNumber(int start, int end){
        return 0;
    }

    private void restart(){

    }

    private void undo(){

    }

    private boolean isLegalMove(){
        return false;
    }
}