/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author 2dam
 */
public class SwingViewImplementation implements View{
    @Override
    public void showGreeting(String greeting) {
        JFrame jFrame= new JFrame();
        JOptionPane.showMessageDialog(jFrame,greeting);
        jFrame.dispose();
    }
    
  
}
