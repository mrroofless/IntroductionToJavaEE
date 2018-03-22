/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package larin.compservice.Mbean;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import larin.compservice.DAO.ServiceDAO;
import larin.compservice.beans.*;


/**
 *
 * @author roofless
 */
@ManagedBean(name="ClientBean")
@SessionScoped
public class ClientBean implements Serializable {


    /**
     * Creates a new instance of ClientBean
     */
    public ClientBean() {
    }
    private Clients client = new Clients();
    private Troubles trouble = new Troubles();
    private Repair repair = new Repair();
    private ServiceDAO DAO = new ServiceDAO();
    private List<Clients> clList = new ArrayList<Clients>();
    private List<Clients> clientList = new ArrayList<Clients>();
    private List<Troubles> trList = new ArrayList<Troubles>();
    private List<Troubles> troubleList = new ArrayList<Troubles>();
    private List<Repair> rList = new ArrayList<Repair>();
    private List<Repair> repairList = new ArrayList<Repair>();

    /**
     * @return the client
     */
    public Clients getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(Clients client) {
        this.client = client;
    }

    /**
     * @return the trouble
     */
    public Troubles getTrouble() {
        return trouble;
    }

    /**
     * @param trouble the trouble to set
     */
    public void setTrouble(Troubles trouble) {
        this.trouble = trouble;
    }

    /**
     * @return the repair
     */
    public Repair getRepair() {
        return repair;
    }

    /**
     * @param repair the repair to set
     */
    public void setRepair(Repair repair) {
        this.repair = repair;
    }

    /**
     * @return the DAO
     */
    public ServiceDAO getDAO() {
        return DAO;
    }

    /**
     * @param DAO the DAO to set
     */
    public void setDAO(ServiceDAO DAO) {
        this.DAO = DAO;
    }

    /**
     * @return the clList
     */
    public List<Clients> getClList() {
        try {
            return getDAO().getAllClients();
        } catch (SQLException ex) {
                       System.out.println("SOME EXCEPTION");
            ex.printStackTrace();

            Logger.getLogger(ClientBean.class.getName()).log(Level.SEVERE, null, ex);
            return clList;
        }
    }

    /**
     * @param clList the clList to set
     */
    public void setClList(List<Clients> clList) {
        this.clList = clList;
    }

    /**
     * @return the trList
     */
    public List<Troubles> getTrList() {
                try {
            return getDAO().getAllTroubles();
        } catch (SQLException ex) {
                       System.out.println("SOME EXCEPTION");
            ex.printStackTrace();

            Logger.getLogger(ClientBean.class.getName()).log(Level.SEVERE, null, ex);
            return trList;
        }
    }

    /**
     * @param trList the trList to set
     */
    public void setTrList(List<Troubles> trList) {
        this.trList = trList;
    }

    /**
     * @return the rList
     */
    public List<Repair> getrList() {
                try {
            return getDAO().getAllRepair();
        } catch (SQLException ex) {
                       System.out.println("SOME EXCEPTION");
            ex.printStackTrace();

            Logger.getLogger(ClientBean.class.getName()).log(Level.SEVERE, null, ex);
            return rList;
        }
    }

    /**
     * @param rList the rList to set
     */
    public void setrList(List<Repair> rList) {
        this.rList = rList;
    }

    /**
     * @return the clientList
     */
    public List<Clients> getClientList() {
        return clientList;
    }

    /**
     * @param clientList the clientList to set
     */
    public void setClientList(List<Clients> clientList) {
        this.clientList = clientList;
    }
    
        /**
     * @return the troubleList
     */
    public List<Troubles> getTroubleList() {
        return troubleList;
    }

    /**
     * @param troubleList the troubleList to set
     */
    public void setTroubleList(List<Troubles> troubleList) {
        this.troubleList = troubleList;
    }

    /**
     * @return the repairList
     */
    public List<Repair> getRepairList() {
        return repairList;
    }

    /**
     * @param repairList the repairList to set
     */
    public void setRepairList(List<Repair> repairList) {
        this.repairList = repairList;
    }

    
    public String autorizat() throws SQLException{
        {
            if((getClient().getEmail() != null) && (getClient().getEmail().equals(getClient().getEmail()))){
            Clients searchClient = getDAO().getClientByEmail(getClient().getEmail());
            if((searchClient.getPassword() != null) && (searchClient.getPassword().equals(getClient().getPassword()))) {
                         
                setClient(searchClient);
                return "/Start.xhtml";
            }
            }return "/Error.xhtml";
    }
    }
    

    
    public String addClient() throws SQLException{
        if((getClient().getFio() != null) &&
                (getClient().getAddress()!= null) && 
                (getClient().getTelephone()!= null) &&
                (getClient().getEmail() != null) &&
                (getClient().getPassword() != null)){
            getDAO().addClient(getClient());
            return "/index.xhtml";
        }
        else{return "/Error.xhtml";}
    }
    
    public String addTrouble() throws SQLException{
        if((getTrouble().getTrouble_name() != null) && 
                (getTrouble().getDescription()!= null) &&
                (getTrouble().getData_priema()!= null)){
            getTrouble().setId_client(getClient().getId_client());
            getDAO().addTrouble(getTrouble());
            return "/Repair.xhtml";
        }
        else{return "/Error.xhtml";}
    }

        public String addRepair() throws SQLException{
           if((getRepair().getDifficulty() != null) && 
                (getRepair().getPrice()!= 0)) {
                getRepair().setId_trouble(getTrouble().getId_trouble());
                getDAO().addRepair(getRepair());
               System.out.println(getDAO().addRepair(getRepair()));
            return "/Start.xhtml";   
           }      
        else{return "/Error.xhtml";}
        }
        
            public String removeClient() throws SQLException {
            getDAO().removeClient(getClient());
            return "/Redact.xhtml";
        }
            public String removeTrouble() throws SQLException {
            getDAO().removeTrouble(getTrouble());
            return "/Redact.xhtml";
        }
        public String removeRepair() throws SQLException {
            getDAO().removeRepair(getRepair());
            return "/Redact.xhtml";
        }
        
            public String updateClient() throws SQLException {
            getDAO().updateClient(getClient(),getClient());
            return "/Redact.xhtml";
        }
            
    public String allClients() throws SQLException{
       setClList(getDAO().getAllClients());
       return "/Search.xhtml";
       }
    public String allTroubles() throws SQLException{
       setTrList(getDAO().getAllTroubles());
       return "/Search.xhtml";
       }
        public String allRepair() throws SQLException{
       setrList(getDAO().getAllRepair());
       return "/Search.xhtml";
       }
   
    public String clientByFIO() throws SQLException{
            setClientList(getDAO().getClientByFIO(getClient().getFio()));
            return "/ClientSearchResult.xhtml";
        }
       
    public String clientsByEmail() throws SQLException{
       setClientList(getDAO().getClientsByEmail(getClient().getEmail()));
       return "/ClientSearchResult.xhtml";
       }

    public String clientById() throws SQLException{
       setClientList(getDAO().getClientById(getClient().getId_client()));
       return "/ClientSearchResult.xhtml";
       }

    public String selectTroubleByClientId() throws SQLException{
       setTroubleList(getDAO().selectTroubleByClientId(getTrouble().getId_client()));
       return "/TroubleSearchResult.xhtml";
       }

    public String selectRepairByTroubleId() throws SQLException{
       setRepairList(getDAO().selectRepairByTroubleId(getRepair().getId_trouble()));
       return "/RepairSearchResult.xhtml";
       }



}
