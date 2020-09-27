/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trailer.system;

import java.awt.Dimension;
import java.awt.Toolkit;
import static java.time.Clock.system;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author Amuh
 */
public class Main {
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                    
                } catch (Exception e) {
                }
       }
        });
        try
        {
            SplashScreen splash = new SplashScreen();
           
            
            //splash.setSize(450,345);
            splash.setVisible(true);
            Thread.sleep(5000);
            //splash.setLocationRelativeTo(null);
            splash.dispose();
            TrailerView mygui = new TrailerView();
            //mygui.setLocationRelativeTo(null);
            mygui.setVisible(true);
            mygui.setLocationRelativeTo(null);
        }
        catch(InterruptedException e){}
        
        
    }
    
}
