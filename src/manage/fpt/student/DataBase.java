/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manage.fpt.student;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class DataBase {
    private static final String FILE_NAME = "FPTstudents.dat";

    public static void saveFPTStudents(List<FPTStudent> FPTStudents) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (FPTStudent FPTStudent : FPTStudents) {
                writer.write(FPTStudent.getID() + "," + FPTStudent.getName() + "," + FPTStudent.getGender() + "," + FPTStudent.getDateOfBirth() + "," + FPTStudent.getAddress() + "," + FPTStudent.getGPA());
                writer.newLine();
            }
        } catch (IOException e) {
        }
    }

    public static List<FPTStudent> loadFPTStudents() {
        List<FPTStudent> FPTStudents = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                FPTStudents.add(new FPTStudent(data[0], data[1], data[2], data[3], data[4], data[5]));
            }
        } catch (IOException e) {
        }
        return FPTStudents;
    }
            
   
}
