module our.connectfour {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.desktop;


    opens our.connectfour to javafx.fxml;
    exports our.connectfour;
    exports our.connectfour.controller;
    opens our.connectfour.controller to javafx.fxml;
}