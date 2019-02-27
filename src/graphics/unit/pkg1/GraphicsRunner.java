/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics.unit.pkg1;

import javax.swing.JFrame;


/**
 *
 * @author hoffmani0286
 */
public class GraphicsRunner extends JFrame {

    /**
     * @param args the command line arguments
     */
    
    private static final int WIDTH = 640;
    private static final int HEIGHT = 480;
    
    public GraphicsRunner(){
        setSize(WIDTH,HEIGHT);
        //getContentPane().add(new SmileyFace());
        getContentPane().add(new BigHouse());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        GraphicsRunner run = new GraphicsRunner();
    }
    
}
