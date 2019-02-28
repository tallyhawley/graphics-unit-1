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
public class Robot extends Canvas{
    
    public Robot(){}
    
    public void paint(Graphics window){
        window.clearRect(640, 480, 0, 0);
        head(window,300,75);
        bodySegment(window, 290,160,Color.MAGENTA);
        window.setColor(Color.BLACK);
        window.drawLine(290, 160, 220, 220);
        window.drawLine(390, 160, 460, 220);
        bodySegment(window,290,240,Color.BLUE);
        window.setColor(Color.BLACK);
        window.drawLine(290,315,260,400);
        window.drawLine(390,315,420,400);
        
    }
    
    private void bodySegment(Graphics window, int x, int y, Color color){
        window.setColor(color);
        window.fillRect(x,y,100,75);
    }
    
    private void head(Graphics window, int x, int y){
        window.setColor(Color.YELLOW);
        window.fillOval(x, y, 75, 75);
        window.setColor(Color.BLACK);
        window.fillOval(x+20,y+25, 10,10);
        window.fillOval(x+45,y+25, 10,10);
        window.drawArc(x+25, y+50, 25, 10, 185, 170);
        window.drawArc(x+33,y+40,10,5,180,180);
    }
    
}
