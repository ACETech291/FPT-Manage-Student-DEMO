/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphicFPTStudent;

import javax.swing.*;
import java.awt.*;
import logic.manage.fpt.student.deleteStudent;
/**
 *
 * @author admin
 */

public class studentDeleteMenu extends JDialog{
    private JTextField txtID;
 

    public studentDeleteMenu(Frame parent) {
        super(parent, "Delete student", true);
        setupUI();
        pack();
        setLocationRelativeTo(parent);
    }
    
    public JTextField getTxtID() {
        return txtID;
    }

    private void setupUI() {
        setLayout(new GridLayout(2, 2, 10, 10));

        add(new JLabel("MSSV:"));
        txtID = new JTextField();
        add(txtID);

        JButton btnDelete = new JButton("Delete");
        btnDelete.addActionListener(e -> deleteStudent.deleteStudent(this));
        add(btnDelete);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(e -> dispose());
        add(btnCancel);
    }
}
