/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphicFPTStudent;

import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import logic.manage.fpt.student.findUpdateStudent;

/**
 *
 * @author admin
 */
public class studentFindUpdateMenu extends JDialog{
    private JTextField txtID;
 

    public studentFindUpdateMenu(Frame parent) {
        super(parent, "Update student", true);
        setupUI();
        pack();
        setLocationRelativeTo(parent);
    }
    
    public JTextField getTxtID() {
        return txtID;
    }

    private void setupUI() {
        setLayout(new GridLayout(2, 2, 10, 10));

        add(new JLabel("ID:"));
        txtID = new JTextField();
        add(txtID);

        JButton btnDelete = new JButton("Find");
        btnDelete.addActionListener(e -> findUpdateStudent.findUpdateStudent(this));
        add(btnDelete);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(e -> dispose());
        add(btnCancel);
    }
}