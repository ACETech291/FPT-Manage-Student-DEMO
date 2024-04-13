/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphicFPTStudent;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class informationMenu extends JDialog{
    
    public informationMenu(mainMenu aThis) {
        informationMenu();
    }
    
    private void informationMenu() {
        
        JOptionPane.showMessageDialog(null, "This is my first application using Java\n\n" +
                                                         "Completed in Mar 17th, 2024\n"+
                                                         "If you have contributed please\n" +                                         
                                                         "Contact me at:\n" +
                                                         "Email: hiepnhhe181338@fpt.edu.vn"
                                                        , "About Us", JOptionPane.PLAIN_MESSAGE);
    }
}
