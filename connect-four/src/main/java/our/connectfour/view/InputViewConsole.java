package our.connectfour.view;

import our.connectfour.model.Player;

public class InputViewConsole implements InputView{
    @Override
    public void display(){
        System.out.print("Column: ");
    }
}
