module com.example.toomanyemotions {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.toomanyemotions to javafx.fxml;
    exports com.example.toomanyemotions;
}