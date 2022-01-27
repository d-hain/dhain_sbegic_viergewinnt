package our.connectfour.model;

import javafx.scene.paint.Color;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tile{
    private String shape;
    private Color color;

    public Tile(Color color){
        setColor(color);
    }

    // TODO: Standartsymbole machen
    public Tile(){
        this.shape = "x";
    }

    public Tile(String shape){
        setShape(shape);
    }

    public String getShape(){
        return shape;
    }

    /**
     * The tile shape can only be a letter
     * @param shape The shape of the tile
     */
    public void setShape(String shape){
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher(shape);
        try{
            if(matcher.matches()){
                this.shape = shape;
            }else {
                throw new IllegalArgumentException();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color color){
        this.color = color;
    }
}
