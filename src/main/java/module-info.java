module com.example.jfxzookeeperkafka {
    requires javafx.controls;
    requires javafx.fxml;
    requires zookeeper;


    opens com.example.jfxzookeeperkafka to javafx.fxml;
    exports com.example.jfxzookeeperkafka;
}