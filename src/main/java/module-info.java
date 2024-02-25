module com.example.java_test {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_test to javafx.fxml;
    exports com.example.java_test;
}