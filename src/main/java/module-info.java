module com.example.jfxzookeeperkafka {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jfxzookeeperkafka to javafx.fxml;
    exports com.example.jfxzookeeperkafka;
}