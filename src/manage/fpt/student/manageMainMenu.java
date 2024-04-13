/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manage.fpt.student;

import graphicFPTStudent.mainMenu;
import graphicFPTStudent.studentAddMenu;
import graphicFPTStudent.studentListMenu;
import graphicFPTStudent.studentDeleteMenu;
import graphicFPTStudent.studentFindMenu;
import graphicFPTStudent.studentFindUpdateMenu;
import graphicFPTStudent.informationMenu;
/**
 *
 * @author admin
 */
public class manageMainMenu extends mainMenu{
    
    public static void openShowStudent(mainMenu aThis){
        studentListMenu studentListMenu = new studentListMenu(aThis);
        studentListMenu.setVisible(false);
    }
    
    public static void openAddStudent(mainMenu aThis) {
        studentAddMenu studentAddMenu = new studentAddMenu(aThis);
        studentAddMenu.setVisible(true);
    }
    
    public static void openDeleteStudent(mainMenu aThis) {
        studentDeleteMenu studentDeleteMenu = new studentDeleteMenu(aThis);
        studentDeleteMenu.setVisible(true);
    }
    
    public static void openUpdateStudent(mainMenu aThis) {
        studentFindUpdateMenu studentFindUpdateMenu = new studentFindUpdateMenu(aThis);
        studentFindUpdateMenu.setVisible(true);
    }
    
    public static void openFindStudent(mainMenu aThis) {
        studentFindMenu studentFindMenu = new studentFindMenu(aThis);
        studentFindMenu.setVisible(true);
    }
    
    public static void openInformation(mainMenu aThis) {
       informationMenu informationMenu = new informationMenu(aThis);
       informationMenu.setVisible(false);
    }
}
