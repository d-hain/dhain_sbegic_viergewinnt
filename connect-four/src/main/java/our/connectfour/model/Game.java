package our.connectfour.model;

public class Game{
    public void initGame(){

    }

    /**
     * everything you have to put out when someone has won
     * @param player the player that has won
     */
    public void endGame(Player player){
        System.out.println();
        System.out.println("CONGRATULATIONS!");
        System.out.println(player.getName() + " has won the game!");
    }
}
