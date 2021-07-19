# -*- coding: utf-8 -*-

# Form implementation generated from reading ui file 'designnew.ui'
#
# Created by: PyQt5 UI code generator 5.13.2
#
# WARNING! All changes made in this file will be lost!

#importing libraries
from PyQt5 import QtCore, QtGui, QtWidgets
from PyQt5.QtWidgets import QMessageBox


class Ui_MainWindow(object):
    def setupUi(self, MainWindow):
        "User Interface Code"
        MainWindow.setObjectName("MainWindow")
        MainWindow.resize(711, 546)
        self.centralwidget = QtWidgets.QWidget(MainWindow)
        self.centralwidget.setObjectName("centralwidget")
        self.horizontalGroupBox = QtWidgets.QGroupBox(self.centralwidget)
        self.horizontalGroupBox.setGeometry(QtCore.QRect(40, 20, 651, 71))
        font = QtGui.QFont()
        font.setFamily("Comic Sans MS")
        font.setPointSize(10)
        
        self.horizontalGroupBox.setFont(font)
        self.horizontalGroupBox.setStyleSheet("background-color: rgb(227, 227, 227);")
        self.horizontalGroupBox.setObjectName("horizontalGroupBox")
        self.horizontalLayout = QtWidgets.QHBoxLayout(self.horizontalGroupBox)
        self.horizontalLayout.setObjectName("horizontalLayout")
        spacerItem = QtWidgets.QSpacerItem(10, 20, QtWidgets.QSizePolicy.Maximum, QtWidgets.QSizePolicy.Minimum)
        self.horizontalLayout.addItem(spacerItem)
        self.Batsmen_Label = QtWidgets.QLabel(self.horizontalGroupBox)
        font = QtGui.QFont()
        font.setFamily("Comic Sans MS")
        font.setPointSize(10)
        font.setBold(True)
        font.setWeight(75)
        
        self.Batsmen_Label.setFont(font)
        self.Batsmen_Label.setObjectName("Batsmen_Label")
        self.horizontalLayout.addWidget(self.Batsmen_Label)
        spacerItem1 = QtWidgets.QSpacerItem(2, 20, QtWidgets.QSizePolicy.Maximum, QtWidgets.QSizePolicy.Minimum)
        self.horizontalLayout.addItem(spacerItem1)
        self.Batsmen_Count = QtWidgets.QLabel(self.horizontalGroupBox)
        font = QtGui.QFont()
        font.setFamily("Comic Sans MS")
        font.setPointSize(10)
        font.setBold(True)
        font.setWeight(75)
        
        self.Batsmen_Count.setFont(font)
        self.Batsmen_Count.setStyleSheet("color: rgb(0, 170, 255);")
        self.Batsmen_Count.setObjectName("Batsmen_Count")
        self.horizontalLayout.addWidget(self.Batsmen_Count)
        spacerItem2 = QtWidgets.QSpacerItem(5, 20, QtWidgets.QSizePolicy.Maximum, QtWidgets.QSizePolicy.Minimum)
        self.horizontalLayout.addItem(spacerItem2)
        self.Bowlers_Label = QtWidgets.QLabel(self.horizontalGroupBox)
        font = QtGui.QFont()
        font.setFamily("Comic Sans MS")
        font.setPointSize(10)
        font.setBold(True)
        font.setWeight(75)
        
        self.Bowlers_Label.setFont(font)
        self.Bowlers_Label.setObjectName("Bowlers_Label")
        self.horizontalLayout.addWidget(self.Bowlers_Label)
        spacerItem3 = QtWidgets.QSpacerItem(2, 20, QtWidgets.QSizePolicy.Maximum, QtWidgets.QSizePolicy.Minimum)
        self.horizontalLayout.addItem(spacerItem3)
        self.Bowlers_Count = QtWidgets.QLabel(self.horizontalGroupBox)
        font = QtGui.QFont()
        font.setFamily("Comic Sans MS")
        font.setPointSize(10)
        font.setBold(True)
        font.setWeight(75)
        
        self.Bowlers_Count.setFont(font)
        self.Bowlers_Count.setStyleSheet("color: rgb(0, 170, 255);")
        self.Bowlers_Count.setObjectName("Bowlers_Count")
        self.horizontalLayout.addWidget(self.Bowlers_Count)
        spacerItem4 = QtWidgets.QSpacerItem(5, 20, QtWidgets.QSizePolicy.Maximum, QtWidgets.QSizePolicy.Minimum)
        self.horizontalLayout.addItem(spacerItem4)
        self.All_Rounders_Label = QtWidgets.QLabel(self.horizontalGroupBox)
        font = QtGui.QFont()
        font.setFamily("Comic Sans MS")
        font.setPointSize(10)
        font.setBold(True)
        font.setWeight(75)
        
        self.All_Rounders_Label.setFont(font)
        self.All_Rounders_Label.setObjectName("All_Rounders_Label")
        self.horizontalLayout.addWidget(self.All_Rounders_Label)
        self.All_Rounders_Count = QtWidgets.QLabel(self.horizontalGroupBox)
        font = QtGui.QFont()
        font.setFamily("Comic Sans MS")
        font.setPointSize(10)
        font.setBold(True)
        font.setWeight(75)
        
        self.All_Rounders_Count.setFont(font)
        self.All_Rounders_Count.setStyleSheet("color: rgb(0, 170, 255);")
        self.All_Rounders_Count.setObjectName("All_Rounders_Count")
        self.horizontalLayout.addWidget(self.All_Rounders_Count)
        self.Wicket_Keeper_Label = QtWidgets.QLabel(self.horizontalGroupBox)
        font = QtGui.QFont()
        font.setFamily("Comic Sans MS")
        font.setPointSize(10)
        font.setBold(True)
        font.setWeight(75)
        
        self.Wicket_Keeper_Label.setFont(font)
        self.Wicket_Keeper_Label.setObjectName("Wicket_Keeper_Label")
        self.horizontalLayout.addWidget(self.Wicket_Keeper_Label)
        spacerItem5 = QtWidgets.QSpacerItem(2, 20, QtWidgets.QSizePolicy.Maximum, QtWidgets.QSizePolicy.Minimum)
        self.horizontalLayout.addItem(spacerItem5)
        self.Wicket_Keeper_Count = QtWidgets.QLabel(self.horizontalGroupBox)
        font = QtGui.QFont()
        font.setFamily("Comic Sans MS")
        font.setPointSize(10)
        font.setBold(True)
        font.setWeight(75)
        
        self.Wicket_Keeper_Count.setFont(font)
        self.Wicket_Keeper_Count.setStyleSheet("color: rgb(0, 170, 255);")
        self.Wicket_Keeper_Count.setObjectName("Wicket_Keeper_Count")
        self.horizontalLayout.addWidget(self.Wicket_Keeper_Count)
        spacerItem6 = QtWidgets.QSpacerItem(0, 20, QtWidgets.QSizePolicy.Maximum, QtWidgets.QSizePolicy.Minimum)
        self.horizontalLayout.addItem(spacerItem6)
        self.horizontalFrame_4 = QtWidgets.QFrame(self.centralwidget)
        self.horizontalFrame_4.setGeometry(QtCore.QRect(60, 150, 261, 41))
        self.horizontalFrame_4.setStyleSheet("")
        self.horizontalFrame_4.setObjectName("horizontalFrame_4")
        self.horizontalLayout_10 = QtWidgets.QHBoxLayout(self.horizontalFrame_4)
        self.horizontalLayout_10.setObjectName("horizontalLayout_10")
        self.Batsman_RadioButton = QtWidgets.QRadioButton(self.horizontalFrame_4)
        font = QtGui.QFont()
        font.setFamily("Comic Sans MS")
        font.setPointSize(10)
        font.setBold(True)
        font.setWeight(75)
        
        self.Batsman_RadioButton.setFont(font)
        self.Batsman_RadioButton.setStyleSheet("background-color: rgb(255, 255, 255);")
        self.Batsman_RadioButton.setObjectName("Batsman_RadioButton")
        self.horizontalLayout_10.addWidget(self.Batsman_RadioButton)
        self.Bowler_RadioButton = QtWidgets.QRadioButton(self.horizontalFrame_4)
        font = QtGui.QFont()
        font.setFamily("Comic Sans MS")
        font.setPointSize(10)
        font.setBold(True)
        font.setWeight(75)
        
        self.Bowler_RadioButton.setFont(font)
        self.Bowler_RadioButton.setStyleSheet("background-color: rgb(255, 255, 255);")
        self.Bowler_RadioButton.setObjectName("Bowler_RadioButton")
        self.horizontalLayout_10.addWidget(self.Bowler_RadioButton)
        self.All_Rounder_RadioButton = QtWidgets.QRadioButton(self.horizontalFrame_4)
        font = QtGui.QFont()
        font.setFamily("Comic Sans MS")
        font.setPointSize(10)
        font.setBold(True)
        font.setWeight(75)
        
        self.All_Rounder_RadioButton.setFont(font)
        self.All_Rounder_RadioButton.setStyleSheet("background-color: rgb(255, 255, 255);")
        self.All_Rounder_RadioButton.setObjectName("All_Rounder_RadioButton")
        self.horizontalLayout_10.addWidget(self.All_Rounder_RadioButton)
        self.Wicket_Keeper_RadioButton = QtWidgets.QRadioButton(self.horizontalFrame_4)
        font = QtGui.QFont()
        font.setFamily("Comic Sans MS")
        font.setPointSize(10)
        font.setBold(True)
        font.setWeight(75)
        
        self.Wicket_Keeper_RadioButton.setFont(font)
        self.Wicket_Keeper_RadioButton.setStyleSheet("background-color: rgb(255, 255, 255);")
        self.Wicket_Keeper_RadioButton.setObjectName("Wicket_Keeper_RadioButton")
        self.horizontalLayout_10.addWidget(self.Wicket_Keeper_RadioButton)
        self.horizontalFrame_5 = QtWidgets.QFrame(self.centralwidget)
        self.horizontalFrame_5.setGeometry(QtCore.QRect(410, 150, 261, 38))
        self.horizontalFrame_5.setStyleSheet("")
        self.horizontalFrame_5.setObjectName("horizontalFrame_5")
        self.horizontalLayout_11 = QtWidgets.QHBoxLayout(self.horizontalFrame_5)
        self.horizontalLayout_11.setObjectName("horizontalLayout_11")
        spacerItem7 = QtWidgets.QSpacerItem(20, 20, QtWidgets.QSizePolicy.Fixed, QtWidgets.QSizePolicy.Minimum)
        self.horizontalLayout_11.addItem(spacerItem7)
        self.Team_Name_Label = QtWidgets.QLabel(self.horizontalFrame_5)
        font = QtGui.QFont()
        font.setFamily("Comic Sans MS")
        font.setPointSize(10)
        font.setBold(True)
        font.setWeight(75)
        
        self.Team_Name_Label.setFont(font)
        self.Team_Name_Label.setStyleSheet("background-color: rgb(255, 255, 255);")
        self.Team_Name_Label.setObjectName("Team_Name_Label")
        self.horizontalLayout_11.addWidget(self.Team_Name_Label)
        self.Team_Name = QtWidgets.QLabel(self.horizontalFrame_5)
        font = QtGui.QFont()
        font.setFamily("Comic Sans MS")
        font.setPointSize(10)
        font.setBold(True)
        font.setWeight(75)
        self.Team_Name.setFont(font)
        self.Team_Name.setStyleSheet("color: rgb(0, 170, 255);background-color: rgb(255, 255, 255);")
        self.Team_Name.setObjectName("Team_Name")
        self.horizontalLayout_11.addWidget(self.Team_Name)
        spacerItem8 = QtWidgets.QSpacerItem(16, 20, QtWidgets.QSizePolicy.Fixed, QtWidgets.QSizePolicy.Minimum)
        self.horizontalLayout_11.addItem(spacerItem8)
        self.layoutWidget = QtWidgets.QWidget(self.centralwidget)
        self.layoutWidget.setGeometry(QtCore.QRect(420, 120, 251, 360))
        self.layoutWidget.setObjectName("layoutWidget")
        self.verticalLayout_2 = QtWidgets.QVBoxLayout(self.layoutWidget)
        self.verticalLayout_2.setContentsMargins(0, 0, 0, 0)
        self.verticalLayout_2.setObjectName("verticalLayout_2")
        self.horizontalLayout_4 = QtWidgets.QHBoxLayout()
        self.horizontalLayout_4.setObjectName("horizontalLayout_4")
        self.Points_Used_Label = QtWidgets.QLabel(self.layoutWidget)
        font = QtGui.QFont()
        font.setFamily("Comic Sans MS")
        font.setPointSize(10)
        font.setBold(True)
        font.setWeight(75)
        
        self.Points_Used_Label.setFont(font)
        self.Points_Used_Label.setObjectName("Points_Used_Label")
        self.horizontalLayout_4.addWidget(self.Points_Used_Label)
        spacerItem9 = QtWidgets.QSpacerItem(10, 20, QtWidgets.QSizePolicy.Expanding, QtWidgets.QSizePolicy.Minimum)
        self.horizontalLayout_4.addItem(spacerItem9)
        self.Points_Used = QtWidgets.QLabel(self.layoutWidget)
        font = QtGui.QFont()
        font.setFamily("Comic Sans MS")
        font.setPointSize(10)
        font.setBold(True)
        font.setWeight(75)
        
        self.Points_Used.setFont(font)
        self.Points_Used.setStyleSheet("color: rgb(0, 170, 255);")
        self.Points_Used.setObjectName("Points_Used")
        self.horizontalLayout_4.addWidget(self.Points_Used)
        spacerItem10 = QtWidgets.QSpacerItem(200, 20, QtWidgets.QSizePolicy.Expanding, QtWidgets.QSizePolicy.Minimum)
        self.horizontalLayout_4.addItem(spacerItem10)
        self.verticalLayout_2.addLayout(self.horizontalLayout_4)
        self.Players_Selected = QtWidgets.QListWidget(self.layoutWidget)
        font = QtGui.QFont()
        font.setFamily("Comic Sans MS")
        font.setPointSize(11)
        font.setBold(True)
        font.setWeight(75)
        
        self.Players_Selected.setFont(font)
        self.Players_Selected.setLayoutDirection(QtCore.Qt.LeftToRight)
        self.Players_Selected.setStyleSheet("color: rgb(0, 170, 255);\n"
            "background-color: rgb(255, 255, 255);\n"
            "padding-top:50px;\n"
            "padding-left:25px;\n"
            "")
        self.Players_Selected.setObjectName("Players_Selected")
        self.verticalLayout_2.addWidget(self.Players_Selected)
        self.widget = QtWidgets.QWidget(self.centralwidget)
        self.widget.setGeometry(QtCore.QRect(60, 120, 261, 360))
        self.widget.setObjectName("widget")
        self.verticalLayout = QtWidgets.QVBoxLayout(self.widget)
        self.verticalLayout.setContentsMargins(0, 0, 0, 0)
        self.verticalLayout.setObjectName("verticalLayout")
        self.horizontalLayout_3 = QtWidgets.QHBoxLayout()
        self.horizontalLayout_3.setObjectName("horizontalLayout_3")
        self.Points_Available_Label = QtWidgets.QLabel(self.widget)
        font = QtGui.QFont()
        font.setFamily("Comic Sans MS")
        font.setPointSize(10)
        font.setBold(True)
        font.setWeight(75)
        
        self.Points_Available_Label.setFont(font)
        self.Points_Available_Label.setObjectName("Points_Available_Label")
        self.horizontalLayout_3.addWidget(self.Points_Available_Label)
        spacerItem11 = QtWidgets.QSpacerItem(10, 20, QtWidgets.QSizePolicy.Expanding, QtWidgets.QSizePolicy.Minimum)
        self.horizontalLayout_3.addItem(spacerItem11)
        self.Points_Available = QtWidgets.QLabel(self.widget)
        font = QtGui.QFont()
        font.setFamily("Comic Sans MS")
        font.setPointSize(10)
        font.setBold(True)
        font.setWeight(75)
        self.Points_Available.setFont(font)
        self.Points_Available.setStyleSheet("color: rgb(0, 170, 255);")
        self.Points_Available.setObjectName("Points_Available")
        self.horizontalLayout_3.addWidget(self.Points_Available)
        spacerItem12 = QtWidgets.QSpacerItem(200, 20, QtWidgets.QSizePolicy.Expanding, QtWidgets.QSizePolicy.Minimum)
        self.horizontalLayout_3.addItem(spacerItem12)
        self.verticalLayout.addLayout(self.horizontalLayout_3)
        self.Players_Available = QtWidgets.QListWidget(self.widget)
        font = QtGui.QFont()
        font.setFamily("Comic Sans MS")
        font.setPointSize(11)
        font.setBold(True)
        font.setWeight(75)
        
        self.Players_Available.setFont(font)
        self.Players_Available.setLayoutDirection(QtCore.Qt.LeftToRight)
        self.Players_Available.setStyleSheet("color: rgb(0, 170, 255);\n"
            "background-color: rgb(255, 255, 255);\n"
            "padding-top:50px;\n"
            "padding-left:25px;\n"
            "")
        self.Players_Available.setObjectName("Players_Available")
        self.verticalLayout.addWidget(self.Players_Available)
        self.Send = QtWidgets.QLabel(self.centralwidget)
        self.Send.setGeometry(QtCore.QRect(360, 120, 20, 360))
        font = QtGui.QFont()
        font.setFamily("Comic Sans MS")
        font.setPointSize(19)
        font.setBold(True)
        font.setWeight(75)
        
        self.Send.setFont(font)
        self.Send.setObjectName("Send")
        self.layoutWidget.raise_()
        self.horizontalGroupBox.raise_()
        self.horizontalFrame_5.raise_()
        self.Send.raise_()
        self.horizontalFrame_4.raise_()
        MainWindow.setCentralWidget(self.centralwidget)
        self.menubar = QtWidgets.QMenuBar(MainWindow)
        self.menubar.setGeometry(QtCore.QRect(0, 0, 711, 21))
        self.menubar.setObjectName("menubar")
        self.Manage_Teams = QtWidgets.QMenu(self.menubar)
        font = QtGui.QFont()
        font.setFamily("Comic Sans MS")
        font.setPointSize(10)
        
        self.Manage_Teams.setFont(font)
        self.Manage_Teams.setSeparatorsCollapsible(False)
        self.Manage_Teams.setObjectName("Manage_Teams")
        MainWindow.setMenuBar(self.menubar)
        self.statusbar = QtWidgets.QStatusBar(MainWindow)
        self.statusbar.setObjectName("statusbar")
        MainWindow.setStatusBar(self.statusbar)
        self.actionNEW_team = QtWidgets.QAction(MainWindow)
        font = QtGui.QFont()
        font.setFamily("Comic Sans MS")
        font.setPointSize(8)
        
        self.actionNEW_team.setFont(font)
        self.actionNEW_team.setObjectName("actionNEW_team")
        self.New_Team = QtWidgets.QAction(MainWindow)
        font = QtGui.QFont()
        font.setFamily("Comic Sans MS")
        font.setPointSize(10)
        
        self.New_Team.setFont(font)
        self.New_Team.setObjectName("New_Team")
        self.Open_Team = QtWidgets.QAction(MainWindow)
        font = QtGui.QFont()
        font.setFamily("Comic Sans MS")
        
        self.Open_Team.setFont(font)
        self.Open_Team.setObjectName("Open_Team")
        self.Save_Team = QtWidgets.QAction(MainWindow)
        self.Save_Team.setObjectName("Save_Team")
        self.Evaluate_Team = QtWidgets.QAction(MainWindow)
        self.Evaluate_Team.setObjectName("Evaluate_Team")
        self.Manage_Teams.addAction(self.New_Team)
        self.Manage_Teams.addAction(self.Open_Team)
        self.Manage_Teams.addAction(self.Save_Team)
        self.Manage_Teams.addAction(self.Evaluate_Team)
        self.menubar.addAction(self.Manage_Teams.menuAction())

        # Connecting RadioButtons
        self.Batsman_RadioButton.toggled.connect(self.ctg)
        self.Bowler_RadioButton.toggled.connect(self.ctg)
        self.All_Rounder_RadioButton.toggled.connect(self.ctg)
        self.Wicket_Keeper_RadioButton.toggled.connect(self.ctg)
        
        # Disabling RadioButtons
        self.Batsman_RadioButton.setEnabled(False)
        self.Bowler_RadioButton.setEnabled(False)
        self.All_Rounder_RadioButton.setEnabled(False)
        self.Wicket_Keeper_RadioButton.setEnabled(False)
        
        # Adding and removal of players in Lists
        self.Players_Available.itemDoubleClicked.connect(self.removePlayersAvailable)
        self.Players_Selected.itemDoubleClicked.connect(self.removePlayersSelected)
        
        self.Manage_Teams.triggered[QtWidgets.QAction].connect(self.menu)
        
        # variables containing the count 
        self.bat=0
        self.bwl=0
        self.ar=0
        self.wk=0
        self.avl=1000
        self.used=0
        
        self.retranslateUi(MainWindow)
        self.Players_Available.setCurrentRow(-1)
        QtCore.QMetaObject.connectSlotsByName(MainWindow)

    def retranslateUi(self, MainWindow):
        "Setting the value of Widgets"
        _translate = QtCore.QCoreApplication.translate
        MainWindow.setWindowTitle(_translate("MainWindow", "Fantasy"))
        self.horizontalGroupBox.setTitle(_translate("MainWindow", "Your Selections"))
        self.Batsmen_Label.setText(_translate("MainWindow", "Batsmen (BAT)"))
        self.Batsmen_Count.setText(_translate("MainWindow", "##"))
        self.Bowlers_Label.setText(_translate("MainWindow", "Bowlers (BOW)"))
        self.Bowlers_Count.setText(_translate("MainWindow", "##"))
        self.All_Rounders_Label.setText(_translate("MainWindow", "All Rounders (AR)"))
        self.All_Rounders_Count.setText(_translate("MainWindow", "##"))
        self.Wicket_Keeper_Label.setText(_translate("MainWindow", "Wicket-Keeper (WK)"))
        self.Wicket_Keeper_Count.setText(_translate("MainWindow", "##"))
        self.Batsman_RadioButton.setText(_translate("MainWindow", "BAT"))
        self.Bowler_RadioButton.setText(_translate("MainWindow", "BOW"))
        self.All_Rounder_RadioButton.setText(_translate("MainWindow", "AR"))
        self.Wicket_Keeper_RadioButton.setText(_translate("MainWindow", "WK"))
        self.Team_Name_Label.setText(_translate("MainWindow", "Team Name"))
        self.Team_Name.setText(_translate("MainWindow", "Displayed Here"))
        self.Points_Used_Label.setText(_translate("MainWindow", "Points Used"))
        self.Points_Used.setText(_translate("MainWindow", "####"))
        self.Points_Available_Label.setText(_translate("MainWindow", "Points Available"))
        self.Points_Available.setText(_translate("MainWindow", "####"))
        self.Send.setText(_translate("MainWindow", ">"))
        self.Manage_Teams.setTitle(_translate("MainWindow", "Manage Teams"))
        self.actionNEW_team.setText(_translate("MainWindow", "NEW Team"))
        self.New_Team.setText(_translate("MainWindow", "NEW Team"))
        self.Open_Team.setText(_translate("MainWindow", "OPEN Team"))
        self.Save_Team.setText(_translate("MainWindow", "SAVE Team"))
        self.Evaluate_Team.setText(_translate("MainWindow", "EVALUATE Team"))

       
    def menu(self,action):
        "Menu option"
        txt=(action.text())
        if txt=='NEW Team':
            # create a new team
            self.bat=0
            self.bwl=0
            self.ar=0
            self.wk=0
            self.avl=1000
            self.used=0
            self.Players_Available.clear()
            self.Players_Selected.clear()
            text, ok=QtWidgets.QInputDialog.getText(MainWindow, "Team", "Enter name of Team:")
            if ok:
                self.Team_Name.setText(str(text))
            if text=='':
                self.Team_Name.setText("Displayed Here")
                self.showmessage("You need to enter name of Team.")
                return
            sql="Select * from teams where name='"+text+"'"
            cur = conn.execute(sql)
            row = cur.fetchone()
            if row is not None:
                self.Team_Name.setText("Displayed Here")
                self.showmessage("Team name already exists")
                return
            self.show()
            self.enable()


        if txt=='SAVE Team':
            # Save a team
            count=self.Players_Selected.count()
            selected=""
            for i in range(count):
                selected+=self.Players_Selected.item(i).text()
                if i<count:
                    selected+=","
            self.saveteam(self.Team_Name.text(),selected,self.used)

        if txt=='OPEN Team':
            # Open existing team
            self.bat=0
            self.bwl=0
            self.ar=0
            self.wk=0
            self.avl=1000
            self.used=0
            self.Players_Available.clear()
            self.Players_Selected.clear()
            self.openteam()
    
        if txt=='EVALUATE Team':
           # Evaluate a team
           from evaluation import Ui_Evaluation
           Dialog = QtWidgets.QDialog()
           ui = Ui_Evaluation()
           ui.setupUi(Dialog)
           Dialog.exec()


    def enable(self):
        "Enable the RadioButtons"
        self.Batsman_RadioButton.setEnabled(True)
        self.Bowler_RadioButton.setEnabled(True)
        self.All_Rounder_RadioButton.setEnabled(True)
        self.Wicket_Keeper_RadioButton.setEnabled(True)
        
        
    def show(self):
        "Show updated values in the count fields"
        self.Batsmen_Count.setText(str(self.bat))
        self.Bowlers_Count.setText(str(self.bwl))
        self.Wicket_Keeper_Count.setText(str(self.wk))
        self.All_Rounders_Count.setText(str(self.ar))
        self.Points_Available.setText(str(self.avl))
        self.Points_Used.setText(str(self.used))
        

    def criteria(self,category,item):
        "Checking the validations and incrementing the count of players"
        msg=''
        if category=="BAT" and self.bat>=5:msg="You can't select more than 5 batsmen."
        if category=="BWL" and self.bwl>=5:msg="You can't select more than 5 bowlers."
        if category=="AR" and self.ar>=3:msg="You can't select more than 3 all-rounders."
        if category=="WK" and self.wk>=1:msg="You can't select more than 1 wicket-keeper."
        if self.bat + self.bwl + self.ar + self.wk >=11:msg="You can't select more than 11 Players."
        if msg!='':
            self.showmessage(msg)
            return False
        
        sql="SELECT value from stats where player_name='"+item.text()+"'"
        cur=conn.execute(sql)
        row=cur.fetchone()
        if (self.avl-int(row[0]))<0:
            msg="Insufficient credits to purchase this player."
            self.showmessage(msg)
            return False
        
        # increasing the count of players category
        if category=="BAT":self.bat+=1
        if category=="BWL":self.bwl+=1
        if category=="AR":self.ar+=1
        if category=="WK":self.wk+=1

        self.avl-=int(row[0])
        self.used+=int(row[0])
        return True


    def removePlayersAvailable(self,item):
        "Removes the available players from the list"
        category=''
        if self.Batsman_RadioButton.isChecked()==True:category='BAT'
        if self.Bowler_RadioButton.isChecked()==True:category='BWL'
        if self.All_Rounder_RadioButton.isChecked()==True:category='AR'
        if self.Wicket_Keeper_RadioButton.isChecked()==True:category='WK'
        ret=self.criteria(category,item)
        
        if ret==True:
            self.Players_Available.takeItem(self.Players_Available.row(item))
            self.Players_Selected.addItem(item.text())
            self.show()
      
        
    def ctg(self):
        "Assigning the category"
        category=''
        if self.Batsman_RadioButton.isChecked()==True:category='BAT'
        if self.Bowler_RadioButton.isChecked()==True:category='BWL'
        if self.All_Rounder_RadioButton.isChecked()==True:category='AR'
        if self.Wicket_Keeper_RadioButton.isChecked()==True:category='WK'
       	
        self.fillAvailable(category)


    def removePlayersSelected(self,item):
        "Removes the selected players from the list"
        self.Players_Selected.takeItem(self.Players_Selected.row(item))
        
        cursor = conn.execute("SELECT player_name,value, ctg from stats where player_name='"+item.text()+"'")
        row=cursor.fetchone()
        self.avl=self.avl+int(row[1])
        self.used=self.used-int(row[1])
        category=row[2]
        if category=="BAT":
            self.bat-=1
            if self.Batsman_RadioButton.isChecked()==True:self.Players_Available.addItem(item.text())
        if category=="BWL":
            self.bwl-=1
            if self.Bowler_RadioButton.isChecked()==True:self.Players_Available.addItem(item.text())
        if category=="AR":
            self.ar-=1
            if self.All_Rounder_RadioButton.isChecked()==True:self.Players_Available.addItem(item.text())
        if category=="WK":
            self.wk-=1
            if self.Wicket_Keeper_RadioButton.isChecked()==True:self.Players_Available.addItem(item.text())
        self.show()


    def fillAvailable(self,category):
        "Filling the players available list"
        if self.Team_Name.text()=='' or self.Team_Name.text()=='Displayed Here':
            self.showmessage("Enter name of Team.")
            return
        
        self.Players_Available.clear()
        sql="SELECT player_name from Stats where ctg='"+category+"';"
        cur=conn.execute(sql)
        for row in cur:
            selected=[]
            for i in range(self.Players_Selected.count()):
                selected.append(self.Players_Selected.item(i).text())
            if row[0] not in selected:self.Players_Available.addItem(row[0])
        
        
    def openteam(self):
        "Opening an existing team"
        sql="select name from teams;"
        cur=conn.execute(sql)
        teams=[]
        for row in cur:
            teams.append(row[0])
        
        team, ok=QtWidgets.QInputDialog.getItem(MainWindow,"Dream","Choose A Team",teams,0,False)
        if ok and team:
            self.Team_Name.setText(team)
        if self.Team_Name.text()=="Displayed Here" or team=='' or self.Team_Name.text()=="":
            self.showmessage("You need to select a Team.")
            return
        #self.show()
        sql1="SELECT players,value from teams where name='"+team+"';"
        cur=conn.execute(sql1)
        row=cur.fetchone()
        selected=row[0].split(',')
        selected.remove('')
        self.Players_Selected.addItems(selected)
        self.used=row[1]
        
        self.avl=1000-row[1]
        count=self.Players_Selected.count()

        #iterate to count no. of specific players

        for i in range(count):
            ply=self.Players_Selected.item(i).text()
            
            sql="select ctg from stats where player_name='"+ply+"';"
            cur=conn.execute(sql)
            row=cur.fetchone()
            category=row[0]
            
            if category=="BAT":self.bat+=1
            if category=="BWL":self.bwl+=1
            if category=="AR":self.ar+=1
            if category=="WK":self.wk+=1  

        self.show()
        self.enable()
            
        
    def saveteam(self,nm,ply,val):
        "Saving the team details in database"
        msg=''
        # Checking basic requirements of a team
        if self.wk<1:msg="You need to select 1 wicket-keeper"
        if self.bat<3:msg="You need to select at least 3 batsmen"
        if self.bwl<3:msg="You need to select at least 3 bowlers"
        if self.bat+self.bwl+self.ar+self.wk!=11:msg="You need to select 11 players."
        if self.Team_Name.text()=="Displayed Here":msg="You need to select a Team."
        if msg!='':
            self.showmessage(msg)
            return
        
        sqlsearch = "Select * from teams where name='"+nm+"';"
        cur=conn.execute(sqlsearch)
        a = cur.fetchone()
        if a is None:
            # inserting the team details in database
            sql="INSERT INTO teams (name,players,value) VALUES ('"+nm+"','"+ply+"',"+str(val)+");"
        else:
            # updating the players in a team
            sql="update teams set name = '"+nm+"' ,players = '"+ply+"' ,value = "+str(val)+" where name = '"+nm+"';"   #print("f3f4")
        try:
            conn.execute(sql)
            self.showmessage("Team Saved Succesfully.","Information")
            conn.commit()
        except:
            self.showmessage("Error in Operation.")
            conn.rollback()
                    
            
    def showmessage(self,msg,typeofmessage="Critical"):
        "Showing a message using Dialog Box"
        Dialog=QtWidgets.QMessageBox()
        if typeofmessage=="Critical":
            Dialog.setIcon(QMessageBox.Critical)
        else:
            Dialog.setIcon(QMessageBox.Information)
        Dialog.setText(msg)
        Dialog.setWindowTitle("Fantasy Game")
        Dialog.exec()     
        
        
        
if __name__ == "__main__":
    "Starting the project"
    import sqlite3
    conn = sqlite3.connect('fantasy.db')
    import sys
    app = QtWidgets.QApplication(sys.argv)
    MainWindow = QtWidgets.QMainWindow()
    ui = Ui_MainWindow()
    ui.setupUi(MainWindow)
    MainWindow.show()
    sys.exit(app.exec_())