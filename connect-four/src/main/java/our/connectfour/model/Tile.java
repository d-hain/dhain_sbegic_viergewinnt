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
 * * color
 * * shape
 * * Getters and Setters with RegEx checks
 */

package our.connectfour.model;

import javafx.scene.paint.Color;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tile{
    private String shape;
    private Color color;

    /**
     * empty Constructor
     */
    public Tile(){}
    
    /**
     * Constructor for Tile with only color
     * @param color color of the Tile in the UI
     */
    public Tile(Color color){
        setColor(color);
    }

    /**
     * Constructor for Tile with only shape
     * @param shape shape of the Tile
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
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher(shape);
        if(matcher.matches()){
            this.shape = shape;
        } else{
            throw new IllegalArgumentException();
        }
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
