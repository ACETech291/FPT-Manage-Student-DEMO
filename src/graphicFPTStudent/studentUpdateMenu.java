/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphicFPTStudent;

import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import logic.manage.fpt.student.updateStudent;

/**
 *
 * @author admin
 */
public class studentUpdateMenu extends JDialog{
    private JTextField txtID;
    private JTextField txtName;
    private JComboBox<String> cbGender;
    private JTextField txtBirthday;
    private JTextField txtAddress;
    private JTextField txtGPA;

    public studentUpdateMenu(Frame parent, String studentID, String studentName, String studentGender, String studentDateOfBirth, String studentAddress, String studentGPA) {
        super(parent, "Update student", true);
        setupUI(studentID, studentName, studentGender,studentDateOfBirth,studentAddress,studentGPA);
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


    private void setupUI(String studentID, String studentName, String studentGender, String studentDateOfBirth, String studentAddress, String studentGPA) {
        
        setLayout(new GridLayout(7, 2, 10, 10));
        
        add(new JLabel("ID:"));
        txtID = new JTextField(studentID);
        txtID.setEditable(false);
        add(txtID);

        add(new JLabel("Name:"));
        txtName = new JTextField(studentName);
        add(txtName);

        add(new JLabel("Gender:"));
        cbGender = new JComboBox<>(new String[] {studentGender,"Male", "Female", "Another"});
        add(cbGender);

        add(new JLabel("Date of birth:"));
        txtBirthday = new JTextField(studentDateOfBirth);
        add(txtBirthday);
        
        add(new JLabel("Address:"));
        txtAddress = new JTextField(studentAddress);
        add(txtAddress);
        
        add(new JLabel("GPA:"));
        txtGPA = new JTextField(studentGPA);
        add(txtGPA);

        JButton btnSave = new JButton("Save");
        btnSave.addActionListener(e -> updateStudent.updateStudent(this));
        add(btnSave);

        JButton btnCancel = new JButton("Exit");
        btnCancel.addActionListener(e -> dispose());
        add(btnCancel); 
    }
}
