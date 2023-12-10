package com.example.csc325.csc325.Controllers;

import com.example.csc325.csc325.SceneManager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class SuccessfulRegistrationController {
    @FXML
    public Label lblSuccessMsg;

    @FXML
    public Button backToLoginBtn;

    public void backToLogin() throws IOException {
        SceneManager.getInstance().showLoginScene();
    }


}