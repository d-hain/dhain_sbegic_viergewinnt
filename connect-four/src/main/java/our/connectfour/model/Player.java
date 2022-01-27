package our.connectfour.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Player{
    private String name;
    private Tile tile;

    public Player(){
    }

    public Player(String name, Tile tile){
        setName(name);
        setTile(tile);
    }

    public Player(Tile tile){
        setTile(tile);
    }

    public Player(String name){
        setName(name);
    }

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
        try{
            if(matcher.matches()){
                this.name = name;
            } else{
                throw new IllegalArgumentException();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public Tile getTile(){
        return tile;
    }

    public void setTile(Tile tile){
        this.tile = tile;
    }
}
