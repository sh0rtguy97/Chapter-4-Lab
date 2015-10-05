// Lab04Bst.java
// The Expo Graphics Program
// This is the student, starting version, of Lab 04B.


import java.awt.*;
import java.applet.*;


public class Lab04Bst extends Applet
{

    public void paint(Graphics g)
    {
        // DRAW CUBE
        Expo.drawRectangle(g,25,25,225,225);
        Expo.drawRectangle(g,75,75,275,275);
        Expo.drawLine(g,25,25,75,75);
        Expo.drawLine(g,25,225,75,275);
        Expo.drawLine(g,225,25,275,75);
        Expo.drawLine(g,225,225,275,275);
        // DRAW TARGET
        Expo.drawCircle(g,450,150,20);
        Expo.drawCircle(g,450,150,40);
        Expo.drawCircle(g,450,150,60);
        Expo.drawCircle(g,450,150,80);
        Expo.drawCircle(g,450,150,100);
        // DRAW TRIANGLE
        Expo.drawLine(g,460,500,560,500);
        Expo.drawLine(g,460,500,510,350);
        Expo.drawLine(g,560,500,510,350);
        Expo.drawLine(g,510,500,510,350);
        Expo.drawLine(g,460,500,535,425);
        Expo.drawLine(g,560,500,485,425);
        // DRAW SMILEY FACE
        Expo.drawOval(g,300,450,100,150);
        Expo.drawCircle(g,260,375,25);
        Expo.drawCircle(g,340,375,25);
        Expo.drawPoint(g,260,375);
        Expo.drawPoint(g,340,375);
        Expo.drawArc(g,300,450,75,100,90,270);
        Expo.drawArc(g,260,360,25,25,270,90);
        Expo.drawArc(g,340,360,25,25,270,90);
        // DRAW JPII
        Expo.drawLine(g,50,750,125,750);//bottom of J
        Expo.drawLine(g,50,750,50,700);
        Expo.drawLine(g,50,700,75,700);
        Expo.drawLine(g,75,700,75,725);
        Expo.drawLine(g,75,725,100,725);
        Expo.drawLine(g,100,725,100,650);
        Expo.drawLine(g,100,650,125,650);
        Expo.drawLine(g,125,650,125,750); //finish the J
        Expo.drawLine(g,150,750,175,750); //start of P
        Expo.drawLine(g,175,750,225,650);
        Expo.drawLine(g,225,650,300,650);
        Expo.drawLine(g,300,650,300,725);
        Expo.drawLine(g,300,725,250,725);
        Expo.drawLine(g,250,725,250,750);
        
        






    }

}


