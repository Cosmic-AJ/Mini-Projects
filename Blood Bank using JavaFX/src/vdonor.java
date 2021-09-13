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
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author Ayush Jain
 */
public class vdonor extends Application {
    
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
        cosmic.setTextFill(Color.web("#FFFF00"));
        HBox r1 = new HBox();
        r1.setPadding(new Insets(0,0,0,240));
        r1.getChildren().add(cosmic);
        
        Label c2 = new Label("Blood Bank");
        c2.setFont(Font.font ("Monotype Corsiva", FontWeight.EXTRA_BOLD, FontPosture.ITALIC,54));
        c2.setTextFill(Color.web("#FFFF00"));
        HBox r4 = new HBox();
        r4.setPadding(new Insets(0,0,0,195));
        r4.getChildren().add(c2);
        
        Label br = new Label("View Donors");
        br.setFont(Font.font ("Times New Roman", FontWeight.EXTRA_BOLD, 40));
        br.setStyle("-fx-background-color: aqua;");
        HBox r2 = new HBox();
        r2.setPadding(new Insets(10,0,20,210));
        r2.getChildren().add(br);
        
        TableView table = new TableView();
        TableColumn<don, String> did = new TableColumn<>("DID");
        did.setCellValueFactory(new PropertyValueFactory<>("Did"));
        TableColumn<don, String> dname = new TableColumn<>("Donor Name");
        dname.setCellValueFactory(new PropertyValueFactory<>("Dname"));
        TableColumn<don, String> bg = new TableColumn<>("Blood Group");
        bg.setCellValueFactory(new PropertyValueFactory<>("Bgroup"));
        TableColumn<don, String> pno = new TableColumn<>("Phone No");
        pno.setCellValueFactory(new PropertyValueFactory<>("No"));
        TableColumn<don, String> qty = new TableColumn<>("Quantity");
        qty.setCellValueFactory(new PropertyValueFactory<>("Qty"));
        TableColumn<don, String> gift = new TableColumn<>("Gift");
        gift.setCellValueFactory(new PropertyValueFactory<>("Gift"));
        TableColumn<don, String> dod = new TableColumn<>("DOD");
        dod.setCellValueFactory(new PropertyValueFactory<>("DOD"));
        table.getColumns().addAll(did,dname,bg,pno,qty,gift,dod);
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
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost"
                        + ":3309/javafx_blood_bank","root","root");
                Statement st= c.createStatement();
                String s = "Select * from donor";
                ResultSet rs = st.executeQuery(s);
                while(rs.next()){
                    don a = new don();
                    a.did = ""+rs.getInt("did");
                    a.dname = rs.getString("donorname");
                    a.bgroup = rs.getString("BloodGroup");
                    a.no = rs.getString("phoneno");
                    a.qty = ""+rs.getDouble("Quantity");
                    a.gift = rs.getString("gift");
                    a.dod = rs.getString("dod");
                    table.getItems().add(a);
                 }
            }catch(Exception e)
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
        r10.setPadding(new Insets(25,10,30,78));
        
        VBox frame = new VBox();
        frame.getChildren().add(m);
        frame.getChildren().add(r1);
        frame.getChildren().add(r4);
        frame.getChildren().add(r2);
        frame.getChildren().add(r3);
        frame.getChildren().add(r10);
        
        try {
            FileInputStream input = new FileInputStream("src\\original.jpg"); 
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
        
        Scene scene = new Scene(frame, 650, 500);
        
        primaryStage.setTitle("Cosmic");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }

    public class don {
        String did;
        String dname;
        String bgroup;
        String no;
        String qty;
        String gift;
        String dod;
        
        public don() {
        }
        
        public don(String a, String b, String c, String d, String e, String f, String h) {
            did = a;
            dname = b;
            bgroup = c;
            no = d;
            qty = e;
            gift = f;
            dod = h;
        }
        
        public String getDid() {
            return did;
        }
        
        public String getDname() {
            return dname;
        }
        
        public String getBgroup() {
            return bgroup;
        }
        
        public String getNo() {
            return no;
        }
        
        public String getQty() {
            return qty;
        }
        
        public String getGift() {
            return gift;
        }
        
        public String getDOD() {
            return dod;
        }
    }
}