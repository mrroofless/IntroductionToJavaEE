/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package larin.compservice.DAO;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.DataSource;
import larin.compservice.beans.Clients;
import larin.compservice.beans.Repair;
import larin.compservice.beans.Troubles;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author roofless
 */
public class ServiceDAOTest {
    
    public static DataSource ds;
    
    public ServiceDAOTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        MysqlDataSource mds = new MysqlDataSource();
        mds.setURL("jdbc:mysql://localhost/service");
        mds.setUser("root");
        mds.setPassword("");
        ds = (DataSource) mds;
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
     * Test of setDataSource method, of class ServiceDAO.
     */
    @Test
    public void testSetDataSource() {
        System.out.println("setDataSource");
        DataSource dataSource = null;
        ServiceDAO instance = new ServiceDAO();
        instance.setDataSource(dataSource);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of connect method, of class ServiceDAO.
     */
    @Test
    public void testConnect() throws Exception {
        try {
            System.out.println("connect");
            ServiceDAO instance = new ServiceDAO();
            Connection result = instance.connect();
            assertNotNull(result);
        } catch (SQLException sQLException) {
            // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of disconnect method, of class ServiceDAO.
     */
    @Test
    public void testDisconnect() throws Exception {
        try {
            System.out.println("disconnect");
            Connection connection = null;
            ServiceDAO instance = new ServiceDAO();
            instance.setDataSource(ds);
            connection = instance.connect();
            assertNotNull(connection);
            instance.disconnect(connection);
        } catch (SQLException sQLException) {
                    // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        }

    }

    /**
     * Test of getLastID method, of class ServiceDAO.
     */

    @Test
    public void testGetLastID() throws Exception {
        try {
            System.out.println("getLastID");
            ServiceDAO instance = new ServiceDAO();
            Integer expResult = null;
            Integer result = instance.getLastID();
            assertEquals(expResult, result);
        } catch (SQLException sQLException) {
            // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of addClient method, of class ServiceDAO.
     */
    @Test
    public void testAddClient() throws Exception {

        try {
            System.out.println("addClient");
            Clients client = new Clients(13, "Larin A.A.", "Gorkogo, 87", 123456, "larin@larin.ru", "root");
            ServiceDAO instance = new ServiceDAO();
            instance.setDataSource(ds);
            int expResult = 1;
            int result = instance.addClient(client);
            assertEquals(expResult, result);
        } catch (SQLException sQLException) {
        }
   
    }

    /**
     * Test of addTrouble method, of class ServiceDAO.
     */
    @Test
    public void testAddTrouble() throws Exception {


        try {
            System.out.println("addTrouble");
            Troubles trouble = new Troubles(11, "help!!!", "ne rabotaet diskovod", "2008/02/02", 1);
            ServiceDAO instance = new ServiceDAO();
            instance.setDataSource(ds);
            int expResult = 1;
            int result = instance.addTrouble(trouble);
            assertEquals(expResult, result);
        } catch (SQLException sQLException) {
        }
 
}
             

    /**
     * Test of addRepair method, of class ServiceDAO.
     */
    @Test
    public void testAddRepair() throws Exception {
        try {
            System.out.println("addRepair");
            Repair repair = new Repair(111, 2, "nuzhen novuy diskovod", 1000, false, false, true, 11);
            ServiceDAO instance = new ServiceDAO();
            instance.setDataSource(ds);
            int expResult = 0;
            int result = instance.addRepair(repair);
            assertEquals(expResult, result);
        } catch (SQLException sQLException) {
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAllClients method, of class ServiceDAO.
     */
    @Test
    public void testGetAllClients() throws Exception {
        try {
            System.out.println("getAllClients");
            ServiceDAO instance = new ServiceDAO();
            instance.setDataSource(ds);
            ArrayList result = instance.getAllClients();
            assertFalse(result.isEmpty());
        } catch (SQLException sQLException) {
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getClientByFIO method, of class ServiceDAO.
     */
    @Test
    public void testGetClientByFIO() throws Exception {
        try {
            System.out.println("getClientByFIO");
            String fio = "";
            ServiceDAO instance = new ServiceDAO();
            ArrayList result = instance.getClientByFIO(fio);
            assertFalse(result.isEmpty());
        } catch (SQLException sQLException) {
            // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of selectTroubleByClientId method, of class ServiceDAO.
     */
    @Test
    public void testSelectTroubleByClientId() throws Exception {
        try {
            System.out.println("selectTroubleByClientId");
            int id_client = 1;
            ServiceDAO instance = new ServiceDAO();
            ArrayList result = instance.selectTroubleByClientId(id_client);
            assertFalse(result.isEmpty());
        } catch (SQLException sQLException) {
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of selectRepairByClientId method, of class ServiceDAO.
     */
    @Test
    public void testSelectRepairByClientId() throws Exception {
        try {
            System.out.println("selectRepairByClientId");
            int id_client = 1;
            ServiceDAO instance = new ServiceDAO();
            ArrayList result = instance.selectRepairByClientId(id_client);
            assertFalse(result.isEmpty());
        } catch (SQLException sQLException) {
            // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of getClientById method, of class ServiceDAO.
     */
    @Test
    public void testGetClientById() throws Exception {
        try {
            System.out.println("getClientById");
            int id = 1;
            ServiceDAO instance = new ServiceDAO();
            String name = "Ivanov V.N.";
            Clients result = instance.getClientById(id);
            assertEquals(name, result.getFio());
        } catch (SQLException sQLException) {
            // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype."); 
        }
       
    }

    /**
     * Test of getClientByEmail method, of class ServiceDAO.
     */
    @Test
    public void testGetClientByEmail() throws Exception {
        try {
            System.out.println("getClientByEmail");
            String mail = "larin@larin.ru";
            ServiceDAO instance = new ServiceDAO();
            instance.setDataSource(ds);
            int id_client = 0;
            Clients result = instance.getClientByEmail(mail);
            assertEquals(id_client, result.getId_client());
        } catch (SQLException sQLException) {
                    // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        }

    }
}
