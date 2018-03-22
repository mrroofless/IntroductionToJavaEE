/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package larin.compservice.beans;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author roofless
 */
public class RepairTest {
    
    public RepairTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId_repair method, of class Repair.
     */
    @Test
    public void testGetId_repair() {
        try {
            System.out.println("getId_repair");
            Repair instance = new Repair();
            int expResult = 0;
            int result = instance.getId_repair();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of setId_repair method, of class Repair.
     */
    @Test
    public void testSetId_repair() {
        try {
            System.out.println("setId_repair");
            int id_repair = 0;
            Repair instance = new Repair();
            instance.setId_repair(id_repair);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of getDifficulty method, of class Repair.
     */
    @Test
    public void testGetDifficulty() {
        try {
            System.out.println("getDifficulty");
            Repair instance = new Repair();
            int expResult = 0;
            int result = instance.getDifficulty();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of setDifficulty method, of class Repair.
     */
    @Test
    public void testSetDifficulty() {
        try {
            System.out.println("setDifficulty");
            int difficulty = 0;
            Repair instance = new Repair();
            instance.setDifficulty(difficulty);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of getComponents method, of class Repair.
     */
    @Test
    public void testGetComponents() {
        try {
            System.out.println("getComponents");
            Repair instance = new Repair();
            String expResult = "";
            String result = instance.getComponents("");
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of setComponents method, of class Repair.
     */
    @Test
    public void testSetComponents() {
        try {
            System.out.println("setComponents");
            String components = "";
            Repair instance = new Repair();
            instance.setComponents(components);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of getPrice method, of class Repair.
     */
    @Test
    public void testGetPrice() {
        try {
            System.out.println("getPrice");
            Repair instance = new Repair();
            int expResult = 0;
            int result = instance.getPrice();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of setPrice method, of class Repair.
     */
    @Test
    public void testSetPrice() {
        try {
            System.out.println("setPrice");
            int price = 0;
            Repair instance = new Repair();
            instance.setPrice(price);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of isCashed method, of class Repair.
     */
    @Test
    public void testIsCashed() {
        try {
            System.out.println("isCashed");
            Repair instance = new Repair();
            boolean expResult = false;
            boolean result = instance.isCashed();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of setCashed method, of class Repair.
     */
    @Test
    public void testSetCashed() {
        try {
            System.out.println("setCashed");
            boolean cashed = false;
            Repair instance = new Repair();
            instance.setCashed(cashed);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of isComplete method, of class Repair.
     */
    @Test
    public void testIsComplete() {
        try {
            System.out.println("isComplete");
            Repair instance = new Repair();
            boolean expResult = false;
            boolean result = instance.isComplete();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of setComplete method, of class Repair.
     */
    @Test
    public void testSetComplete() {
        try {
            System.out.println("setComplete");
            boolean complete = false;
            Repair instance = new Repair();
            instance.setComplete(complete);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of isExecutable method, of class Repair.
     */
    @Test
    public void testIsExecutable() {
        try {
            System.out.println("isExecutable");
            Repair instance = new Repair();
            boolean expResult = false;
            boolean result = instance.isExecutable();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of setExecutable method, of class Repair.
     */
    @Test
    public void testSetExecutable() {
        try {
            System.out.println("setExecutable");
            boolean executable = false;
            Repair instance = new Repair();
            instance.setExecutable(executable);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
             fail("The test case is a prototype.");
        }
       
    }

    /**
     * Test of getId_trouble method, of class Repair.
     */
    @Test
    public void testGetId_trouble() {
        try {
            System.out.println("getId_trouble");
            Repair instance = new Repair();
            int expResult = 0;
            int result = instance.getId_trouble();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
             fail("The test case is a prototype.");
        }
       
    }

    /**
     * Test of setId_trouble method, of class Repair.
     */
    @Test
    public void testSetId_trouble() {
        try {
            System.out.println("setId_trouble");
            int id_trouble = 0;
            Repair instance = new Repair();
            instance.setId_trouble(id_trouble);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
    }
}
