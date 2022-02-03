package our.connectfour.model;

public class Game{
    private PlayField playField = new PlayField(6, 7);  // playField with 6 rows and 7 columns
    private Player p1;
    private Player p2;

    public PlayField getPlayField(){
        return playField;
    }

    public void setPlayField(PlayField playField){
        this.playField = playField;
    }

    public Game(PlayField playField, Player p1, Player p2){
        this.playField = playField;
        this.p1 = p1;
        this.p2 = p2;
    }

    public void initGame(){

    }
}
