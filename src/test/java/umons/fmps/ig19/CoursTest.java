/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umons.fmps.ig19;

import java.util.Collection;
import static junit.framework.Assert.fail;
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
public class CoursTest {
    
    public CoursTest() {
        DataAccess.connect();
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

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getIntitule method, of class Cours.
     */
    @Test
    public void testGetIntitule() {
        System.out.println("getIntitule");
        Cours instance = null;
        String expResult = "";
        String result = instance.getIntitule();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIntitule method, of class Cours.
     */
    @Test
    public void testSetIntitule() {
        System.out.println("setIntitule");
        String intitule = "";
        Cours instance = null;
        instance.setIntitule(intitule);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDuree method, of class Cours.
     */
    @Test
    public void testGetDuree() {
        System.out.println("getDuree");
        Cours instance = null;
        String expResult = "";
        String result = instance.getDuree();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDuree method, of class Cours.
     */
    @Test
    public void testSetDuree() {
        System.out.println("setDuree");
        String duree = "";
        Cours instance = null;
        instance.setDuree(duree);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProf method, of class Cours.
     */
    @Test
    public void testGetProf_0args() {
        System.out.println("getProf");
        Cours instance = null;
        int expResult = 0;
        int result = instance.getProf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProf method, of class Cours.
     */
    @Test
    public void testSetProf() {
        System.out.println("setProf");
        int prof = 0;
        Cours instance = null;
        instance.setProf(prof);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Cours.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Cours c = null;
        Cours instance = null;
        instance.add();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Cours.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int id = 0;
        Cours c = null;
        Cours instance = null;
        instance.update(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class Cours.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        Cours instance = null;
        Cours.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of select method, of class Cours.
     */
    @Test
    public void testSelect_int() {
        System.out.println("select");
        int id = 0;
        Cours instance = null;
        Cours.select(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of select method, of class Cours.
     */
    @Test
    public void testSelect_String() {
        System.out.println("select");
        String intitule = "";
        Cours instance = null;
        Cours.select(intitule);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of select method, of class Cours.
     */
    @Test
    public void testSelect_0args() {
        System.out.println("select");
        Collection<Cours> expResult = null;
        Collection<Cours> result = Cours.select();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProfCours method, of class Cours.
     */
    @Test
    public void testGetProfCours() {
        System.out.println("getProfCours");
        Cours instance = null;
        Collection<Prof> expResult = null;
        Collection<Prof> result = instance.getProfCours();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
