// File: Prog12.java
// Simplest JavaFX Student Record GUI

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Prog12 extends Application {

    @Override
    public void start(Stage stage) {
        TextField nameField = new TextField();
        nameField.setPromptText("Enter student name");

        Button addButton = new Button("Add");
        ListView<String> listView = new ListView<>();
        ObservableList<String> students = FXCollections.observableArrayList();
        listView.setItems(students);

        addButton.setOnAction(e -> {
            String name = nameField.getText().trim();
            if (!name.isEmpty()) {
                students.add(name);
                nameField.clear();
            }
        });

        VBox root = new VBox(10, nameField, addButton, listView);
        root.setPadding(new javafx.geometry.Insets(10));

        stage.setScene(new Scene(root, 300, 300));
        stage.setTitle("Student List - Prog12");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

