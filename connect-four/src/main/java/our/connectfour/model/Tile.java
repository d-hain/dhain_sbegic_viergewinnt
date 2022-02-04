/*-----------------------------------------------------------------------------
 *              Hoehere Technische Bundeslehranstalt STEYR
 *           Fachrichtung Elektronik und Technische Informatik
 *----------------------------------------------------------------------------*/
/**
 * Kurzbeschreibung
 *
 * @author : Semin Begic, David Hain
 * @date : 28.01.2022
 * @details * Constructor
 * * color & shape
 * * shape
 * * Getters and Setters with RegEx checks
 */

package our.connectfour.model;

import javafx.scene.paint.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Tile
 *      * Constructors
 *      * Getters and Setters
 */
public class Tile{
    private String shape;
    private Color color;

    /**
     * Constructor for Tile with the color and a shape
     * @param color color of the Tile in the UI
     * @param shape shape of the Tile ([A-Za-z] on keyboard)
     */
    public Tile(Color color, String shape){
        setColor(color);
        setShape(shape);
    }

    /**
     * Constructor for Tile with only shape
     * @param shape shape of the Tile ([A-Za-z] on keyboard)
     */
    public Tile(String shape){
        setShape(shape);
    }

    /**
     * Get shape from object
     * @return shape in Console
     */
    public String getShape(){
        return shape;
    }

    /**
     * Sets the shape of the tile
     * The tile shape can only be a letter
     * @param shape The shape of the Tile
     */
    public void setShape(String shape){
        if(checkShape(shape)){
            this.shape = shape;
        } else{
            throw new IllegalArgumentException();
        }
    }

    /**
     * Checks if the shape is valid (only letters)
     * @param shape The shape of the Tile
     * @return true ... shape is valid
     *         false ... shape is not valid
     */
    public boolean checkShape(String shape){
        Pattern pattern = Pattern.compile("([a-zA-Z]|[ ])"); //([a-zA-Z]|[ ])
        Matcher matcher = pattern.matcher(shape);

        return matcher.matches();
    }

    /**
     * Get color from object
     * @return color of the Tile in the UI
     */
    public Color getColor(){
        return color;
    }

    /**
     * Set color of an object
     * @param color color of the Tile in the UI
     */
    public void setColor(Color color){
        this.color = color;
    }
}
