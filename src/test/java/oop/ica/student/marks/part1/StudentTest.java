/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package oop.ica.student.marks.part1;

import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author ipaye
 */
public class StudentTest {

    public StudentTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getFirstName method, of class Student.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Student instance = new Student("Alameen", "Ipaye", "S12345");
        String expResult = "Alameen";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLastName method, of class Student.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Student instance = new Student("Alameen", "Ipaye", "S12345");
        String expResult = "Ipaye";
        String result = instance.getLastName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNumber method, of class Student.
     */
    @Test
    public void testGetNumber() {
        System.out.println("getNumber");
        Student instance = new Student("Alameen", "Ipaye", "S12345");
        String expResult = "S12345";
        String result = instance.getNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFormalName method, of class Student.
     */
    @Test
    public void testGetFormalName() {
        System.out.println("getFormalName");
        Student instance = new Student("Alameen", "Ipaye", "S12345");
        String expResult = "Ipaye, A.";
        String result = instance.getFormalName();
        assertEquals(expResult, result);

    }

    /**
     * Test of getModuleMark method, of class Student.
     */
    @Test
    @Ignore
    public void testGetModuleMark() {
        System.out.println("getModuleMark");
        String code = "";
        Student instance = null;
        int expResult = 0;
        int result = instance.getModuleMark(code);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModuleMarks method, of class Student.
     */
    @Test
    @Ignore
    public void testGetModuleMarks() {
        System.out.println("getModuleMarks");
        Student instance = null;
        Map<Module, Integer> expResult = null;
        Map<Module, Integer> result = instance.getModuleMarks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addModule method, of class Student.
     */
    @Test
    @Ignore
    public void testAddModule() {
        System.out.println("addModule");
        Module module = null;
        Student instance = null;
        instance.addModule(module);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addModuleMark method, of class Student.
     */
    @Test
    @Ignore
    public void testAddModuleMark() {
        System.out.println("addModuleMark");
        String moduleCode = "";
        int mark = 0;
        Student instance = null;
        instance.addModuleMark(moduleCode, mark);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isStudying method, of class Student.
     */
    @Test
    @Ignore
    public void testIsStudying() {
        System.out.println("isStudying");
        String moduleCode = "";
        Student instance = null;
        boolean expResult = false;
        boolean result = instance.isStudying(moduleCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moduleResults method, of class Student.
     */
    @Test
    @Ignore
    public void testModuleResults() {
        System.out.println("moduleResults");
        Student instance = null;
        String expResult = "";
        String result = instance.moduleResults();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
