module our.connectfour {
    requires javafx.controls;
    requires javafx.fxml;


    opens our.connectfour to javafx.fxml;
    exports our.connectfour;
}