/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author Ayush Jain
 */
public class SignUp extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Label cosmic = new Label("Cosmic Blood Bank");
        cosmic.setFont(Font.font ("Monotype Corsiva", FontWeight.EXTRA_BOLD, 48));
        cosmic.setTextFill(Color.web("#FFFFFF"));
            
        HBox r1 = new HBox();
        r1.setPadding(new Insets(10,10,10,125));
        r1.setSpacing(45);
        r1.getChildren().addAll(cosmic);
        Label lp = new Label("Sign Up Page");
        lp.setFont(Font.font ("Times New Roman", FontWeight.BOLD, 36));
        lp.setTextFill(Color.web("#00FFFF"));
          
        HBox r2 = new HBox();
        r2.setPadding(new Insets(10,10,10,220));
        r2.setSpacing(45);
        r2.getChildren().addAll(lp);
           
        Label id = new Label("Enter ID");
        id.setFont(Font.font ("Times New Roman", FontWeight.BOLD, 24));
        id.setTextFill(Color.web("#FFFF00"));
           
        TextField tid = new TextField();
        tid.setFont(Font.font ("Times New Roman", 14));
        tid.setEditable(true);
           
        HBox r3 = new HBox();
        r3.setPadding(new Insets(25,50,10,85));
        r3.setSpacing(170);
        r3.getChildren().addAll(id,tid);
            
        Label pd = new Label("Enter Password");
        pd.setFont(Font.font ("Times New Roman", FontWeight.BOLD, 24));
        pd.setTextFill(Color.web("#FFFF00"));
          
        PasswordField ppd = new PasswordField();
        ppd.setFont(Font.font ("Times New Roman", 14));
        ppd.setEditable(true);
          
        HBox r4 = new HBox();
        r4.setPadding(new Insets(25,30,10,85));
        r4.setSpacing(98);
        r4.getChildren().addAll(pd,ppd);
            
        Button sn = new Button("Sign Up");
        sn.setFont(Font.font ("Times New Roman", FontWeight.BOLD, 20));
        sn.setPadding(new Insets(4,25,4,25));
        sn.setOnAction((ActionEvent event) -> {
            try{
                Class.forName("java.sql.DriverManager");
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost"
                        + ":3309/javafx_blood_bank","root","root");
                String i =tid.getText();
                String p =ppd.getText();
                Statement st= c.createStatement();
                String s = "Insert into login values('"+i+"','"+p+"')";
                int a = st.executeUpdate(s);
                if(a>0){
                    JOptionPane.showMessageDialog(null,"You have successfully Signed Up");
                    Login d = new Login();
                    d.start(primaryStage);
                }else{
                    JOptionPane.showMessageDialog(null,"Enter valid passowrd");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        });
            
        Button clr = new Button("Clear");
        clr.setFont(Font.font ("Times New Roman", FontWeight.BOLD, 20));
        clr.setPadding(new Insets(4,25,4,25));
        clr.setOnAction((ActionEvent event) -> {
            tid.setText("");
            ppd.setText("");
        });
          
        HBox r5 = new HBox();
        r5.setPadding(new Insets(20,10,10,130));
        r5.setSpacing(140);
        r5.getChildren().addAll(sn,clr);
          
        Button exi = new Button("Exit");
        exi.setFont(Font.font ("Times New Roman", FontWeight.BOLD, 20));
        exi.setPadding(new Insets(4,25,4,25));
        exi.setOnAction((ActionEvent event) -> {
            Exit e = new Exit();
            e.start(primaryStage);
        });
           
        HBox r6 = new HBox();
        r6.setPadding(new Insets(10,10,10,275));
        r6.getChildren().addAll(exi);
            
        VBox frame = new VBox();
        frame.getChildren().add(r1);
        frame.getChildren().add(r2);
        frame.getChildren().add(r3);
        frame.getChildren().add(r4);
        frame.getChildren().add(r5);
        frame.getChildren().add(r6);
            
        try {
            FileInputStream input = new FileInputStream("src\\abstract-background-design_1297-87.jpg"); 
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
        Scene scene = new Scene(frame, 620, 390);

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