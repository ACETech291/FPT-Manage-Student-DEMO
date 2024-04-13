/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphicFPTStudent;

import javax.swing.*;
import java.awt.*;
import logic.manage.fpt.student.addStudent;

/**
 *
 * @author admin
 */

public class studentAddMenu extends JDialog {
    private JTextField txtID;
    private JTextField txtName;
    private JComboBox<String> cbGender;
    private JTextField txtBirthday;
    private JTextField txtAddress;
    private JTextField txtGPA;

    public studentAddMenu(Frame parent) {
        super(parent, "Add student", true);
        setupUI();
        pack();
        setLocationRelativeTo(parent); 
    }

    public JTextField getTxtID() {
        return txtID;
    }

    public JTextField getTxtName() {
        return txtName;
    }

    public JComboBox<String> getCbGender() {
        return cbGender;
    }

    public JTextField getTxtBirthday() {
        return txtBirthday;
    }

    public JTextField getTxtAddress() {
        return txtAddress;
    }

    public JTextField getTxtGPA() {
        return txtGPA;
    }
    
    

    private void setupUI() {
        
        setLayout(new GridLayout(7, 2, 10, 10));
        
        add(new JLabel("ID:"));
        txtID = new JTextField();
        add(txtID);

        add(new JLabel("Name:"));
        txtName = new JTextField();
        add(txtName);

        add(new JLabel("Gender:"));
        cbGender = new JComboBox<>(new String[] {"Male", "Female", "Another"});
        add(cbGender);

        add(new JLabel("Date of birth:"));
        txtBirthday = new JTextField();
        add(txtBirthday);
        
        add(new JLabel("Address:"));
        txtAddress = new JTextField();
        add(txtAddress);
        
        add(new JLabel("GPA:"));
        txtGPA = new JTextField();
        add(txtGPA);

        JButton btnSave = new JButton("Save");
        btnSave.addActionListener(e -> addStudent.addStudent(this));
        add(btnSave);

        JButton btnCancel = new JButton("Exit");
        btnCancel.addActionListener(e -> dispose());
        add(btnCancel); 
    }
}
