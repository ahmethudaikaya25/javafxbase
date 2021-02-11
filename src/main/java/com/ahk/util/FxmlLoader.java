package com.ahk.util;

import com.ahk.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.net.URL;

public class FxmlLoader {
    private Pane view;

    public Pane getPage(String fileName) {
        try {
            URL url = Main.class.getResource("/com/ahk/frame/" + fileName + ".fxml");
            view = FXMLLoader.load(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return view;
    }
}
