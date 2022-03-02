package oop.ica.student.marks.part1;

import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author steven
 */
public class Student {

    final String ID;
    private String firstName;
    private String lastName;

    private Map<String, Module> enrolledModules = new HashMap<>();
    private Map<Module, Integer> moduleMarks = new HashMap<>();

    public Student(String ID, String firstName, String lastName) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getNumber() {
        return this.ID;
    }

    public String getFormalName() {
        return String.format("%s ,$s", this.lastName, this.firstName.toUpperCase().charAt(0));
    }

    public int getModuleMark(String code) {
        // get Module with the code
        Module studentModule = enrolledModules.get(code);
        return moduleMarks.get(studentModule);
    }

    public Map<Module, Integer> getModuleMarks() {
        return moduleMarks;
    }

    public void addModule(Module module) {
        if (!isStudying(module.getCode())) {
            enrolledModules.put(module.getCode(), module);
        }
    }

    public void addModuleMark(String moduleCode, int mark) {
        if (isStudying(moduleCode) == true) {
            // Get the module in Question
            Module studentModule = enrolledModules.get(moduleCode);

            // Add the module to the Module mark object
            moduleMarks.put(studentModule, mark);
        }
    }

    public boolean isStudying(String moduleCode) {
        return enrolledModules.containsKey(moduleCode);
    }

    public String moduleResults(P) {
        // TODO - Build a string that is a summary of all the marks
        StringBuilder sb = new StringBuilder("");

        for (Module module : moduleMarks.keySet()) {
            String studentGrade = String.format("%s : %s", module.getCode(),
                    markToLetterGrade(moduleMarks.get(module)));
            sb.append(studentGrade);
        }

        return sb.toString();
    }

    private static String markToLetterGrade(int mark) {
        // TODO   
        if (mark > 0 || mark <= 39) {
            return "Fail";
        } else if (mark > 40 || mark <= 49) {
            return "D";
        } else if (mark > 50 || mark <= 59) {
            return "C";
        } else if (mark > 60 || mark <= 69) {
            return "B";
        } else if (mark > 70 || mark <= 79) {
            return "A";
        } else if (mark > 80 || mark <= 89) {
            return "A*";
        } else  (mark > 90 || mark <= 100) {
            return "A**";
        }
    }

}
