/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic.manage.fpt.student;

import graphicFPTStudent.studentUpdateMenu;
import java.awt.Frame;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import manage.fpt.student.DataBase;
import manage.fpt.student.FPTStudent;

/**
 *
 * @author admin
 */
public class updateStudent extends studentUpdateMenu{
    
    public updateStudent(Frame parent, String studendID, String studentName, String studentGender, String studentDateOfBirth, String studentAddress, String studentGPA) {
        super(parent, studendID, studentName, studentGender, studentDateOfBirth,studentAddress,studentGPA);
    }
    
    public static void updateStudent(studentUpdateMenu studentUpdateMenu) {
        String ID = studentUpdateMenu.getTxtID().getText().trim();
        String name = studentUpdateMenu.getTxtName().getText().trim();
        String gender = (String) studentUpdateMenu.getCbGender().getSelectedItem();
        String dateOfBirth = studentUpdateMenu.getTxtBirthday().getText().trim();
        String address = studentUpdateMenu.getTxtAddress().getText().trim();
        String GPA = studentUpdateMenu.getTxtGPA().getText().trim();
        
        List<FPTStudent> FPTStudents = DataBase.loadFPTStudents();
        FPTStudent studentToUpdate = FPTStudents.stream().filter(s -> s.getID().equals(ID)).findFirst().orElse(null);
        
        if(studentToUpdate != null){
            if(!name.isEmpty()){
                studentToUpdate.setName(name);
            }
            if(gender != null){
                studentToUpdate.setGender(gender);
            }
            if(!dateOfBirth.isEmpty()){
                studentToUpdate.setDateOfBirth(dateOfBirth);
            }
            else{
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
                sdf.setLenient(false);
                try {
                    sdf.parse(dateOfBirth);
                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(null, "Enter the format DD/MM/YYYY");
                return;
                }
            }
            if(!address.isEmpty()){
                studentToUpdate.setAddress(address);
            }
            if(!GPA.isEmpty()){
                studentToUpdate.setGPA(GPA);
            }
            else{
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
            }
            
            
            DataBase.saveFPTStudents(FPTStudents);
            JOptionPane.showMessageDialog(studentUpdateMenu, "Successful");
        }
    }
}

