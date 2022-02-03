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
    private static final int maxArea = 4;
    private static final int win = 4;
    private static final int winDist = win - 1;
    private Tile[][] field;

    public Tile[][] getField(){
        return field;
    }

    public void setField(Tile[][] field){
        this.field = field;
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
     * Checks if a Player has won or it is a tie
     *
     * @param x          player last move x-coordinate
     * @param y          player last move y-coordinate
     * @param currPlayer the Player to check if he has won
     * @return true or false if currentPlayer has won
     */ //TODO: Testen
    public boolean checkWin(int x, int y, Player currPlayer){
        int winCount = 0;
        int ix = 0;
        int iy = 0;
        boolean winner = false;

        //horizontal
        for(ix = initNegative(x); inArea(ix) && !winner; ix++){
            if(field[ix][iy].getShape().equals(currPlayer.getTile().getShape())){
                winCount++;
            } else{
                winCount = 0;
            }
            if(winCount >= win){
                winner = true;
            }
        }

        //vertical
        for(iy = initNegative(y); inArea(iy) && !winner; iy++){
            if(field[ix][iy].getShape().equals(currPlayer.getTile().getShape())){
                winCount++;
            } else{
                winCount = 0;
            }
            if(winCount >= win){
                winner = true;
            }
        }

        //left up to right down
        for(ix = initNegative(x), iy = initNegative(y); inArea(ix) && inArea(iy) && !winner; ix++, iy++){
            if(field[ix][iy].getShape().equals(currPlayer.getTile().getShape())){
                winCount++;
            } else{
                winCount = 0;
            }
            if(winCount >= win){
                winner = true;
            }
        }

        //left down to right up
        for(ix = initNegative(x), iy = initPositive(y); inArea(ix) && inArea(iy) && !winner; ix++, iy--){
            if(field[ix][iy].getShape().equals(currPlayer.getTile().getShape())){
                winCount++;
            } else{
                winCount = 0;
            }
            if(winCount >= win){
                winner = true;
            }
        }

        return winner;
    }

    /**
     * checks if the game is a tie
     *
     * @return Tie yes or no
     */ //TODO: Testen
    boolean checkTie(){
        boolean isTie = true;
        int x = 0;
        int y;

        while(x < maxArea && isTie){
            y = 0;
            while(y < maxArea && isTie){
                isTie = (!Objects.equals(field[x][y].getShape(), ""));
                y++;
            }
            x++;
        }

        return isTie;
    }

    private int initNegative(int z){
        return Math.max(z, 0);
    }

    private int initPositive(int z){
        return (z >= maxArea) ? maxArea - 1: z;
    }

    private boolean inArea(int iz){
        return iz < maxArea && iz >= 0;
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

    /**
     * Check if the move is allowed
     * * in the Playing Field
     * * not on Another Tile that is filled
     *
     * @return true ... move is allowed
     * false ... move is not allowed
     */
    public boolean isLegalMove(){
        return false;
    }
}
