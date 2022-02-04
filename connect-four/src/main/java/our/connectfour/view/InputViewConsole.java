package our.connectfour.view;

import our.connectfour.model.Player;

/**
 * Output the Input Text
 */
public class InputViewConsole implements InputView{
    @Override
    public void display(Player player){
        System.out.print(player.getName() + " Column: ");
    }

}
