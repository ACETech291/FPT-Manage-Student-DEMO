/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic.manage.fpt.student;

import graphicFPTStudent.studentFindMenu;
import java.awt.Frame;
import java.util.List;
import javax.swing.JOptionPane;
import manage.fpt.student.DataBase;
import manage.fpt.student.FPTStudent;
/**
 *
 * @author admin
 */
public class findStudent extends studentFindMenu{
    public findStudent(Frame parent){
        super(parent);
    }
    
    public static void findStudent(studentFindMenu studentFindMenu) {
        String ID = studentFindMenu.getTxtID().getText().trim();
        List<FPTStudent> FPTStudent = DataBase.loadFPTStudents();
        
        for (FPTStudent FPTstudent : FPTStudent) {
            if (FPTstudent.getID().equals(ID)) {
                JOptionPane.showMessageDialog(null, "Found student:\n" +
                    "MSSV: " + FPTstudent.getID() + "\n" +
                    "Name: " + FPTstudent.getName() + "\n" +
                    "Gender: " + FPTstudent.getGender()+ "\n" +
                    "Date of Birth: " + FPTstudent.getDateOfBirth()+ "\n"+
                    "Address: " + FPTstudent.getAddress() + "\n"+
                    "GPA: " + FPTstudent.getGPA()+ "\n");
                    return;
                }
            }
            JOptionPane.showMessageDialog(null, "No student found with ID: " + ID);
    }
}
