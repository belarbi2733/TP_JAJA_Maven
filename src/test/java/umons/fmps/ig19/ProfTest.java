/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umons.fmps.ig19;

import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author noffa
 */
public class ProfTest {
    private String name;
        String firstname;
        String dateNaiss;
        String lieuNaiss;
    Prof prof;

    public ProfTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        prof = new Prof("prof1", "prof", "12/10/1989", "Mons"); 
    }
    
    @After
    public void tearDown() {
        prof = null;
    }

    /**
     * Test of getName method, of class Prof.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Prof instance = new Prof("prof1", "prof", "12/10/1989", "Mons");
        String expResult = prof.getName();
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Prof.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "prof1";
        Prof instance = null;
        instance.setName(name);
        assertEquals(instance.getName(), prof.getName());
    }

    /**
     * Test of getFirstname method, of class Prof.
     */
    @Test
    public void testGetFirstname() {
        System.out.println("getFirstname");
        Prof instance = null;
        String expResult = "";
        String result = instance.getFirstname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstname method, of class Prof.
     */
    @Test
    public void testSetFirstname() {
        System.out.println("setFirstname");
        String firstname = "";
        Prof instance = null;
        instance.setFirstname(firstname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateNaiss method, of class Prof.
     */
    @Test
    public void testGetDateNaiss() {
        System.out.println("getDateNaiss");
        Prof instance = null;
        String expResult = "";
        String result = instance.getDateNaiss();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateNaiss method, of class Prof.
     */
    @Test
    public void testSetDateNaiss() {
        System.out.println("setDateNaiss");
        String dateNaiss = "";
        Prof instance = null;
        instance.setDateNaiss(dateNaiss);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLieuNaiss method, of class Prof.
     */
    @Test
    public void testGetLieuNaiss() {
        System.out.println("getLieuNaiss");
        Prof instance = null;
        String expResult = "";
        String result = instance.getLieuNaiss();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLieuNaiss method, of class Prof.
     */
    @Test
    public void testSetLieuNaiss() {
        System.out.println("setLieuNaiss");
        String lieuNaiss = "";
        Prof instance = null;
        instance.setLieuNaiss(lieuNaiss);
    }

    /**
     * Test of add method, of class Prof.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Prof p = null;
        Prof instance = null;
        instance.add();
    }

    /**
     * Test of update method, of class Prof.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int id = 0;
        Prof p = null;
        Prof instance = null;
        instance.update(id);
    }

    /**
     * Test of delete method, of class Prof.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        Prof instance = null;
        instance.delete(id);
    }

    /**
     * Test of select method, of class Prof.
     */
    @Test
    public void testSelect_int() {
        System.out.println("select");
        int id = 0;
        Prof instance = null;
        instance.select(id);
    }

    /**
     * Test of select method, of class Prof.
     */
    @Test
    public void testSelect_String() {
        System.out.println("select");
        String name = "";
        Prof instance = null;
        instance.select(name);
    }

    /**
     * Test of getListCours method, of class Prof.
     */
    @Test
    public void testGetListCours() {
        System.out.println("getListCours");
        int idprof = 0;
        Prof instance = null;
        instance.getListCours();
    }

    /**
     * Test of select method, of class Prof.
     */
    @Test
    public void testSelect_0args() {
        System.out.println("select");
        Collection<Prof> expResult = null;
        Collection<Prof> result = Prof.select();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Prof.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Prof instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
