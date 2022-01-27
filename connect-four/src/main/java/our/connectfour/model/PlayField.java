package our.connectfour.model;

public class PlayField extends Tile{
    private Tile[] field;

    public PlayField(Tile[] field){
        this.field = field;
    }

    private int checkWin(){
        return 0;
    }

    private void restart(){

    }

    private void undo(){

    }

    private boolean isLegalMove(){
        return false;
    }
}
