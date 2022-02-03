package our.connectfour.model;

import our.connectfour.view.PlayFieldViewConsole;

public class Game{
    public PlayField playField = new PlayField(new Tile[6][7]);  // playField with 6 rows and 7 columns
    public Player p1;
    public Player p2;

    public void initGame(){

    }
}
