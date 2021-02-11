package com.ahk.frame.controller;

import com.ahk.MainController;
import com.ahk.util.FxmlLoader;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class LoginController {

    @FXML
    public void loginButtonAction() {
        FxmlLoader loader = new FxmlLoader();
        Pane pane = loader.getPage("customer");
        MainController.publicMainBP.setCenter(pane);
    }

    @FXML
    public void forgotPassButtonAction() {

    }
}
