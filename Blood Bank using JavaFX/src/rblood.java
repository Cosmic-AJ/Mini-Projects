/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.HeadlessException;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.*;
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
import javax.swing.JOptionPane;

/**
 *
 * @author Durgesh Kumar Sahu
 */
public class rblood extends Application {
    
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
        
        Label cosmic = new Label("Cosmic Blood Bank");
        cosmic.setFont(Font.font ("Monotype Corsiva", FontWeight.EXTRA_BOLD, FontPosture.ITALIC,42));
        HBox r1 = new HBox();
        r1.setPadding(new Insets(0,0,0,100));
        r1.getChildren().add(cosmic);
        
        Label br = new Label("Blood Received");
        br.setFont(Font.font ("Times New Roman", FontWeight.EXTRA_BOLD, 30));
        br.setStyle("-fx-background-color: aqua;");
        HBox r2 = new HBox();
        r2.setPadding(new Insets(0,0,20,150));
        r2.getChildren().add(br);
        
        Label did = new Label("Enter Donor Id");
        did.setFont(Font.font ("Times New Roman", FontWeight.BOLD, 22));
        TextField donorid = new TextField();
        donorid.setFont(Font.font ("Times New Roman", 18));
        donorid.setPrefWidth(160);
        HBox r3 = new HBox();
        r3.setSpacing(125);
        r3.setPadding(new Insets(10,10,10,30));
        r3.getChildren().add(did);
        r3.getChildren().add(donorid);
        
        Label name = new Label("Enter Donor Name");
        name.setFont(Font.font ("Times New Roman", FontWeight.BOLD, 22));
        TextField dname = new TextField();
        dname.setPrefWidth(160);
        dname.setFont(Font.font ("Times New Roman", 18));
        HBox r4 = new HBox();
        r4.setSpacing(90);
        r4.setPadding(new Insets(10,10,10,30));
        r4.getChildren().add(name);
        r4.getChildren().add(dname);
        
        Label selectitem = new Label("Select Blood Group");
        selectitem.setFont(Font.font ("Times New Roman", FontWeight.BOLD, 22));
        ObservableList<String> options = FXCollections.observableArrayList( "A+", "A-", "B+","B-", "O+", "O-", "AB+", "AB-");
        ComboBox sitem = new ComboBox(options);
        sitem.getEditor().setFont(Font.font("Times New Roman", FontWeight.BOLD, 22));
        sitem.setPrefHeight(30);
        sitem.setPrefWidth(160);
        HBox r5 = new HBox();
        r5.setSpacing(86);
        r5.setPadding(new Insets(10,10,10,30));
        r5.getChildren().add(selectitem);
        r5.getChildren().add(sitem);
        
        Label ph = new Label("Phone No.");
        ph.setFont(Font.font ("Times New Roman", FontWeight.BOLD, 22));
        TextField pno = new TextField();
        pno.setPrefWidth(160);
        pno.setFont(Font.font ("Times New Roman", 18));
        HBox r6 = new HBox();
        r6.setSpacing(174);
        r6.setPadding(new Insets(10,10,10,30));
        r6.getChildren().add(ph);
        r6.getChildren().add(pno);
        
        Label selectquantity = new Label("Select Quantity (ml.)");
        selectquantity.setFont(Font.font ("Times New Roman", FontWeight.BOLD, 22));
        Spinner quantity = new Spinner(300,400,1);
        quantity.setPrefHeight(30);
        quantity.setPrefWidth(159);
        quantity.getValueFactory().setValue(350);
        HBox r7 = new HBox();
        r7.setSpacing(76);
        r7.setPadding(new Insets(10,10,10,30));
        r7.getChildren().add(selectquantity);
        r7.getChildren().add(quantity);
        
