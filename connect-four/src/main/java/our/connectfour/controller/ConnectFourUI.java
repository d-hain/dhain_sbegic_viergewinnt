/*-----------------------------------------------------------------------------
 *              Hoehere Technische Bundeslehranstalt STEYR
 *           Fachrichtung Elektronik und Technische Informatik
 *----------------------------------------------------------------------------*/
/**
 * Kurzbeschreibung
 *
 * @author  : Semin Begic, David Hain
 * @date    : 28.01.2022
 *
 * @details
 *   generateNumber hilft nur bei der Generierung des Startspielers
 */

package our.connectfour.controller;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;
import our.connectfour.model.Game;
import our.connectfour.model.PlayField;
import our.connectfour.view.*;

import javax.swing.plaf.basic.BasicButtonUI;
/**
 * OnAction:
 * FXMLLoader fxmlLoader = new FXMLLoader(ConnectFourApplication.class.getResource("connect-four-view-fxml"));
 *         Scene scene = new Scene(fxmlLoader.load());
 *         stage.setTitle("Connect Four");
 *         stage.setScene(scene);
 *         stage.show();
 */

/**
 * ConnectFourUI
 *      Everything to do with the UI
 */
public class ConnectFourUI {
    @FXML
    public Label labCurrPlayer;
    @FXML
    public Label labStatus;

    @FXML
    public GridPane gridPlayField;

    @FXML
    public Button btnRestart;

    private PlayField playField = new PlayField(7, 6);  // playField with 7 columns and 6 rows
    private final PlayFieldViewUI pfvui = new PlayFieldViewUI(gridPlayField);
    private final ErrorViewUI evui = new ErrorViewUI();
    private final Game game = new Game();
    private int[] tilesLeft = {5, 5, 5, 5, 5, 5, 5};
    private int columns;
    private int rows;

    public void initialize(){
        columns = gridPlayField.getColumnCount();
        rows = gridPlayField.getRowCount();
        for(int iy = 0; iy < 6; iy++){
            for(int ix = 0; ix < 7; ix++){
                gridPlayField.setGridLinesVisible(true);
                gridPlayField.add(new Pane(), ix, iy);
            }
        }
        gridPlayField.getChildren().get(2).setStyle("-fx-background-color: #FF39F7" ); //TODO: temp
    }

    public void mouseClick(MouseEvent e) {
        double x = e.getX();
        double y = e.getY();

        labStatus.setText("x: " + x + " y: " + y);
    }

    public void onMenuBtnClick(ActionEvent actionEvent) {
    }

    public void onHelpBtnClick(ActionEvent actionEvent) {
    }

    public void onResetBtnClick(ActionEvent actionEvent) {
    }
}
