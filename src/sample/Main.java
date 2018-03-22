package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Sheep Counter 2018 - Joe Edition");
        primaryStage.setScene(new Scene(root, 1000, 800));


        javafx.scene.control.MenuItem menuItem1 = new javafx.scene.control.MenuItem("Option 1");
        javafx.scene.control.MenuItem menuItem2 = new javafx.scene.control.MenuItem("Option 2");
        javafx.scene.control.MenuItem menuItem3 = new MenuItem("Option 3");

        MenuButton menuButton = new MenuButton("Options", null, menuItem1, menuItem2, menuItem3);

        //HBox hbox = new HBox(menuButton);


        primaryStage.show();
    }

}
