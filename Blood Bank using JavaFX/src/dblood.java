/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.HeadlessException;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
import javafx.scene.input.MouseEvent;
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
public class dblood extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Label l1 = new Label("Received Blood");
        l1.setOnMouseClicked(mouseEvent->{
            rblood a = new rblood();
            a.start(primaryStage);
        });
        l1.setFont(Font.font (13));
        Menu m1 = new Menu("",l1);
        
        Label l2 = new Label("View Stock");
        l2.setOnMouseClicked(mouseEvent->{
            vdetails a = new vdetails();
            a.start(primaryStage);
        });
        l2.setFont(Font.font (13));
        Menu m2 = new Menu("",l2);
        
        Label l3 = new Label("Distribute");
        l3.setOnMouseClicked(mouseEvent->{
            udetails a = new udetails();
            a.start(primaryStage);
        });
        l3.setFont(Font.font (13));
        Menu m3 = new Menu("",l3);
        
        Label l4 = new Label("Delete");
        l4.setOnMouseClicked(mouseEvent->{
            dblood a = new dblood();
            a.start(primaryStage);
        });
        l4.setFont(Font.font (13));
        Menu m4 = new Menu("",l4);
        
        Label l5 = new Label("View Donors");
        l5.setOnMouseClicked(mouseEvent->{
            vdonor a = new vdonor();
            a.start(primaryStage);
        });
        l5.setFont(Font.font (13));
        Menu m5 = new Menu("",l5);
        
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
        
        Label br = new Label("Delete Record");
        br.setFont(Font.font ("Times New Roman", FontWeight.EXTRA_BOLD, 30));
        br.setStyle("-fx-background-color: aqua;");
        HBox r2 = new HBox();
        r2.setPadding(new Insets(10,0,20,150));
        r2.getChildren().add(br);
        
        Label selectitem = new Label("Select Blood Group");
        selectitem.setFont(Font.font ("Times New Roman", FontWeight.BOLD, 22));
        ObservableList<String> options = FXCollections.observableArrayList( "A+", "A-", "B+","B-", "O+", "O-", "AB+", "AB-");
        ComboBox sitem = new ComboBox(options);
        sitem.getEditor().setFont(Font.font("Times New Roman", FontWeight.BOLD, 22));
        sitem.setPrefHeight(30);
        sitem.setPrefWidth(160);
        sitem.setEditable(false);
        HBox r5 = new HBox();
        r5.setSpacing(86);
        r5.setPadding(new Insets(15,10,10,30));
        r5.getChildren().add(selectitem);
        r5.getChildren().add(sitem);
        
        Label selectquantity = new Label("Select Quantity (ml.)");
        selectquantity.setFont(Font.font ("Times New Roman", FontWeight.BOLD, 22));
        Spinner quantity = new Spinner(300,400,1);
        quantity.setPrefHeight(30);
        quantity.setPrefWidth(159);
        quantity.getValueFactory().setValue(350);
        quantity.setEditable(false);
        HBox r7 = new HBox();
        r7.setSpacing(76);
        r7.setPadding(new Insets(15,10,10,30));
        r7.getChildren().add(selectquantity);
        r7.getChildren().add(quantity);
        
        Label did = new Label("Enter Donor Id");
        did.setFont(Font.font ("Times New Roman", FontWeight.BOLD, 22));
        TextField donorid = new TextField();
        donorid.setFont(Font.font ("Times New Roman", 18));
        donorid.setPrefWidth(160);
        donorid.setOnMouseExited((MouseEvent e)->{
            if(!donorid.getText().equals("")){
                try{
                    Class.forName("java.sql.DriverManager");
                    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3309/javafx_blood_bank","root","root");
                    int a = Integer.parseInt(donorid.getText());
                    String s = "Select * from donor where did="+a+"";
                    Statement st= c.createStatement();
                    ResultSet rs = st.executeQuery(s);
                    int qua=0;
                    String g=null; 
                    while(rs.next())
                    {qua = rs.getInt("Quantity");
                     g = rs.getString("BloodGroup");}
                    if(qua==0){
                        JOptionPane.showMessageDialog(null,"Incorrect Donor Id.");
                        sitem.setValue(g);
                        quantity.getValueFactory().setValue(qua);
                    }else{
                        sitem.setValue(g);
                        quantity.getValueFactory().setValue(qua);
                    }
                }
                catch(HeadlessException | ClassNotFoundException | NumberFormatException | SQLException er){
                    JOptionPane.showMessageDialog(null, er.getMessage());
                }
            }else{
                sitem.setValue(null);
                quantity.getValueFactory().setValue(350);
            }
        });
        
        HBox r3 = new HBox();
        r3.setSpacing(125);
        r3.setPadding(new Insets(30,10,10,30));
        r3.getChildren().add(did);
        r3.getChildren().add(donorid);
        
        Button del = new Button("Delete");
        del.setFont(Font.font ("Times New Roman", FontWeight.BOLD, 18));
        del.setPrefWidth(80);
        del.setOnAction((ActionEvent event) -> {
            try{
                Class.forName("java.sql.DriverManager");
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost"
                        + ":3309/javafx_blood_bank","root","root");
                int i = Integer.parseInt(donorid.getText());
                int q = (int )quantity.getValueFactory().getValue();
                String bgr = (String) sitem.getValue();
                Statement st= c.createStatement();
                String s = "Select * from stock where bloodgroup='"+bgr+"'";
                ResultSet rs = st.executeQuery(s);
                double qua=0;
                while(rs.next())
                {qua = rs.getDouble("Quantity");}
                if((qua-q)>=0){
                    st= c.createStatement();
                    s = "Delete from donor where did="+i;
                    String up ="update stock set quantity=quantity-"+q+" where bloodgroup='"+bgr+"'";
                    int p = st.executeUpdate(up);
                    int a = st.executeUpdate(s);
                    if(a>0 && p>0){
                        JOptionPane.showMessageDialog(null,"Record Deleted Successfully");
                        donorid.setText("");
                        sitem.setValue(null);
                        quantity.getValueFactory().setValue(350);
                    }else{
                        JOptionPane.showMessageDialog(null,"Record not Deleted");
                        donorid.setText("");
                        sitem.setValue(null);
                        quantity.getValueFactory().setValue(350);
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Record not deleted because of insufficient stock or\nblood has been already distributed.");
                    donorid.setText("");
                    sitem.setValue(null);
                    quantity.getValueFactory().setValue(350);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            } 
        });
        
        Button clear = new Button("Clear");
        clear.setFont(Font.font ("Times New Roman", FontWeight.BOLD, 18));
        clear.setPrefWidth(70);
        clear.setOnAction((ActionEvent event) -> {
            donorid.setText("");
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
        r9.getChildren().add(del);
        r9.getChildren().add(clear);
        r9.getChildren().add(back);
        r9.getChildren().add(exit);
        r9.setSpacing(60);
        r9.setPadding(new Insets(33,10,10,20));
        
        VBox frame = new VBox();
        frame.getChildren().add(m);
        frame.getChildren().add(r1);
        frame.getChildren().add(r4);
        frame.getChildren().add(r2);
        frame.getChildren().add(r3);
        frame.getChildren().add(r5);
        frame.getChildren().add(r7);
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
        
        Scene scene = new Scene(frame, 500, 501);
        
        primaryStage.setTitle("Cosmic");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}