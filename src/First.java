/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javafx.application.Application;
import javafx.stage.Stage;
import loginPage.loginPage;

/**
 *
 * @author Atharva
 */
public class First extends Application {
    @Override
    public void start(Stage primaryStage) {
    }
    public static void main(String[] args) {  
        new loginPage().setVisible(true);
    }
    
}
