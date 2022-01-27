package our.connectfour.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Player{
    private String name;
    private Symbol symbol;

    public Player(){
    }

    public Player(String name, Symbol symbol){
        setName(name);
        setSymbol(symbol);
    }

    public Player(Symbol symbol){
        setSymbol(symbol);
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

    public Symbol getSymbol(){
        return symbol;
    }

    public void setSymbol(Symbol symbol){
        this.symbol = symbol;
    }
}
