package com.example.demo6;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class formController {

    @FXML
    private TextField numb;

    @FXML
    private TextField numb2;

    @FXML
    private TextField otvet;

    @FXML
    private Button plus;
    @FXML
    private Button minus;
    @FXML
    private Button delen;
    @FXML
    private Button umnos;
    @FXML
    private Button dz1;
    @FXML
    private Button dz2;

    @FXML
    private TextField sys1;

    @FXML
    private TextField sys2;
    @FXML
    private TextField sys3;

    @FXML
    void initialize() {


        plus.setOnAction(event -> {
            String fin;
        Scet scet = new Scet();
        int n2 = (int) Long.parseLong(sys1.getText());
        long n1 =  Long.parseLong(String.valueOf(numb.getText()), n2);
        int n4 = (int) Long.parseLong(sys2.getText());
        long n3 = Long.parseLong(String.valueOf(numb2.getText()), n4);
        int n5 = (int) Long.parseLong(sys3.getText());
            fin =scet.sl(n1,n3,n5);
            otvet.setText(fin);
        });
        minus.setOnAction(event -> {
            String fin;
            Scet scet = new Scet();

            int n2 = (int) Long.parseLong(sys1.getText());
            long n1 =  Long.parseLong(String.valueOf(numb.getText()), n2);
            int n4 = (int) Long.parseLong(sys2.getText());
            long n3 = Long.parseLong(String.valueOf(numb2.getText()), n4);
            int n5 = (int) Long.parseLong(sys3.getText());
            fin =scet.min(n1,n3,n5);
            otvet.setText(fin);
        });
        delen.setOnAction(event -> {
            String fin;
            Scet scet = new Scet();

            int n2 = (int) Long.parseLong(sys1.getText());
            long n1 =  Long.parseLong(String.valueOf(numb.getText()), n2);
            int n4 = (int) Long.parseLong(sys2.getText());
            long n3 = Long.parseLong(String.valueOf(numb2.getText()), n4);
            int n5 = (int) Long.parseLong(sys3.getText());
            fin =scet.del(n1,n3,n5);
            otvet.setText(fin);
        });
        umnos.setOnAction(event -> {
            String fin;
            Scet scet = new Scet();
            int n2 = (int) Long.parseLong(sys1.getText());
            long n1 =  Long.parseLong(String.valueOf(numb.getText()), n2);
            int n4 = (int) Long.parseLong(sys2.getText());
            long n3 = Long.parseLong(String.valueOf(numb2.getText()), n4);
            int n5 = (int) Long.parseLong(sys3.getText());
            fin =scet.umn(n1,n3,n5);
            otvet.setText(fin);
        });
        dz1.setOnAction(event -> {
            String fin;
            Scet scet = new Scet();
            int n2 = (int) Long.parseLong(sys1.getText());
            long n1 =  Long.parseLong(String.valueOf(numb.getText()), n2);
            int n5 = (int) Long.parseLong(sys3.getText());
            fin =scet.per1(n1,n5);
            otvet.setText(fin);
        });
        dz2.setOnAction(event -> {
            String fin;
            Scet scet = new Scet();
            int n2 = (int) Long.parseLong(sys2.getText());
            long n1 =  Long.parseLong(String.valueOf(numb2.getText()), n2);
            int n5 = (int) Long.parseLong(sys3.getText());
            fin =scet.per1(n1,n5);
            otvet.setText(fin);
        });
    }
}
