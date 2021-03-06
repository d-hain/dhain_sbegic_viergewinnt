package our.connectfour;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ConnectFourApplication extends Application{
    @Override
    public void start(Stage stage) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(ConnectFourApplication.class.getResource("connect-four-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Create Players");
        stage.setScene(scene);

        setUserAgentStylesheet(STYLESHEET_CASPIAN);

        stage.show();
    }

    public static void main(String[] args){
        launch();
    }
}