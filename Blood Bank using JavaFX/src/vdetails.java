/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.*;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
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
import javax.swing.JOptionPane;

/**
 *
 * @author Durgesh Kumar Sahu
 */
public class vdetails extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Label l1 = new Label("Received Blood");
        l1.setOnMouseClicked(mouseEvent->{
            rblood a = new rblood();
            a.start(primaryStage);
        });
        Menu m1 = new Menu("",l1);
        l1.setFont(Font.font (13));
        
        Label l2 = new Label("View Stock");
        l2.setOnMouseClicked(mouseEvent->{
            vdetails a = new vdetails();
            a.start(primaryStage);
        });
        Menu m2 = new Menu("",l2);
        l2.setFont(Font.font (13));
        
        Label l3 = new Label("Distribute");
        l3.setOnMouseClicked(mouseEvent->{
            udetails a = new udetails();
            a.start(primaryStage);
        });
        Menu m3 = new Menu("",l3);
        l3.setFont(Font.font (13));
        
        Label l4 = new Label("Delete");
        l4.setOnMouseClicked(mouseEvent->{
            dblood a = new dblood();
            a.start(primaryStage);
        });
        Menu m4 = new Menu("",l4);
        l4.setFont(Font.font (13));
        
        Label l5 = new Label("View Donors");
        l5.setOnMouseClicked(mouseEvent->{
            vdonor a = new vdonor();
            a.start(primaryStage);
        });
        Menu m5 = new Menu("",l5);
        l5.setFont(Font.font (13));
        
        MenuBar m = new MenuBar();
        m.getMenus().add(m1);
        m.getMenus().add(m2);
        m.getMenus().add(m3);
        m.getMenus().add(m4);
        m.getMenus().add(m5);
        
        Label cosmic = new Label("Cosmic");
        cosmic.setFont(Font.font ("Monotype Corsiva", FontWeight.EXTRA_BOLD, FontPosture.ITALIC,54));
        HBox r1 = new HBox();
        r1.setPadding(new Insets(0,0,0,170));
        r1.getChildren().add(cosmic);
        
        Label c2 = new Label("Blood Bank");
        c2.setFont(Font.font ("Monotype Corsiva", FontWeight.EXTRA_BOLD, FontPosture.ITALIC,54));
        HBox r4 = new HBox();
        r4.setPadding(new Insets(0,0,0,125));
        r4.getChildren().add(c2);
        
        Label br = new Label("View Stock");
        br.setFont(Font.font ("Times New Roman", FontWeight.EXTRA_BOLD, 40));
        br.setStyle("-fx-background-color: aqua;");
        HBox r2 = new HBox();
        r2.setPadding(new Insets(10,0,20,145));
        r2.getChildren().add(br);
        
        TableView table = new TableView();
        TableColumn<det, String> bgroup = new TableColumn<>("Blood Group");
        bgroup.setCellValueFactory(new PropertyValueFactory<>("BloodGroup"));
        TableColumn<det, String> qty = new TableColumn<>("Quantity");
        qty.setCellValueFactory(new PropertyValueFactory<>("Quantity"));
        table.getColumns().addAll(bgroup,qty);
        table.setPrefHeight(300);
        table.prefWidth(300);
        table.setColumnResizePolicy (table.CONSTRAINED_RESIZE_POLICY);
        VBox r3 = new VBox();
        r3.setSpacing(5);
        r3.setPadding(new Insets (0,10,0,10));
        r3.getChildren().add(table);

        Button show = new Button("Show");
        show.setFont(Font.font ("Times New Roman", FontWeight.BOLD, 18));
        show.setPrefWidth(75);
        show.setOnAction((ActionEvent event) -> {
            table.getItems().clear();
            try{
                Class.forName("java.sql.DriverManager");
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:"
                        + "3309/javafx_blood_bank","root","root");
                Statement st= c.createStatement();
                String s = "Select * from stock";
                ResultSet rs = st.executeQuery(s);
                while(rs.next()){   
                    det a = new det();
                    a.Quantity = ""+rs.getDouble("Quantity");
                    a.BloodGroup = rs.getString("BloodGroup");
                    table.getItems().add(a);
                }
            }
            catch(Exception e)
            {JOptionPane.showMessageDialog(null, e.getMessage());} 
        });
        
        Button clear = new Button("Clear");
        clear.setFont(Font.font ("Times New Roman", FontWeight.BOLD, 18));
        clear.setPrefWidth(75);
        clear.setOnAction((ActionEvent event) -> {
            table.getItems().clear();
        });
        
        Button back = new Button("Back");
        back.setFont(Font.font ("Times New Roman", FontWeight.BOLD, 18));
        back.setPrefWidth(75);
        back.setOnAction((ActionEvent event) -> {
            Servicedetails e = new Servicedetails();
            e.start(primaryStage);
        });
        
        Button exit = new Button("Exit");
        exit.setFont(Font.font ("Times New Roman", FontWeight.BOLD, 18));
        exit.setPrefWidth(75);
        exit.setOnAction((ActionEvent event) -> {
            Exit e = new Exit();
            e.start(primaryStage);
        });
        
        HBox r10 = new HBox();
        r10.getChildren().add(show);
        r10.getChildren().add(clear);
        r10.getChildren().add(back);
        r10.getChildren().add(exit);
        r10.setSpacing(65);
        r10.setPadding(new Insets(25,10,30,10));
        
        VBox frame = new VBox();
        frame.getChildren().add(m);
        frame.getChildren().add(r1);
        frame.getChildren().add(r4);
        frame.getChildren().add(r2);
        frame.getChildren().add(r3);
        frame.getChildren().add(r10);
        
        try {
            FileInputStream input = new FileInputStream("src\\donate_blood.jpg"); 
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
        
        Scene scene = new Scene(frame, 500, 547);
        
        primaryStage.setTitle("Cosmic");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }

    public class det {

        public String BloodGroup;
        public String Quantity;
        public det() {
        }
        
        public det(String a, String b) {
            BloodGroup = a;
            Quantity = a;
        }
        
        public String getBloodGroup() {
            return BloodGroup;
        }

        public String getQuantity() {
            return Quantity;
        }
    }
}