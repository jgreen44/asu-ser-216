module module5_javafx {
    requires javafx.fxml;
    requires javafx.controls;

    opens ui;
    opens tic_tac_toe;
    opens core;

}
