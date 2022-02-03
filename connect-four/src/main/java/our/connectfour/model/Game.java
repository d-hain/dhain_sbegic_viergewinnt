package our.connectfour.model;

import our.connectfour.view.ErrorViewConsole;

import java.util.Scanner;

/**
 * Game
 *      initGame()
 *          * welcome message
 *          * read in Player names and symbols
 *          * set Player and currPlayer
 *      endGame()
 *          * Tie message
 *          * Win message
 */
public class Game{
    public Player p1;
    public Player p2;
    public int currPlayer = 0;
    ErrorViewConsole evc = new ErrorViewConsole();

    /**
     * welcome message
     * read in Player names and symbols
     * set Player and currPlayer
     */
    public void initGame() {
        Scanner sc = new Scanner(System.in);
        String name1;
        String name2;
        String symbol1;
        String symbol2;
        Tile tile1;
        Tile tile2;
        int random = (int) (Math.random() * 2);

        System.out.println("Willkommen zu VierGewinnt\n");

        do {
            System.out.println("Bitte gib deinen Namen ein P1: ");
            name1 = sc.nextLine();

            System.out.println("Bitte gib deinen Namen ein P2: ");
            name2 = sc.nextLine();

            if (name1.equals(name2)) {
                evc.display("Keine gleichen Namen verwenden!");
            }

        } while (name1.equals(name2));
        Player p1 = new Player(name1);
        Player p2 = new Player(name2);

        do {
            System.out.println("Setzen Sie nun Ihre Symbole! Falls nichts " +
                    "angegeben wird werden Standardsymbole (x für P1 & o für P2) verwendet.\n");

            System.out.println("Bitte gib dein Symbol ein P1: ");
            symbol1 = sc.nextLine();
            if (symbol1.equals("")){
                symbol1 = "x";
                tile1 = new Tile(symbol1);
            }else{
                tile1 = new Tile(symbol1);
            }

            System.out.println("Bitte gib dein Symbol ein P2: ");
            symbol2 = sc.nextLine();
            if (symbol2.equals("")){
                symbol2 = "o";
                tile2 = new Tile(symbol2);
            }else{
                tile2 = new Tile(symbol2);
            }

            if (symbol1.equals(symbol2)) {
                evc.display("Keine gleichen Symbole verwenden!");
            }
        } while (symbol1.equals(symbol2));
        p1.setTile(tile1);
        p2.setTile(tile2);

        if (random == 1){
            System.out.println(p1.getName() + " beginnt das Spiel");
        }else{
            System.out.println(p2.getName() + " beginnt das Spiel");
        }

        currPlayer = random;
        this.p1 = p1;
        this.p2 = p2;
    }

    /**
     * everything you have to put out when someone has won
     * @param player the player that has won
     * @param isTie if the game is a tie or not
     */
    public void endGame(Player player, boolean isTie){
        System.out.println();
        if(isTie){
            System.out.println("No one has won the game!\nIt is a TIE.");
        }else{
            System.out.println("CONGRATULATIONS!");
            System.out.println(player.getName() + " has won the game!");
        }
    }
}
