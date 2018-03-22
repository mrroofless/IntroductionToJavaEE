/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package larin.compservice.DAO;

import java.sql.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.sql.DataSource;
import larin.compservice.beans.*;

/**
 *
 * @author roofless
 */
public class ServiceDAO {
    private DataSource dataSource;
    private MysqlDataSource ds = new MysqlDataSource();

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    public ServiceDAO() {
        ds.setURL("jdbc:mysql://localhost/compservice");
        ds.setUser("root");
        ds.setPassword("");
        dataSource = (DataSource)ds;
    }
    
    public Connection connect() throws SQLException{
        return dataSource.getConnection();
    }

    public void disconnect(Connection connection) throws SQLException{
        connection.close();
    }

    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
    
        public Integer getLastID() throws SQLException{
        int m=0;
        Connection conn = connect();
        PreparedStatement preparedStatement;
        preparedStatement = (PreparedStatement)conn.prepareStatement(
        "select id_trouble from troubles where trouble_name!=''");
        ResultSet result = preparedStatement.executeQuery();
        while (result.next()){
           m = result.getInt("id_trouble");
        }
        return m;
    }
        
     public int addClient(Clients client) throws SQLException{
         int rec = 0;
         Connection conn = connect();
         PreparedStatement preparedStatement = (PreparedStatement)conn.prepareStatement
                 ("Insert into clients(fio, address, telephone, email, password) values(?,?,?,?,?)");
         preparedStatement.setString(1, client.getFio());
         preparedStatement.setString(2, client.getAddress());
         preparedStatement.setString(3, client.getTelephone());
         preparedStatement.setString(4, client.getEmail());
         preparedStatement.setString(5, client.getPassword());
         rec = preparedStatement.executeUpdate();
         disconnect(conn);
         return rec;
    }
     
     public int addTrouble(Troubles trouble) throws SQLException{
         int rec = 0;
         Connection conn = connect();
         PreparedStatement preparedStatement = (PreparedStatement)conn.prepareStatement
                 ("Insert into troubles(trouble_name, description, data_priema, id_client) values(?,?,?,?)");
         preparedStatement.setString(1, trouble.getTrouble_name());
         preparedStatement.setString(2, trouble.getDescription());
         preparedStatement.setString(3, getDateTime());
         preparedStatement.setInt(4, trouble.getId_client());
         rec = preparedStatement.executeUpdate();
         return rec;
    }
    
         public int addRepair(Repair repair) throws SQLException{
         int rec = 0;
         int id = getLastID();
         Connection conn = connect();
         PreparedStatement preparedStatement = (PreparedStatement)conn.prepareStatement
              ("Insert into repair(difficulty, components, price, cashed, complete, executable, id_trouble) values(?,?,?,?,?,?,?)");
         preparedStatement.setString(1, repair.getDifficulty());
         preparedStatement.setString(2, repair.getComponents());
         preparedStatement.setInt(3, repair.getPrice());
         preparedStatement.setBoolean(4, repair.isCashed());
         preparedStatement.setBoolean(5, repair.isComplete());
         preparedStatement.setBoolean(6, repair.isExecutable());
         preparedStatement.setInt(7, id);
             
         rec = preparedStatement.executeUpdate();
         return rec;
    }
         

         public int removeClient(Clients client)throws SQLException{
             int rec = 0;
            Connection conn = connect();
            PreparedStatement preparedStatement = (PreparedStatement)conn.prepareStatement("delete from clients where email=?");
            preparedStatement.setString(1, client.getEmail());
            preparedStatement.executeUpdate();
            rec = preparedStatement.executeUpdate();
            return rec;
    }
         
         public int removeTrouble(Troubles trouble)throws SQLException{
             int rec = 0;
            Connection conn = connect();
            PreparedStatement preparedStatement = (PreparedStatement)conn.prepareStatement("delete from troubles where id_trouble=?");
            preparedStatement.setInt(1, trouble.getId_trouble());
            preparedStatement.executeUpdate();
            rec = preparedStatement.executeUpdate();
            return rec;
    }         
            public int removeRepair(Repair repair)throws SQLException{
                     int rec = 0;
            Connection conn = connect();
            PreparedStatement preparedStatement = (PreparedStatement)conn.prepareStatement("delete from repair where id_repair=?");
            preparedStatement.setInt(1, repair.getId_repair());
            preparedStatement.executeUpdate();
            rec = preparedStatement.executeUpdate();
            return rec;
    }

     public int updateClient(Clients oldClient, Clients newClient) throws SQLException{
         int rec = 0;
         Connection conn = connect();
         PreparedStatement preparedStatement = (PreparedStatement)conn.prepareStatement
                 ("update clients set fio=?, address=?, telephone=?, password=?"+" where email=?");
         preparedStatement.setString(1, newClient.getFio());
         preparedStatement.setString(2, newClient.getAddress());
         preparedStatement.setString(3, newClient.getTelephone());
         preparedStatement.setString(4, newClient.getPassword());
         preparedStatement.setString(5, oldClient.getEmail());
         rec = preparedStatement.executeUpdate();
         disconnect(conn);
         return rec;
    }
     
