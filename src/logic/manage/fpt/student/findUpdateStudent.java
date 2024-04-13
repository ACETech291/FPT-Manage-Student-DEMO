/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic.manage.fpt.student;

import graphicFPTStudent.studentFindUpdateMenu;
import graphicFPTStudent.studentUpdateMenu;
import java.awt.Frame;
import java.util.List;
import javax.swing.JOptionPane;
import manage.fpt.student.DataBase;
import manage.fpt.student.FPTStudent;

/**
 *
 * @author admin
 */
public class findUpdateStudent extends studentFindUpdateMenu{
    
    public findUpdateStudent(Frame parent){
        super(parent);
    }
    
    public static void findUpdateStudent(studentFindUpdateMenu studentFindUpdateMenu) {
        String ID = studentFindUpdateMenu.getTxtID().getText().trim();
        List<FPTStudent> FPTStudent = DataBase.loadFPTStudents();
        
        boolean check = false;
        
        for (FPTStudent FPTstudent : FPTStudent) {
            if (FPTstudent.getID().equals(ID)) {
                studentFindUpdateMenu.setVisible(false);
                new studentUpdateMenu((Frame) studentFindUpdateMenu.getParent(), ID, FPTstudent.getName(),FPTstudent.getGender(), FPTstudent.getDateOfBirth(), FPTstudent.getAddress(),FPTstudent.getGPA()).setVisible(true);
                check = true;
                break;
            }
        }
        
        if(!check){
            JOptionPane.showMessageDialog(null, "No student found with ID: " + ID);
        }
    }
}

