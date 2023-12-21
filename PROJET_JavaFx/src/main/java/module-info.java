module com.example.projet_javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.projet_javafx to javafx.fxml;
//    exports com.example.projet_javafx;
    exports com.example.projet_javafx.GUI;
    opens com.example.projet_javafx.GUI to javafx.fxml;
}