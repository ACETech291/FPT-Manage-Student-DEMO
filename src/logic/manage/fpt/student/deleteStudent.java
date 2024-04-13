/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic.manage.fpt.student;

import graphicFPTStudent.studentDeleteMenu;
import java.awt.Frame;
import java.util.List;
import javax.swing.JOptionPane;
import manage.fpt.student.DataBase;
import manage.fpt.student.FPTStudent;

/**
 *
 * @author admin
 */
public class deleteStudent extends studentDeleteMenu{
    
    public deleteStudent(Frame parent) {
        super(parent);
    }
    
    public static void deleteStudent(studentDeleteMenu studentDeleteMenu) {
            
        String ID = studentDeleteMenu.getTxtID().getText().trim();
        List<FPTStudent> FPTStudent = DataBase.loadFPTStudents();
        boolean check = FPTStudent.removeIf(student -> student.getID().equals(ID));
        
        if(check){
            DataBase.saveFPTStudents(FPTStudent);
            JOptionPane.showMessageDialog(null, "Successful");
        }
        else{
            JOptionPane.showMessageDialog(null, "ID is not exist");
        }
    }
}
