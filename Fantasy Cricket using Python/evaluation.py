# -*- coding: utf-8 -*-

# Form implementation generated from reading ui file 'evaluation.ui'
#
# Created by: PyQt5 UI code generator 5.13.2
#
# WARNING! All changes made in this file will be lost!


from PyQt5 import QtCore, QtGui, QtWidgets
from PyQt5.QtWidgets import QMessageBox


class Ui_Evaluation(object):
    def setupUi(self, Evaluation):
        "User Interface Code"
        Evaluation.setObjectName("Evaluation")
        Evaluation.resize(501, 447)
        self.Heading = QtWidgets.QLabel(Evaluation)
        self.Heading.setGeometry(QtCore.QRect(90, 20, 331, 21))
        font = QtGui.QFont()
        font.setFamily("Comic Sans MS")
        font.setPointSize(10)
        font.setBold(True)
        font.setWeight(75)
        
        self.Heading.setFont(font)
        self.Heading.setObjectName("Heading")
        self.TeamName = QtWidgets.QComboBox(Evaluation)
        self.TeamName.setGeometry(QtCore.QRect(70, 50, 131, 22))
        font = QtGui.QFont()
        font.setFamily("Comic Sans MS")
        font.setPointSize(10)
        font.setBold(True)
        font.setWeight(75)
        
        self.TeamName.setFont(font)
        self.TeamName.setEditable(True)
        self.TeamName.setObjectName("TeamName")
        self.MatchNumber = QtWidgets.QComboBox(Evaluation)
        self.MatchNumber.setGeometry(QtCore.QRect(290, 50, 131, 22))
        font = QtGui.QFont()
        font.setFamily("Comic Sans MS")
        font.setPointSize(10)
        font.setBold(True)
        font.setWeight(75)
        
        self.MatchNumber.setFont(font)
        self.MatchNumber.setEditable(True)
        self.MatchNumber.setObjectName("MatchNumber")
        self.line = QtWidgets.QFrame(Evaluation)
        self.line.setGeometry(QtCore.QRect(30, 80, 441, 20))
        self.line.setFrameShape(QtWidgets.QFrame.HLine)
        self.line.setFrameShadow(QtWidgets.QFrame.Sunken)
        self.line.setObjectName("line")
        self.Players_Label = QtWidgets.QLabel(Evaluation)
        self.Players_Label.setGeometry(QtCore.QRect(70, 120, 81, 21))
        font = QtGui.QFont()
        font.setFamily("Comic Sans MS")
        font.setPointSize(10)
        font.setBold(True)
        font.setWeight(75)
        
        self.Players_Label.setFont(font)
        self.Players_Label.setObjectName("Players_Label")
        self.Points_Label = QtWidgets.QLabel(Evaluation)
        self.Points_Label.setGeometry(QtCore.QRect(280, 120, 51, 21))
        font = QtGui.QFont()
        font.setFamily("Comic Sans MS")
        font.setPointSize(10)
        font.setBold(True)
        font.setWeight(75)
        
        self.Points_Label.setFont(font)
        self.Points_Label.setObjectName("Points_Label")
        self.Score = QtWidgets.QLabel(Evaluation)
        self.Score.setGeometry(QtCore.QRect(330, 120, 51, 21))
        font = QtGui.QFont()
        font.setFamily("Comic Sans MS")
        font.setPointSize(10)
        font.setBold(True)
        font.setWeight(75)
        
        self.Score.setFont(font)
        self.Score.setStyleSheet("color: rgb(0, 170, 255);")
        self.Score.setObjectName("Score")
        self.Calculate = QtWidgets.QPushButton(Evaluation)
        self.Calculate.setGeometry(QtCore.QRect(194, 400, 121, 31))
        font = QtGui.QFont()
        font.setFamily("Comic Sans MS")
        font.setPointSize(10)
        font.setBold(True)
        font.setWeight(75)
        
        self.Calculate.setFont(font)
        self.Calculate.setObjectName("Calculate")
        self.Players = QtWidgets.QListWidget(Evaluation)
        self.Players.setGeometry(QtCore.QRect(70, 140, 171, 241))
        font = QtGui.QFont()
        font.setFamily("Comic Sans MS")
        font.setPointSize(10)
        
        self.Players.setFont(font)
        self.Players.setObjectName("Players")
        self.Points = QtWidgets.QListWidget(Evaluation)
        self.Points.setGeometry(QtCore.QRect(280, 140, 171, 241))
        font = QtGui.QFont()
        font.setFamily("Comic Sans MS")
        font.setPointSize(10)
        font.setBold(True)
        font.setWeight(75)
        
        self.Points.setFont(font)
        self.Points.setStyleSheet("color: rgb(0, 170, 255);")
        self.Points.setObjectName("Points")

        # Adding items in combo box
        self.TeamName.activated.connect(self.teamactivate)
        self.MatchNumber.activated.connect(self.matchactivate)
        self.additem()
        self.Calculate.clicked.connect(self.calculate)
    
        self.retranslateUi(Evaluation)
        QtCore.QMetaObject.connectSlotsByName(Evaluation)


    def retranslateUi(self, Evaluation):
        "Setting the value of Widgets"
        _translate = QtCore.QCoreApplication.translate
        Evaluation.setWindowTitle(_translate("Evaluation", "Evaluation Dialog"))
        self.Heading.setText(_translate("Evaluation", "Evaluate the Performance of your Fantasy Team"))
        self.TeamName.setCurrentText(_translate("Evaluation", "Select Team"))
        self.MatchNumber.setCurrentText(_translate("Evaluation", "Select Match"))
        self.Players_Label.setText(_translate("Evaluation", "Players"))
        self.Points_Label.setText(_translate("Evaluation", "Points"))
        self.Score.setText(_translate("Evaluation", "###"))
        self.Calculate.setText(_translate("Evaluation", "Calculate Score"))
        
        
    def additem(self):
        "Adding item to the combo boxes"
        import sqlite3
        conn = sqlite3.connect('fantasy.db')
        
        sql="Select name from teams;"
        cur = conn.execute(sql)
        names = cur.fetchall()
        for name in names:
            self.TeamName.addItem(name[0])
        
        for i in range(5):
            match = "Match "+str((i+1))
            self.MatchNumber.addItem(match)
    
        
    def teamactivate(self):
        "team name combo box is not editable"
        self.TeamName.setEditable(False)
    
    
    def matchactivate(self):
        "Match number combo box is not editable"
        self.MatchNumber.setEditable(False)
       
        
    def calculate(self):
        "Calculating the score of a team"
        import sqlite3
        conn = sqlite3.connect('fantasy.db')
        
        team=self.TeamName.currentText()
        if team=="Select Team":
            self.showmessage("You need to Select a Team.")
            return
        if self.MatchNumber.currentText()=="Select Match":
            self.showmessage("You need to Select a Match.")
            return
        
        self.Players.clear()
        self.Points.clear()
        sql1="select players, value from teams where name='"+team+"'"
        cur=conn.execute(sql1)
        row=cur.fetchone()
        
        selected=row[0].split(',')
        selected.remove('') 
        
        self.Players.addItems(selected)
        teamttl=0
        
        for i in range(self.Players.count()):
            # Calculating score of all players in a team
            ttl, batscore, bowlscore, fieldscore=0,0,0,0
            
            nm=self.Players.item(i).text()
            cursor=conn.execute("select * from match,stats where player_name='"+nm+"' and match.PlayerID = stats.PlayerID")
            row=cursor.fetchone()
            
            # Calculating batting score
            batscore=int(row[1]/2)
            if row[1]>=50: batscore+=5
            if row[1]>=100: batscore+=10
            if row[1]>0:
                sr=(row[1]/row[2])*100
                if sr>=80 and sr<=100: batscore+=2
                if sr>100:batscore+=4
            batscore=batscore+row[3]
            batscore=batscore+2*row[4]
            
            # Calculating bowling score
            bowlscore=row[8]*10
            if row[8]>=3: bowlscore=bowlscore+5
            if row[8]>=5: bowlscore=bowlscore+10
            if row[8]>0:
                er=row[7]/(row[5]/6)
                if er<2: bowlscore=bowlscore+10
                if er>=2 and er<=3.5: bowlscore=bowlscore+7
                if er>3.5 and er<=4.5: bowlscore=bowlscore+4
            
            # Calculating fielding score
            fieldscore=(row[9]+row[10]+row[11])*10            
            
            ttl=batscore+bowlscore+fieldscore
            self.Points.addItem(str(ttl))
            
            teamttl=teamttl+ttl
            
        self.Score.setText(str(teamttl))
        
        
    def showmessage(self,msg):
        "Showing a message using Dialog Box"
        Dialog=QtWidgets.QMessageBox()
        Dialog.setIcon(QMessageBox.Critical)
        Dialog.setText(msg)
        Dialog.setWindowTitle("Fantasy Game")
        Dialog.exec()
        
        
"""
# Running the dialog using main function
if __name__ == "__main__":
    
    import sys
    app = QtWidgets.QApplication(sys.argv)
    Dialog = QtWidgets.QDialog()
    ui = Ui_Evaluation()
    ui.setupUi(Dialog)
    Dialog.show()
    sys.exit(app.exec_())
"""