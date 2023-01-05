module com.example.demomymusicplayer {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires javafx.media;

    opens com.example.demomymusicplayer to javafx.fxml;
    exports com.example.demomymusicplayer;
}