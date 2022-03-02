/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.ica.student.marks.part1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author steven
 */
public class Main {
    public static void main(String[] args) {
        Module module1 = new Module("ENG2041-N", "Differential Equations and Numerical Methods",
                "Module Description...");
        Module module2 = new Module("EAC4027-N", "Renewable Energy Conversion Systems", "Module Description...");
        Module module3 = new Module("GAV2023-N", "Network and Multiplayer Gaming", "Module Desciption...");
        Module module4 = new Module("MMD3058-N", "Project (BEng Tech)", "Module Description...");
        Module module5 = new Module("CIS1007-N", "Information Security and Cybercrime", "Module Desciption...");

        List<Student> students = Arrays.asList(
                new Student("Jackie", "Barker", "S1000001"),
                new Student("Steven", "Mead", "S1000002"));

        // add Jackie to her modules
        Student student;

        student = students.get(0);

        module1.addStudent(student);
        module2.addStudent(student);
        module3.addStudent(student);

        student.addModule(module1);
        student.addModule(module2);
        student.addModule(module3);

        // add Steven to his modules

        module1.addStudent(students.get(1));
        module4.addStudent(students.get(1));
        module3.addStudent(students.get(1));

        student.addModule(module1);
        student.addModule(module4);
        student.addModule(module3);

        students.get(0).addModuleMark("ENG2041-N", 75);
        students.get(0).addModuleMark("EAC4027-N", 65);
        students.get(0).addModuleMark("GAV2023-N", 35);

        students.get(1).addModuleMark("ENG2041-N", 55);
        students.get(1).addModuleMark("MMD3058-N", 75);
        students.get(1).addModuleMark("GAV2023-N", 65);

        System.out.println("-----------------");
        System.out.println("Student Grades");
        System.out.println("-----------------");
        for (Student s : students) {
            System.out.println(String.format("%-12s %s", s.getFormalName(), s.moduleResults()));
        }

    }
}