             public ArrayList<Clients> getAllClients() throws SQLException{
        Connection conn = connect();
        PreparedStatement preparedStatement = (PreparedStatement)conn.prepareStatement
                ("SELECT * FROM clients ");
        ResultSet resultSet = preparedStatement.executeQuery();
        ArrayList<Clients> clList = new ArrayList<Clients>();
        while(resultSet.next()){
            Clients client = new Clients(resultSet.getInt("id_client"), resultSet.getString("fio"), resultSet.getString("address"), resultSet.getString("telephone"), resultSet.getString("email"), resultSet.getString("password"));
            clList.add(client);
        }
        disconnect(conn);
        return clList;
    }
             public ArrayList<Troubles> getAllTroubles() throws SQLException{
        Connection conn = connect();
        PreparedStatement preparedStatement = (PreparedStatement)conn.prepareStatement
                ("SELECT * FROM troubles ");
        ResultSet resultSet = preparedStatement.executeQuery();
        ArrayList<Troubles> trList = new ArrayList<Troubles>();
        while(resultSet.next()){
            Troubles trouble = new Troubles(resultSet.getInt("id_trouble"), resultSet.getString("trouble_name"), resultSet.getString("description"), resultSet.getString("data_priema"), resultSet.getInt("id_client"));
            trList.add(trouble);
        }
        disconnect(conn);
        return trList;
    }
             public ArrayList<Repair> getAllRepair() throws SQLException{
        Connection conn = connect();
        PreparedStatement preparedStatement = (PreparedStatement)conn.prepareStatement
                ("SELECT * FROM repair ");
        ResultSet resultSet = preparedStatement.executeQuery();
        ArrayList<Repair> rList = new ArrayList<Repair>();
        while(resultSet.next()){
            Repair repair = new Repair(resultSet.getInt("id_repair"), resultSet.getString("difficulty"), resultSet.getString("components"), resultSet.getInt("price"), resultSet.getBoolean("cashed"), resultSet.getBoolean("complete"), resultSet.getBoolean("executable"), resultSet.getInt("id_trouble"));
            rList.add(repair);
        }
        disconnect(conn);
        return rList;
    }
         public ArrayList<Clients> getClientById(int id_client) throws SQLException{
        Connection connection = connect();
        PreparedStatement preparedStatement = (PreparedStatement)connection.prepareStatement("SELECT * FROM clients WHERE id_client=?");
        preparedStatement.setInt(1, id_client);
        ResultSet resultSet = preparedStatement.executeQuery();
        ArrayList<Clients> clList = new ArrayList<Clients>();
        while(resultSet.next()){
        Clients client = new Clients(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6));
        clList.add(client);
        }
        disconnect(connection);
        return clList;
    }
         
         public Clients getClientByEmail(String mail) throws SQLException{
        Connection connection = connect();
        PreparedStatement preparedStatement = (PreparedStatement)connection.prepareStatement("SELECT * FROM clients WHERE email=?");
        preparedStatement.setString(1, mail);
        ResultSet resultSet = preparedStatement.executeQuery();
        Clients client = null;
        while(resultSet.next()){
            client = new Clients(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6));
        }
        disconnect(connection);
        return client;
    }
          
                  public ArrayList<Clients> getClientsByEmail(String mail) throws SQLException{
        Connection connection = connect();
        PreparedStatement preparedStatement = (PreparedStatement)connection.prepareStatement("SELECT * FROM clients WHERE email=?");
        preparedStatement.setString(1, mail);
        ResultSet resultSet = preparedStatement.executeQuery();
        ArrayList<Clients> clList = new ArrayList<Clients>();
        while(resultSet.next()){
             Clients client = new Clients(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6));
         clList.add(client);
        }
        disconnect(connection);
         return clList;
    }
            public ArrayList<Clients> getClientByFIO(String fio) throws SQLException{
        Connection conn = connect();
        PreparedStatement preparedStatement = (PreparedStatement)conn.prepareStatement("SELECT * FROM clients WHERE fio=?");
        preparedStatement.setString(1, fio);
        ResultSet resultSet = preparedStatement.executeQuery();
        ArrayList<Clients> clList = new ArrayList<Clients>();
        while(resultSet.next()){
            Clients client = new Clients(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4),
                    resultSet.getString(5), resultSet.getString(6));
            clList.add(client);
        }
        disconnect(conn);
        return clList;
    }
                public ArrayList<Troubles> selectTroubleByClientId(int id_client) throws SQLException{
        ArrayList<Troubles> trList = new ArrayList<Troubles>();
        Connection connection = connect();
         PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(
         "select * from troubles where id_client = ?");
         preparedStatement.setInt(1, id_client);
         ResultSet resultSet = preparedStatement.executeQuery();
         while(resultSet.next()){
            Troubles trouble = new Troubles(resultSet.getInt("id_trouble"),resultSet.getString("trouble_name"),resultSet.getString("description"),resultSet.getString("data_priema"),resultSet.getInt("id_client"));
            trList.add(trouble);
         }
       disconnect(connection);
       return trList;
    }
               public ArrayList<Repair> selectRepairByTroubleId(int id_trouble) throws SQLException{
        ArrayList<Repair> rList = new ArrayList<Repair>();
        Connection connection = connect();
         PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(
         "select * from repair where id_trouble = ?");
         preparedStatement.setInt(1, id_trouble);
         ResultSet resultSet = preparedStatement.executeQuery();
         while(resultSet.next()){
            Repair repair = new Repair(resultSet.getInt("id_repair"),resultSet.getString("difficulty"),resultSet.getString("components"),resultSet.getInt("price"),resultSet.getBoolean("cashed"),resultSet.getBoolean("complete"), resultSet.getBoolean("executable"), resultSet.getInt("id_trouble"));
            rList.add(repair);
         }
       disconnect(connection);
       return rList;
    }



       
}
