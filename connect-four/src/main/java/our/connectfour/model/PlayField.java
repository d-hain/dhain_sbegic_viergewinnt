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
 *   TODO: Beschreibung machen
 *
 */

package our.connectfour.model;

public class PlayField extends Tile{
    private Tile[] field;

    /**
     * Constructor for the Tile Array
     * @param field Tile Array
     */
    public PlayField(Tile[] field){
        this.field = field;
    }

    /**
     * Checks if a Player has won or it is a tie
     * @return 0 ... No Player has won
     *         1 ... Player 1 has won
     *         2 ... Player 2 has won
     *         3 ... Tie
     */
    public int checkWin(){
        /*
         * Four Tiles next to one another with the same shape or color and the Player has won
         *   * Diagonal
         *   * Horizontal
         *   * Vertical
         *
         * If a Tile with another shape has been found then stop counting in that direction
         * If you encounter a border of the playing field stop counting in that direction
         * If you go under 0 or over the playing field maximum stop counting in that direction
         *
         */

        // Go through the field and check ever Tile in ever direction
        for(int i = 0; i < field.length; i++){

        }

        return 0;
    }

    /**
     * Checks to the left or to the right for Tiles that have the same shape or color
     * @param direction 1 ... to the right
     *                  -1 ... to the left
     * @param currentTile the number of the Tile in the playing field Array
     * @return true ... the Player has won (in that direction)
     *         false ... the Player has not won (in that direction)
     */
    private boolean checkHorizontal(int direction, int currentTile){
        return false;
    }

    /**
     * Restart the game from the beginning
     */
    public void restart(){

    }

    /**
     * Undo the last move
     * (if Player 1 says Undo then the previous move gets undone
     *  even if it is a move from Player 2)
     */
    public void undo(){

    }

    /**
     * Check if the move is allowed
     *   * in the Playing Field
     *   * not on Another Tile that is filled
     * @return true ... move is allowed
     *         false ... move is not allowed
     */
    public boolean isLegalMove(){
        return false;
    }
}
