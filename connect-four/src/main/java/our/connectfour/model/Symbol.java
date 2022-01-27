package our.connectfour.model;

import javafx.scene.paint.Color;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Symbol{
    private String shape;
    private Color color;

    public Symbol(Color color){
        setColor(color);
    }

    // TODO: Standartsymbole machen
    public Symbol(){
        this.shape = "x";
    }

    public Symbol(String shape){
        setShape(shape);
    }

    public String getShape(){
        return shape;
    }

    /**
     * The symbol shape can only be a letter
     * @param shape The shape of the symbol
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
