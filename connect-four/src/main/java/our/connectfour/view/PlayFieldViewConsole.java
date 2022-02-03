package our.connectfour.view;
import our.connectfour.model.*;

/**
 * Output the Playing Field
 */
public class PlayFieldViewConsole implements PlayFieldView{

    @Override
    public void display(PlayField playField) {
        System.out.println("\n" +
                ".---.---.---.---.---.---.---.\n" +
                "| " + playField.getField()[0][0].getShape() + " | " + playField.getField()[0][1].getShape() + " | " + playField.getField()[0][2].getShape() + " | " + playField.getField()[0][3].getShape() + " | " + playField.getField()[0][4].getShape() + " | " + playField.getField()[0][5].getShape() + " | " + playField.getField()[0][6].getShape() + " |\n" +
                ":---+---+---+---+---+---+---:\n" +
                "| " + playField.getField()[1][0].getShape() + " | " + playField.getField()[1][1].getShape() + " | " + playField.getField()[1][2].getShape() + " | " + playField.getField()[1][3].getShape() + " | " + playField.getField()[1][4].getShape() + " | " + playField.getField()[1][5].getShape() + " | " + playField.getField()[1][6].getShape() + " |\n" +
                ":---+---+---+---+---+---+---:\n" +
                "| " + playField.getField()[2][0].getShape() + " | " + playField.getField()[2][1].getShape() + " | " + playField.getField()[2][2].getShape() + " | " + playField.getField()[2][3].getShape() + " | " + playField.getField()[2][4].getShape() + " | " + playField.getField()[2][5].getShape() + " | " + playField.getField()[2][6].getShape() + " |\n" +
                ":---+---+---+---+---+---+---:\n" +
                "| " + playField.getField()[3][0].getShape() + " | " + playField.getField()[3][1].getShape() + " | " + playField.getField()[3][2].getShape() + " | " + playField.getField()[3][3].getShape() + " | " + playField.getField()[3][4].getShape() + " | " + playField.getField()[3][5].getShape() + " | " + playField.getField()[3][6].getShape() + " |\n" +
                ":---+---+---+---+---+---+---:\n" +
                "| " + playField.getField()[4][0].getShape() + " | " + playField.getField()[4][1].getShape() + " | " + playField.getField()[4][2].getShape() + " | " + playField.getField()[4][3].getShape() + " | " + playField.getField()[4][4].getShape() + " | " + playField.getField()[4][5].getShape() + " | " + playField.getField()[4][6].getShape() + " |\n" +
                ":---+---+---+---+---+---+---:\n" +
                "| " + playField.getField()[5][0].getShape() + " | " + playField.getField()[5][1].getShape() + " | " + playField.getField()[5][2].getShape() + " | " + playField.getField()[5][3].getShape() + " | " + playField.getField()[5][4].getShape() + " | " + playField.getField()[5][5].getShape() + " | " + playField.getField()[5][6].getShape() + " |\n" +
                "'---'---'---'---'---'---'---'\n" +
                "\n");
    }
}
