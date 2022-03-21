module com.example.demo1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.St200492923_Assignment_1 to javafx.fxml;
    exports com.example.St200492923_Assignment_1;
}