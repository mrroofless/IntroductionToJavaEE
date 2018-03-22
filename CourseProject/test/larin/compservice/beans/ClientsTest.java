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
public class ClientsTest {
    
    public ClientsTest() {
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
     * Test of getId_client method, of class Clients.
     */
    @Test
    public void testGetId_client() {
        try {
            System.out.println("getId_client");
            Clients instance = new Clients();
            int expResult = 0;
            int result = instance.getId_client();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of setId_client method, of class Clients.
     */
    @Test
    public void testSetId_client() {
        try {
            System.out.println("setId_client");
            int id_client = 0;
            Clients instance = new Clients();
            instance.setId_client(id_client);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of getFio method, of class Clients.
     */
    @Test
    public void testGetFio() {
        try {
            System.out.println("getFio");
            Clients instance = new Clients();
            String expResult = "";
            String result = instance.getFio();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of setFio method, of class Clients.
     */
    @Test
    public void testSetFio() {
        try {
            System.out.println("setFio");
            String fio = "";
            Clients instance = new Clients();
            instance.setFio(fio);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
           fail("The test case is a prototype."); 
        }
        
    }

    /**
     * Test of getAddress method, of class Clients.
     */
    @Test
    public void testGetAddress() {
        try {
            System.out.println("getAddress");
            Clients instance = new Clients();
            String expResult = "";
            String result = instance.getAddress();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
    }
        }
        

    /**
     * Test of setAddress method, of class Clients.
     */
    @Test
    public void testSetAddress() {
        try {
            System.out.println("setAddress");
            String address = "";
            Clients instance = new Clients();
            instance.setAddress(address);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
          fail("The test case is a prototype.");  
        }
        
    }

    /**
     * Test of getTelephone method, of class Clients.
     */
    @Test
    public void testGetTelephone() {
        try {
            System.out.println("getTelephone");
            Clients instance = new Clients();
            int expResult = 0;
            int result = instance.getTelephone();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of setTelephone method, of class Clients.
     */
    @Test
    public void testSetTelephone() {
        try {
            System.out.println("setTelephone");
            int telephone = 0;
            Clients instance = new Clients();
            instance.setTelephone(telephone);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of getEmail method, of class Clients.
     */
    @Test
    public void testGetEmail() {
        try {
            System.out.println("getEmail");
            Clients instance = new Clients();
            String expResult = "";
            String result = instance.getEmail();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of setEmail method, of class Clients.
     */
    @Test
    public void testSetEmail() {
        try {
            System.out.println("setEmail");
            String email = "";
            Clients instance = new Clients();
            instance.setEmail(email);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of getPassword method, of class Clients.
     */
    @Test
    public void testGetPassword() {
        try {
            System.out.println("getPassword");
            Clients instance = new Clients();
            String expResult = "";
            String result = instance.getPassword();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of setPassword method, of class Clients.
     */
    @Test
    public void testSetPassword() {
        try {
            System.out.println("setPassword");
            String password = "";
            Clients instance = new Clients();
            instance.setPassword(password);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
           fail("The test case is a prototype."); 
        }
        
    }
}
