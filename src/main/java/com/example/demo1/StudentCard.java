package com.example.demo1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

public class StudentCard implements Initializable {


    String[] favActivity = {"Coocking", "Coding", "Games", "Driving"};
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label favActivities;

    @FXML
    private ListView favActivityText = new ListView();


    @FXML
    private Label fiNameLabel;

    @FXML
    private Label firstName;

    @FXML
    private ImageView imageView;

    @FXML
    private Label lNameLabel;

    @FXML
    private Label lastName;

    @FXML
    private Label sNumber;

    @FXML
    private Label sNumberLabel;

    StudentData firstStudent;
    @FXML
    void initialize() {


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        firstStudent = new StudentData("Pruthvish","Patel",200492923,favActivity);

        firstName.setText(firstStudent.getFirstName());
        lastName.setText(firstStudent.getLastName());
        sNumber.setText(String.valueOf(firstStudent.getStudentNumber()));
        imageView.setImage(firstStudent.getFirstImage());
        for(int i= 0; i < favActivity.length; i++) {
            favActivityText.getItems().add(favActivity[i]);

        }


    }
}
