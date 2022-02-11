/*-----------------------------------------------------------------------------
 *              Hoehere Technische Bundeslehranstalt STEYR
 *           Fachrichtung Elektronik und Technische Informatik
 *----------------------------------------------------------------------------*/
/**
 * Kurzbeschreibung
 *
 * @author : Semin Begic, David Hain
 * @date : 28.01.2022
 * @details * Tile Array (Playing Field)
 * * Constructor
 * * checkWin
 * * checks if a player has won or it is a tie
 * * restart
 * * restarts the game from the beginning
 * * undo
 * * undo the last move
 * * isLegalMove
 * * checks if the move is allowed (inside field etc.)
 */

package our.connectfour.model;

/**
 * PlayField
 *      * Constructors
 *      * Getters and Setters
 *      * checkWin
 *          * someone has won or it is a tie
 *      * restart
 *          * restart the game from the beginning
 *      * undo
 *          * undo last move
 */
public class PlayField{
    private Tile[][] field;
    private final int maxY;
    private final int maxX;

    public Tile[][] getField(){
        return field;
    }

    public void setField(Tile[][] field){
        this.field = field;
    }

    public void setTile(int x, int y, Tile tile){
        field[x][y] = tile;
    }
    /**
     * Constructor for the Tile Array
     *
     * @param maxX maximal x of the 2D Array
     * @param maxY maximal y of the 2D Array
     */
    public PlayField(int maxX, int maxY){
        this.maxX = maxX;
        this.maxY = maxY;
        field = new Tile[maxX][maxY];

        for(int x = 0; x < maxX; x++){
            for(int y = 0; y < maxY; y++){
                field[x][y] = new Tile(" ");
            }
        }
    }

    /**
     * Checks if a Player has won, or it is a tie
     *
     * @param currX the X-Pos of the last move
     * @param currY the Y-Pos of the last move
     * @param tile current Player Tile
     * @return 0 ... no one has won
     *         1 ... it is a tie
     *         2 ... a player has won
     */ //TODO: Change to Boolean and implement checkTie() in ConnectFourConsole
    public int checkWin(int currX, int currY, Tile tile){
        int win = 0;
        int winCount = 0;
        // horizontal checking - to right
        for(int ix = currX; ix < maxX; ix++){
            if(field[ix][currY] != tile || winCount == 4){
                break;   //Bitte ned hauen :D
            }else if(field[ix][currY] == tile){
                winCount++;
            }
        }

        //TODO: rest of checks

        if(winCount == 4){
            win = 2;
        }
        //TODO: ?!
//        if(checkTie()){
//            win = 1;
//        }
        return win;
    }

    /**
     * Checks if the game is a tie
     * @return true ... game is a tie
     *         false ... game is not a tie
     */
    private boolean checkTie(){
        boolean isTie = false;
 //TODO: mochn
        for(int iy = 0; iy < maxY; iy++){
            for(int ix = 0; ix < maxX; ix++){

            }
        }

        return isTie;
    }
}
