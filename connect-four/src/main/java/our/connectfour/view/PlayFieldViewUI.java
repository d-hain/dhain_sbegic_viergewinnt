package our.connectfour.view;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import our.connectfour.model.*;

import javax.swing.*;
import java.awt.Dialog;

public class PlayFieldViewUI implements PlayFieldView{
    private GridPane gridPlayField;
    private Game game = new Game();

    public PlayFieldViewUI(GridPane gridPlayField){
        this.gridPlayField = gridPlayField;
    }

    @Override
    public void display(PlayField playField){
//        game.p1 = new Player("EEE", new Tile(new Color(50, 205, 205, 205), "E"));
//        gridPlayField.getChildren().get(0).setStyle("-fx-background-color: " + game.p1.getTile().getColor().toString().replace("0x", "#") + ";");
    }
}
