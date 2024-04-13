/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphicFPTStudent;

import manage.fpt.student.FPTStudent;
import manage.fpt.student.DataBase;
import javax.swing.*;
import java.util.List;
/**
 *
 * @author admin
 */

public class studentListMenu extends JDialog{

    public studentListMenu(mainMenu aThis) {
        showStudentList();
    }
    public static void showStudentList() {
        
        JFrame cmd = new JFrame("List FPT Student");
        cmd.setSize(1000, 600);
        cmd.setLocationRelativeTo(null);
        
        List<FPTStudent> FPTstudents = DataBase.loadFPTStudents();
        String[] columnNames = {"ID", "Name", "Gender", "Date of Birth", "Address", "GPA"};
        
        Object[][] data = new Object[FPTstudents.size()][6];
        for (int i = 0; i < FPTstudents.size(); i++) {
            FPTStudent FPTstudent = FPTstudents.get(i);
            data[i][0] = FPTstudent.getID();
            data[i][1] = FPTstudent.getName();
            data[i][2] = FPTstudent.getGender();
            data[i][3] = FPTstudent.getDateOfBirth();
            data[i][4] = FPTstudent.getAddress();
            data[i][5] = FPTstudent.getGPA();
        }
        JTable table = new JTable(data, columnNames);    
        JScrollPane scrollPane = new JScrollPane(table);
        cmd.add(scrollPane);
        
        cmd.setVisible(true);
    }
    
}
