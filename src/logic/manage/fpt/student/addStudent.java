/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic.manage.fpt.student;

import graphicFPTStudent.studentAddMenu;
import java.awt.Frame;
import java.util.List;
import javax.swing.JOptionPane;
import manage.fpt.student.DataBase;
import manage.fpt.student.FPTStudent;
import java.text.SimpleDateFormat;
import java.text.ParseException;
/**
 *
 * @author admin
 */
public class addStudent extends studentAddMenu{
    
    public addStudent(Frame parent) {
        super(parent);
    }
    
    public static void addStudent(studentAddMenu studentAddMenu) {
        String ID = studentAddMenu.getTxtID().getText().trim();
        String name = studentAddMenu.getTxtName().getText().trim();
        String gender = (String) studentAddMenu.getCbGender().getSelectedItem();
        String dateOfBirth = studentAddMenu.getTxtBirthday().getText().trim();
        String address = studentAddMenu.getTxtAddress().getText().trim();
        String GPA = studentAddMenu.getTxtGPA().getText().trim();
        
        if(ID.isEmpty() || name.isEmpty() || gender.isEmpty() || dateOfBirth.isEmpty() || address.isEmpty() || GPA.isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter full information");
            return;
        }
        
        float gpa;
        try {
            gpa = Float.parseFloat(GPA);
            if(gpa < 0.0 || gpa >10.0){
                JOptionPane.showMessageDialog(null, "Invalid GPA format. Please enter a number between 0.0 and 10.0");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid GPA format. Please enter a number between 0.0 and 10.0");
            return;
        }
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        sdf.setLenient(false);
        try {
            sdf.parse(dateOfBirth);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Enter the format DD/MM/YYYY");
            return;
        }
        
        List<FPTStudent> FPTStudents = DataBase.loadFPTStudents();
        boolean check = FPTStudents.stream().anyMatch(student -> student.getID().equals(ID));    
        if(check){
            JOptionPane.showMessageDialog(null, "ID is exist");
        }
        else{
            FPTStudent FPTStudent = new FPTStudent(ID, name, gender, dateOfBirth, address, GPA);
            FPTStudents.add(FPTStudent);
            DataBase.saveFPTStudents(FPTStudents);
            JOptionPane.showMessageDialog(studentAddMenu, "Successful");
        }
    }
    
}
