/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics.unit.pkg1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author hoffmani0286
 */

public class BigHouse extends Canvas {
    
    public BigHouse(){}
    
    public void paint(Graphics window){
        window.clearRect(640, 480, 0, 0);
        
        //grass
        window.setColor(Color.GREEN);
        window.fillRect(0,380,640,100);
        
        //base
        window.setColor(Color.GRAY);
        window.fillRect(175,200,300,200);
        
        //roof
        int[] xPoints = {175, 325, 475};
        int[] yPoints = {200, 100, 200};
        window.setColor(Color.DARK_GRAY);
        window.fillPolygon(xPoints, yPoints, 3);
        
        //door
        window.setColor(Color.ORANGE);
        window.fillRect(305,325,40,75);
        window.setColor(Color.BLACK);
        window.fillOval(310,365,5,5);
        
        //windows
        window.setColor(Color.WHITE);
        window.fillRect(200, 300, 75, 50);
        window.fillRect(375, 300, 75, 50);
        
        //trees
        window.setColor(Color.ORANGE);
        window.fillRect(75, 300, 50, 100);
        window.setColor(Color.GREEN);
        window.fillOval(50,280, 50, 50);
        window.fillOval(35,265, 50, 50);
        window.fillOval(90,280, 50, 50);
        window.fillOval(110,265, 50, 50);
        window.fillOval(80,250, 60, 60);
        window.fillOval(55,235, 50, 50);
        window.fillOval(95,230, 50, 50);
        
        window.setColor(Color.ORANGE);
        window.fillRect(575-50, 300, 50, 100);
        window.setColor(Color.GREEN);
        window.fillOval(550-50,280, 50, 50);
        window.fillOval(535-50,265, 50, 50);
        window.fillOval(590-50,280, 50, 50);
        window.fillOval(610-50,265, 50, 50);
        window.fillOval(580-50,250, 60, 60);
        window.fillOval(555-50,235, 50, 50);
        window.fillOval(595-50,230, 50, 50);

    }

}
