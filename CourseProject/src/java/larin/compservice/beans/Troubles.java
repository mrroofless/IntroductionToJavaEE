/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package larin.compservice.beans;

import java.util.Date;

/**
 *
 * @author roofless
 */
public class Troubles {
    private int id_trouble;
    private String trouble_name;
    private String description;
    private String data_priema;
    private int id_client;
    
    public Troubles() {
        
    }


    /**
     * @return the id_trouble
     */
    public int getId_trouble() {
        return id_trouble;
    }

    /**
     * @param id_trouble the id_trouble to set
     */
    public void setId_trouble(int id_trouble) {
        this.id_trouble = id_trouble;
    }

    /**
     * @return the trouble_name
     */
    public String getTrouble_name() {
        return trouble_name;
    }

    /**
     * @param trouble_name the trouble_name to set
     */
    public void setTrouble_name(String trouble_name) {
        this.trouble_name = trouble_name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the data_priema
     */
    public String getData_priema() {
        return data_priema;
    }

    /**
     * @param data_priema the data_priema to set
     */
    public void setData_priema(String data_priema) {
        this.data_priema = data_priema;
    }

    /**
     * @return the id_client
     */
    public int getId_client() {
        return id_client;
    }

    /**
     * @param id_client the id_client to set
     */
    public void setId_client(int id_client) {
        this.id_client = id_client;
    }
    public Troubles(int id_trouble, String trouble_name, String description, String data_priema, int id_client){
        this.id_trouble=id_trouble;
        this.trouble_name=trouble_name;
        this.description=description;
        this.data_priema=data_priema;
        this.id_client=id_client;
    }



    
}
