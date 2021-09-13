/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author Ayush Jain
 */
public class Welcome extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button cont = new Button();
        cont.setText("Continue");
        cont.setOnAction((ActionEvent event) -> {
            Servicedetails e = new Servicedetails();
            e.start(primaryStage);
        });
        cont.setFont(Font.font ("Times New Roman", FontWeight.EXTRA_BOLD, 24));
        cont.setPadding(new Insets(5,20,5,20));
        
        Button exit = new Button();
        exit.setText("Exit");
        exit.setOnAction((ActionEvent event) -> {
            Exit e = new Exit();
            e.start(primaryStage);
        });
        exit.setFont(Font.font ("Times New Roman", FontWeight.EXTRA_BOLD, 24));
        exit.setPadding(new Insets(5,20,5,20));
        
        HBox a = new HBox();
        a.setSpacing(100);
        a.getChildren().add(cont);
        a.getChildren().add(exit);
        a.setPadding(new Insets(505,10,200,125));
            
        StackPane root = new StackPane();
        root.getChildren().add(a);
        try {
            FileInputStream input = new FileInputStream("src\\we2_grande.jpg"); 
            Image image = new Image(input); 
            BackgroundImage backgroundimage = new BackgroundImage(image,  
                                             BackgroundRepeat.NO_REPEAT,  
                                             BackgroundRepeat.NO_REPEAT,  
                                             BackgroundPosition.DEFAULT,  
                                                BackgroundSize.DEFAULT); 
            Background background = new Background(backgroundimage);
            root.setBackground(background);
        }catch (FileNotFoundException e) { 
            System.out.println(e.getMessage()); 
        }
        
        Scene scene = new Scene(root, 570, 460);

        primaryStage.setTitle("Cosmic");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}