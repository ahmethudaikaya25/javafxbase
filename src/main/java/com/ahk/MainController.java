package com.ahk;

import com.ahk.frame.controller.LoginController;
import com.ahk.util.FxmlLoader;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    public static BorderPane publicMainBP;
    @FXML
    private BorderPane mainBorderPane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        FxmlLoader loader = new FxmlLoader();
        Pane pane = loader.getPage("login");
        mainBorderPane.setCenter(pane);
        publicMainBP = mainBorderPane;
    }
}
