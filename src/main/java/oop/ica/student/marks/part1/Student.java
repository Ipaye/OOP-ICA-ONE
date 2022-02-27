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

    /*
     * TODO: include the data that defines a student
     */
    final int ID;
    private String firstName;
    private String lastName;

    /*
     * TODO: a collection to keep track of the modules that the student is enrolled
     * on
     */

    /*
     * TODO: a collection to keep track of the students module marks
     */

    public Student(int ID, String firstName, String lastName) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        // TODO
        return this.firstName;
    }

    public String getLastName() {
        // TODO
        return this.lastName;
    }

    public String getNumber() {
        // TODO
    }

    public String getFormalName() {
        // TODO
    }

    public int getModuleMark(String code) {
        // TODO
    }

    public Map<Module, Integer> getModuleMarks() {
        // TODO
    }

    public void addModule(Module module) {
        // TODO
    }

    public void addModuleMark(String moduleCode, int mark) {
        // TODO
    }

    public boolean isStudying(String moduleCode) {
        // TODO
    }

    public String moduleResults() {
        // TODO - Build a string that is a summary of all the marks
    }

    private static String markToLetterGrade(int mark) {
        // TODO
    }
}
