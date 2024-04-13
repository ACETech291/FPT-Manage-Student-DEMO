/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manage.fpt.student;

import graphicFPTStudent.loginMenu;
import graphicFPTStudent.mainMenu;
import javax.swing.*;

/**
 *
 * @author admin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        loginMenu loginMenu = new loginMenu();
        loginMenu.setVisible(true);
        
    }    
        
    
    public static void checkLogin(loginMenu loginMenu) {
        String username = loginMenu.getUsername();
        String password = loginMenu.getPassword();
        
        
        if(username.equals("admin") && password.equals("123")){
            
            loginMenu.setVisible(false);
            new mainMenu().setVisible(true);
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Incorrect username or password");
        }
    }
}