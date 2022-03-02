/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package oop.ica.student.marks.part1;

import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Ignore;

/**
 *
 * @author ipaye
 */
public class ModuleTest {

    public ModuleTest() {
    }

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    /**
     * Test of getCode method, of class Module.
     */
    @org.junit.Test
    @Ignore
    public void testGetCode() {
        System.out.println("getCode");
        Module instance = null;
        String expResult = "";
        String result = instance.getCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getTitle method, of class Module.
     */
    @org.junit.Test
    @Ignore
    public void testGetTitle() {
        System.out.println("getTitle");
        Module instance = null;
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getDescription method, of class Module.
     */
    @org.junit.Test
    @Ignore
    public void testGetDescription() {
        System.out.println("getDescription");
        Module instance = null;
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getStudents method, of class Module.
     */
    @org.junit.Test
    @Ignore
    public void testGetStudents() {
        System.out.println("getStudents");
        Module instance = null;
        List<Student> expResult = null;
        List<Student> result = instance.getStudents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of addStudent method, of class Module.
     */
    @org.junit.Test
    @Ignore
    public void testAddStudent() {
        System.out.println("addStudent");
        Student student = null;
        Module instance = null;
        instance.addStudent(student);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of failCount method, of class Module.
     */
    @org.junit.Test
    @Ignore
    public void testFailCount() {
        System.out.println("failCount");
        Module instance = null;
        long expResult = 0L;
        long result = instance.failCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of passCount method, of class Module.
     */
    @org.junit.Test
    @Ignore
    public void testPassCount() {
        System.out.println("passCount");
        Module instance = null;
        long expResult = 0L;
        long result = instance.passCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

}
