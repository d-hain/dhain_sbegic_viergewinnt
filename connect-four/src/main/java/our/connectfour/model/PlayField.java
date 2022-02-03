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

import java.util.Objects;

public class PlayField{
    private Tile[][] field;

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
     * @param maxY maximal x of the 2D Array
     * @param maxX maximal y of the 2D Array
     */
    public PlayField(int maxY, int maxX){
        field = new Tile[maxY][maxX];

        for(int x = 0; x < maxY; x++){
            for(int y = 0; y < maxX; y++){
                field[x][y] = new Tile(" ");
            }
        }
    }

    /**
     * Checks if a Player has won, or it is a tie
     *
     * @param col the column of the last move
     * @param row the row of the last move
     * @param tile current Player Tile
     * @return 0 ... something went wrong
     *         1 ... it is a tie
     *         2 ... a player has won
     */ //TODO: Testen
    public int checkWin(int col, int row, Tile tile){
        // TODO: Info: Temporär Entfernt
        return 0;
    }

    /**
     * Restart the game from the beginning
     */
    public void restart(){

    }

    /**
     * Undo the last move
     * (if Player 1 says Undo then the previous move gets undone
     * even if it is a move from Player 2)
     */
    public void undo(){

    }
}
