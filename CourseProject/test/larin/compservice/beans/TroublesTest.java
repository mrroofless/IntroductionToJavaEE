/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package larin.compservice.beans;

import java.util.Date;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author roofless
 */
public class TroublesTest {
    
    public TroublesTest() {
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
     * Test of getId_trouble method, of class Troubles.
     */
    @Test
    public void testGetId_trouble() {
        try {
            System.out.println("getId_trouble");
            Troubles instance = new Troubles();
            int expResult = 0;
            int result = instance.getId_trouble();
            assertEquals(expResult, result);
        } catch (Exception e) {
           fail("The test case is a prototype.");  
        }
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setId_trouble method, of class Troubles.
     */
    @Test
    public void testSetId_trouble() {
        try {
            System.out.println("setId_trouble");
            int id_trouble = 0;
            Troubles instance = new Troubles();
            instance.setId_trouble(id_trouble);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of getTrouble_name method, of class Troubles.
     */
    @Test
    public void testGetTrouble_name() {
        try {
            System.out.println("getTrouble_name");
            Troubles instance = new Troubles();
            String expResult = "";
            String result = instance.getTrouble_name("");
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
           fail("The test case is a prototype."); 
        }
        
    }

    /**
     * Test of setTrouble_name method, of class Troubles.
     */
    @Test
    public void testSetTrouble_name() {
        try {
            System.out.println("setTrouble_name");
            String trouble_name = "";
            Troubles instance = new Troubles();
            instance.setTrouble_name(trouble_name);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of getDescription method, of class Troubles.
     */
    @Test
    public void testGetDescription() {
        try {
            System.out.println("getDescription");
            Troubles instance = new Troubles();
            String expResult = "";
            String result = instance.getDescription("");
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
          fail("The test case is a prototype.");  
        }
        
    }

    /**
     * Test of setDescription method, of class Troubles.
     */
    @Test
    public void testSetDescription() {
        try {
            System.out.println("setDescription");
            String description = "";
            Troubles instance = new Troubles();
            instance.setDescription(description);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
             fail("The test case is a prototype."); 
        }
      
    }

    /**
     * Test of getData_priema method, of class Troubles.
     */
    @Test
    public void testGetData_priema() {
        try {
            System.out.println("getData_priema");
            Troubles instance = new Troubles();
            String expResult = "";
            String result = instance.getData_priema("");
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
             fail("The test case is a prototype.");
        }
       
    }

    /**
     * Test of setData_priema method, of class Troubles.
     */
    @Test
    public void testSetData_priema() {
        try {
            System.out.println("setData_priema");
            String data_priema = "";
            Troubles instance = new Troubles();
            instance.setData_priema(data_priema);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
          fail("The test case is a prototype.");  
        }
        
    }

    /**
     * Test of getId_client method, of class Troubles.
     */
    @Test
    public void testGetId_client() {
        try {
            System.out.println("getId_client");
            Troubles instance = new Troubles();
            int expResult = 0;
            int result = instance.getId_client();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of setId_client method, of class Troubles.
     */
    @Test
    public void testSetId_client() {
        try {
            System.out.println("setId_client");
            int id_client = 0;
            Troubles instance = new Troubles();
            instance.setId_client(id_client);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
             fail("The test case is a prototype.");
        }
       
    }
}
