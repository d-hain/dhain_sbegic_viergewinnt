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
 * * Constructors
 * * Getters and Setters
 * * checkWin
 * * someone has won or it is a tie
 * * restart
 * * restart the game from the beginning
 * * undo
 * * undo last move
 */
public class PlayField{
    private Tile[][] field;
    private static int counter = 0;

    public Tile[][] getField(){
        return field;
    }

    public void setTile(int x, int y, Tile tile){
        field[x][y] = tile;
        counter++;
    }

    /**
     * Constructor for the Tile Array
     *
     * @param maxX   maximal x of the 2D Array
     * @param maxY   maximal y of the 2D Array
     */
    public PlayField(int maxX, int maxY){
        field = new Tile[maxX][maxY];

        for(int ix = 0; ix < maxX; ix++){
            for(int iy = 0; iy < maxY; iy++){
                field[ix][iy] = new Tile(" ");
            }
        }
    }

    /**
     * Checks if a Player has won
     *  (sehr ineffizient)(sehr Hardcoded, aber GUI muss auch noch gemacht werden) :,(
     *
     * @param currPTile current Player Tile
     * @return true ... Player has won
     *         false ... Player has not won
     */
    public boolean checkWin(Tile currPTile) {
        boolean hasWon = false;

        // vertical
        for (int ix = 0; ix < 7; ix++) {
            for (int iy = 0; iy < 3; iy++) {
                if(field[ix][iy] == currPTile && field[ix][iy + 1] == currPTile && field[ix][iy + 2] == currPTile && field[ix][iy + 3] == currPTile){
                    hasWon = true;
                    break;
                }
            }
        }

        // horizontal
        for (int iy = 0; iy < 6; iy++) {
            for (int ix = 0; ix < 4; ix++) {
                if (field[ix][iy] == currPTile && field[ix + 1][iy] == currPTile && field[ix + 2][iy] == currPTile && field[ix + 3][iy] == currPTile) {
                    hasWon = true;
                    break;
                }
            }
        }

        // left top to right bottom
        for (int ix = 0; ix < 4; ix++) {
            for (int iy = 0; iy < 3; iy++) {
                if (field[ix][iy] == currPTile && field[ix + 1][iy + 1] == currPTile && field[ix + 2][iy + 2] == currPTile && field[ix + 3][iy + 3] == currPTile) {
                    hasWon = true;
                    break;
                }
            }
        }

        // left bottom to right top
        for (int ix = 0; ix < 4; ix++) {
            for (int iy = 5; iy > 2; iy--) {
                if (field[ix][iy] == currPTile && field[ix + 1][iy - 1] == currPTile && field[ix + 2][iy - 2] == currPTile && field[ix + 3][iy - 3] == currPTile) {
                    hasWon = true;
                    break;
                }
            }
        }

        return hasWon;
    }

    /**
     * checks if the game is a tie
     *
     * @return true ... the game is a Tie
     *         false ... the game is not a Tie
     */
    public boolean checkTie() {
        return counter == (7 * 6);
    }
}
