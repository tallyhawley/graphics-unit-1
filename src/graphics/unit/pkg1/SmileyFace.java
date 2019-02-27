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
public class SmileyFace extends Canvas{
    
    public SmileyFace(){
        
    }
    
    public void paint(Graphics window){
        window.clearRect(640, 480, 0, 0);
        
        //face
        window.setColor(Color.YELLOW);
        window.fillOval(200,100, 250,250);
        
        //eyes
        window.setColor(Color.BLACK);
        window.fillOval(275,175,25,25);
        window.fillOval(350,175,25,25);
        
        //mouth
        window.drawArc(275,250,100,25,180,180);
    }
}