        Label gift = new Label("Gift Given");
        gift.setFont(Font.font ("Times New Roman", FontWeight.BOLD, 22));
        ObservableList<String> gifts = FXCollections.observableArrayList( "Mug", "Teddy", "Bear", "Plate","Car", "Box", "Chocolates");
        ComboBox gitem = new ComboBox(gifts);
        gitem.getEditor().setFont(Font.font("Times New Roman", 18));
        gitem.setPrefHeight(30);
        gitem.setPrefWidth(160);
        HBox r8 = new HBox();
        r8.setSpacing(171);
        r8.setPadding(new Insets(10,10,10,30));
        r8.getChildren().add(gift);
        r8.getChildren().add(gitem);
        
        Button save = new Button("Save");
        save.setFont(Font.font ("Times New Roman", FontWeight.BOLD, 18));
        save.setPrefWidth(70);
        save.setOnAction((ActionEvent event) -> {
            try{
                Class.forName("java.sql.DriverManager");
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost"
                        + ":3309/javafx_blood_bank","root","root");
                String n = dname.getText();
                String p = pno.getText();
                int i = Integer.parseInt(donorid.getText());
                int q = (int) quantity.getValueFactory().getValue();
                String bgr = (String) sitem.getValue();
                String gf = (String) gitem.getValue();
                Statement st= c.createStatement();
                String s = "Insert into donor values("+i+",'"+n+"','"+bgr+"','"+p
                        +"',"+q+",'"+gf+"',CURDATE())";
                String l = "Update stock set quantity=quantity+"+q+" where bloodgroup='"+bgr+"'";
                int h = st.executeUpdate(l);
                int a = st.executeUpdate(s);
                if(a>0){
                    JOptionPane.showMessageDialog(null,"Record Saved Successfully");
                    donorid.setText("");
                    dname.setText("");
                    pno.setText("");
                    gitem.setValue(null);
                    sitem.setValue(null);
                    quantity.getValueFactory().setValue(350);
                }else{
                    JOptionPane.showMessageDialog(null,"Record not Saved");
                    donorid.setText("");
                    dname.setText("");
                    pno.setText("");
                    gitem.setValue(null);
                    sitem.setValue(null);
                    quantity.getValueFactory().setValue(350);
                }
            }catch(HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            } 
        });
        
        Button clear = new Button("Clear");
        clear.setFont(Font.font ("Times New Roman", FontWeight.BOLD, 18));
        clear.setPrefWidth(70);
        clear.setOnAction((ActionEvent event) -> {
            donorid.setText("");
            dname.setText("");
            pno.setText("");
            gitem.setValue(null);
            sitem.setValue(null);
            quantity.getValueFactory().setValue(350);
        });
        
        Button back = new Button("Back");
        back.setFont(Font.font ("Times New Roman", FontWeight.BOLD, 18));
        back.setPrefWidth(70);
        back.setOnAction((ActionEvent event) -> {
            Servicedetails e = new Servicedetails();
            e.start(primaryStage);
        });
        
        Button exit = new Button("Exit");
        exit.setFont(Font.font ("Times New Roman", FontWeight.BOLD, 18));
        exit.setPrefWidth(70);
        exit.setOnAction((ActionEvent event) -> {
            Exit e = new Exit();
            e.start(primaryStage);
        });
        
        HBox r9 = new HBox();
        r9.getChildren().add(save);
        r9.getChildren().add(clear);
        r9.getChildren().add(back);
        r9.getChildren().add(exit);
        r9.setSpacing(60);
        r9.setPadding(new Insets(25,10,10,20));
        
        VBox frame = new VBox();
        frame.getChildren().add(m);
        frame.getChildren().add(r1);
        frame.getChildren().add(r2);
        frame.getChildren().add(r3);
        frame.getChildren().add(r4);
        frame.getChildren().add(r5);
        frame.getChildren().add(r6);
        frame.getChildren().add(r7);
        frame.getChildren().add(r8);
        frame.getChildren().add(r9);
        
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
        
        Scene scene = new Scene(frame, 500, 521);
        
        primaryStage.setTitle("Cosmic");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}