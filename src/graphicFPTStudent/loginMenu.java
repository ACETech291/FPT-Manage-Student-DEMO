/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphicFPTStudent;

import java.awt.FlowLayout;
import javax.swing.*;
import manage.fpt.student.main;
/**
 *
 * @author admin
 */
public class loginMenu  extends JFrame{
    private JTextField txtUsername;
    private JPasswordField txtPassword;

    public loginMenu() {
        graphicMenu();
    }
    
    public String getUsername() {
        return txtUsername.getText();
    }

    public String getPassword() {
        return new String(txtPassword.getPassword());
    }
    
    private void graphicMenu() {
        setTitle("Welcome");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JPanel userPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel lblUsername = new JLabel("User:          ");
        txtUsername = new JTextField(20);
        userPanel.add(lblUsername);
        userPanel.add(txtUsername);

        JPanel passPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel lblPassword = new JLabel("Password:");
        txtPassword = new JPasswordField(20);
        passPanel.add(lblPassword);
        passPanel.add(txtPassword);

        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton btnLogin = new JButton("Login");
        
        btnLogin.addActionListener(e -> main.checkLogin(this));
        
        btnPanel.add(btnLogin);
        panel.add(userPanel);
        panel.add(passPanel);
        panel.add(btnPanel);
        add(panel);
    }
}