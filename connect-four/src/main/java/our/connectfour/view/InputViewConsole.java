package our.connectfour.view;

import our.connectfour.model.Player;

public class InputViewConsole implements InputView{
    @Override
    public void display(Player player){
        System.out.println();
        System.out.print(player.getName() + ": ");
    }
}
