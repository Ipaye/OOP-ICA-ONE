package oop.ica.student.marks.part1;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author steven
 */
public class Module {

    /*
    TODO: What data do we need to store in each module instance?
     */
 /*
    TODO: Use a collection to link a module instance to many student instance
     */
    private String moduleTitle;
    private String moduleDescription;
    private String moduleCode;
    ArrayList<Student> students = new ArrayList<>();

    public Module(String code, String title, String description) {
        // TODO
        this.moduleTitle = title;
        this.moduleCode = code;
        this.moduleDescription = description;
    }

    public String getCode() {
        // TODO
        return moduleCode;
    }

    public String getTitle() {

        // TODO
        return moduleTitle;
    }

    public String getDescription() {
        // TODO
        return moduleDescription;
    }

    public List<Student> getStudents() {
        // TODO
        return students;
    }

    public void addStudent(Student student) {
        // TODO
        students.add(student);
    }

    public long failCount() {
        // TODO
        int count = 0;
        for (int i = 0; i < students.size(); i++) {
            int mark = students.get(i).getModuleMark(moduleCode);
            if (mark < 40) {
                count += 1;
            }
        }
        return count;
    }

    public long passCount() {
        // TODO
        int count = 0;
        for (int i = 0; i < students.size(); i++) {
            int mark = students.get(i).getModuleMark(moduleCode);
            if (mark > 39) {
                count += 1;
            }
        }
        return count;
    }
}
