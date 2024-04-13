/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphicFPTStudent;

import manage.fpt.student.manageMainMenu;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author admin
 */
public class mainMenu extends JFrame{

    public mainMenu() {
        
        setTitle("MANAGE FPT STUDENT");
        setSize(1000,700); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
        
        JLabel word = new JLabel("Welcome");
        word.setFont(new Font(null, Font.BOLD, 40));
        word.setForeground(Color.BLACK);
        word.setBounds(700, 20, 400, 400);
        add(word);
        
        JButton buttonShow = new JButton("Show student list");
        JButton buttonAdd = new JButton("Add student");
        JButton buttonDelete = new JButton("Delete student");
        JButton buttonUpdate = new JButton("Update student");
        JButton buttonFind = new  JButton("Find student");
        JButton buttonExit = new JButton("Exit");
        JButton buttonInfo = new JButton("About Us");
        
        buttonShow.setBounds(50, 50, 500, 50);
        buttonAdd.setBounds(50, 150, 500, 50);
        buttonDelete.setBounds(50,250, 500, 50);
        buttonUpdate.setBounds(50, 350, 500, 50);
        buttonFind.setBounds(50, 450, 500, 50);
        buttonExit.setBounds(850, 600, 100, 40);
        buttonInfo.setBounds(50, 600, 100, 40);
        
        add(buttonShow);
        add(buttonAdd);
        add(buttonDelete);
        add(buttonUpdate);
        add(buttonFind);
        add(buttonExit);
        add(buttonInfo);
        
        buttonShow.addActionListener(e -> manageMainMenu.openShowStudent(this));
        buttonAdd.addActionListener(e -> manageMainMenu.openAddStudent(this));
        buttonDelete.addActionListener(e -> manageMainMenu.openDeleteStudent(this));
        buttonUpdate.addActionListener(e -> manageMainMenu.openUpdateStudent(this));
        buttonFind.addActionListener(e -> manageMainMenu.openFindStudent(this));
        buttonExit.addActionListener(e -> System.exit(0));
        
        buttonInfo.addActionListener(e -> manageMainMenu.openInformation(this));
        
    }
}
