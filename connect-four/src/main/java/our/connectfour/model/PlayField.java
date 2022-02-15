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

import java.util.InputMismatchException;

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
    private final int maxY;
    private final int maxX;
    private final int winLen;

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
     * @param maxX   maximal x of the 2D Array
     * @param maxY   maximal y of the 2D Array
     * @param winLen lenght to win (in FourWins 4)
     */
    public PlayField(int maxX, int maxY, int winLen){
        this.maxX = maxX;
        this.maxY = maxY;
        if(winLen > maxX || winLen > maxY){
            throw new InputMismatchException("winLen too long");
        }
        this.winLen = winLen;

        field = new Tile[maxX][maxY];

        for(int ix = 0; ix < maxX; ix++){
            for(int iy = 0; iy < maxY; iy++){
                field[ix][iy] = new Tile(" ");
            }
        }
    }

    //TODO: comment
    //TODO: HILFE
    public boolean checkWin(){
        return false;
    }

    /**
     * Checks if the game is a tie
     *
     * @return true ... game is a tie
     * false ... game is not a tie
     */
    private boolean checkTie(){
        boolean isTie = true;

        for(int iy = 0; iy < maxY; iy++){
            for(int ix = 0; ix < maxX; ix++){
                if(field[ix][iy].getShape().equals(" ")){
                    isTie = false;
                    break;
                }
            }
        }

        return isTie;
    }
}
