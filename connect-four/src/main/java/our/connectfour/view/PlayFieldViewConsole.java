package our.connectfour.view;

import our.connectfour.model.Game;

public class PlayFieldViewConsole implements PlayFieldView{

    @Override
    public void display(Game game) {
        System.out.println("\n" +
                ".---.---.---.---.---.---.---.\n" +
                "| " + game.playField.getField()[0][0] + " | " + game.playField.getField()[0][1] + " | " + game.playField.getField()[0][2] + " | " + game.playField.getField()[0][3] + " | " + game.playField.getField()[0][4] + " | " + game.playField.getField()[0][5] + " | " + game.playField.getField()[0][6] + " |\n" +
                ":---+---+---+---+---+---+---:\n" +
                "| " + game.playField.getField()[1][0] + " | " + game.playField.getField()[1][1] + " | " + game.playField.getField()[1][2] + " | " + game.playField.getField()[1][3] + " | " + game.playField.getField()[1][4] + " | " + game.playField.getField()[1][5] + " | " + game.playField.getField()[1][6] + " |\n" +
                ":---+---+---+---+---+---+---:\n" +
                "| " + game.playField.getField()[2][0] + " | " + game.playField.getField()[2][1] + " | " + game.playField.getField()[2][2] + " | " + game.playField.getField()[2][3] + " | " + game.playField.getField()[2][4] + " | " + game.playField.getField()[2][5] + " | " + game.playField.getField()[2][6] + " |\n" +
                ":---+---+---+---+---+---+---:\n" +
                "| " + game.playField.getField()[3][0] + " | " + game.playField.getField()[3][1] + " | " + game.playField.getField()[3][2] + " | " + game.playField.getField()[3][3] + " | " + game.playField.getField()[3][4] + " | " + game.playField.getField()[3][5] + " | " + game.playField.getField()[3][6] + " |\n" +
                ":---+---+---+---+---+---+---:\n" +
                "| " + game.playField.getField()[4][0] + " | " + game.playField.getField()[4][1] + " | " + game.playField.getField()[4][2] + " | " + game.playField.getField()[4][3] + " | " + game.playField.getField()[4][4] + " | " + game.playField.getField()[4][5] + " | " + game.playField.getField()[4][6] + " |\n" +
                ":---+---+---+---+---+---+---:\n" +
                "| " + game.playField.getField()[5][0] + " | " + game.playField.getField()[5][1] + " | " + game.playField.getField()[5][2] + " | " + game.playField.getField()[5][3] + " | " + game.playField.getField()[5][4] + " | " + game.playField.getField()[5][5] + " | " + game.playField.getField()[5][6] + " |\n" +
                "'---'---'---'---'---'---'---'\n" +
                "\n");
    }
}
