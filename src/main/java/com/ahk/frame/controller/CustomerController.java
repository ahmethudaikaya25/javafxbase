package com.ahk.frame.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class CustomerController implements Initializable {
    @FXML
    BorderPane customerBorder;
    @FXML
    ScrollPane scrollPaneButtons;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        VBox box = new VBox();

        int a = 0;
        for(int i = 0;i<11;i++){
            HBox box2 = new HBox();
            for (int j = 0;j<10;j++){

                Button button = new Button(""+(a+1));
                box2.setMargin(button,new Insets(5,5,5,5));
                button.setMaxHeight(48);
                button.setMaxWidth(48);
                button.setMinHeight(48);
                button.setMinWidth(48);
                button.setPadding(new Insets(10,10,10,10));
                box2.getChildren().add(button);
                a++;

            }
            box.getChildren().add(box2);
        }
        scrollPaneButtons.setContent(box);
    }
}
