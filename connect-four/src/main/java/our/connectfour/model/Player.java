/*-----------------------------------------------------------------------------
 *              Hoehere Technische Bundeslehranstalt STEYR
 *           Fachrichtung Elektronik und Technische Informatik
 *----------------------------------------------------------------------------*/
/**
 * Kurzbeschreibung
 *
 * @author : Semin Begic, David Hain
 * @date : 28.01.2022
 * @details * Playername
 * * Player Tile
 * * Constructors
 * * empty
 * * name, tile
 * * tile
 * * name
 * * Getters and Setters
 * * name
 * * tile
 * @see our.connectfour.model.Tile
 */

package our.connectfour.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Player
 *      * Constructors
 *      * Getters and Setters
 */
public class Player{
    private String name;
    private Tile tile;

    /**
     * Contructor for Player with name and Tile
     * @param name name of the Player
     * @param tile tile of the Player (shape & color)
     */
    public Player(String name, Tile tile){
        setName(name);
        setTile(tile);
    }

    /**
     * Constructor for Player with only Tile
     * @param tile Tile (shape & color)
     */
    public Player(Tile tile){
        setTile(tile);
    }

    /**
     * Constructor for Player with only name
     * @param name name of the Player
     */
    public Player(String name){
        setName(name);
    }

    /**
     * Get name of the Player
     * @return Playername
     */
    public String getName(){
        return name;
    }

    /**
     * Playername can only be a number or a Letter
     * @param name Playername
     */
    public void setName(String name){
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]+");
        Matcher matcher = pattern.matcher(name);
        if(matcher.matches()){
            this.name = name;
        } else{
            throw new IllegalArgumentException();
        }
    }

    /**
     * Get Tile of the Player
     * @return Tile (shape & color)
     */
    public Tile getTile(){
        return tile;
    }

    /**
     * Set the Tile of the Player
     * @param tile Tile (shape & color)
     */
    public void setTile(Tile tile){
        this.tile = tile;
    }
}
