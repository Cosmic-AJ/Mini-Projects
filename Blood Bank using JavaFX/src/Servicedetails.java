/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author Durgesh Kumar Sahu
 */
public class Servicedetails extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        Label cosmic = new Label("Cosmic");
        cosmic.setFont(Font.font ("Monotype Corsiva", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 60));
        HBox r1 = new HBox();
        r1.setPadding(new Insets(-10,-100,0,240));
        r1.getChildren().add(cosmic);
        
        Label bb = new Label("Blood Bank");
        bb.setFont(Font.font ("Monotype Corsiva", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 48));
        HBox r2 = new HBox();
        r2.setPadding(new Insets(0,0,-30,210));
        r2.getChildren().add(bb);
        
        Button rb = new Button("Receive Blood");
        rb.setFont(Font.font ("Times New Roman", FontWeight.BOLD, 24));
        rb.setPrefWidth(200);
        rb.setPadding(new Insets(4, 12, 4, 12));
        rb.setOnAction((ActionEvent event) -> {
            rblood e = new rblood();
            e.start(primaryStage);
        });
        
        Button dist = new Button("Distribute");
        dist.setFont(Font.font ("Times New Roman", FontWeight.BOLD, 24));
        dist.setPrefWidth(200);
        dist.setPadding(new Insets(4, 12, 4, 12));
        dist.setOnAction((ActionEvent event) -> {
            udetails e = new udetails();
            e.start(primaryStage);
        });
        
        HBox r3 = new HBox();
        r3.getChildren().addAll(rb,dist);
        r3.setSpacing(155);
        r3.setPadding(new Insets(250, -250, 48, 40));
        
        Button vs = new Button("View Stock");
        vs.setFont(Font.font ("Times New Roman", FontWeight.BOLD, 24));
        vs.setPrefWidth(200);
        vs.setPadding(new Insets(4, 12, 4, 12));
        vs.setOnAction((ActionEvent event) -> {
            vdetails e = new vdetails();
            e.start(primaryStage);
        });
        
        Button delr = new Button("Delete Record");
        delr.setFont(Font.font ("Times New Roman", FontWeight.BOLD, 24));
        delr.setPrefWidth(200);
        delr.setPadding(new Insets(4, 12, 4, 12));
        delr.setOnAction((ActionEvent event) -> {
            dblood e = new dblood();
            e.start(primaryStage);
        });
        
        HBox r4 = new HBox();
        r4.getChildren().addAll(vs,delr);
        r4.setSpacing(155);
        r4.setPadding(new Insets(10, 0, 10, 40));
        
        Button donr = new Button("View Donors");
        donr.setFont(Font.font ("Times New Roman", FontWeight.BOLD, 24));
        donr.setPrefWidth(250);
        donr.setPadding(new Insets(4, 12, 4, 12));
        donr.setOnAction((ActionEvent event) -> {
            vdonor e = new vdonor();
            e.start(primaryStage);
        });
        
        Button exit = new Button("Exit");
        exit.setFont(Font.font ("Times New Roman", FontWeight.BOLD, 24));
        exit.setPrefWidth(150);
        exit.setPadding(new Insets(4, 12, 4, 12));
        exit.setOnAction((ActionEvent event) -> {
            Exit e = new Exit();
            e.start(primaryStage);
        });
        
        HBox r5 = new HBox();
        r5.getChildren().addAll(donr,exit);
        r5.setSpacing(130);
        r5.setPadding(new Insets(45,29,10,230));
        
        VBox frame = new VBox();
        frame.getChildren().add(r1);
        frame.getChildren().add(r2);
        frame.getChildren().add(r3);
        frame.getChildren().add(r4);
        frame.getChildren().add(r5);
        
        try{
            FileInputStream input = new FileInputStream("src\\blood-donation-logo_23-2147506524.jpg");
            Image image = new Image(input); 
            BackgroundImage backgroundimage = new BackgroundImage(image,  
                                             BackgroundRepeat.NO_REPEAT,  
                                             BackgroundRepeat.NO_REPEAT,  
                                             BackgroundPosition.DEFAULT,  
                                                BackgroundSize.DEFAULT); 
            Background background = new Background(backgroundimage);
            frame.setBackground(background);
        }catch (FileNotFoundException e) { 
            System.out.println(e.getMessage()); 
        } 
        
        Scene scene = new Scene(frame, 622, 590);
        
        primaryStage.setTitle("Cosmic");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}