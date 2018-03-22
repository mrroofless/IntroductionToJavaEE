/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package larin.compservice.beans;

/**
 *
 * @author roofless
 */
public class Clients {
   private int id_client;
   private String fio;
   private String address;
   private String telephone;
   private String email;
   private String password;
   


    public Clients() {
        
        
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

    /**
     * @return the fio
     */
    public String getFio() {
        return fio;
    }

    /**
     * @param fio the fio to set
     */
    public void setFio(String fio) {
        this.fio = fio;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public Clients(int id_client, String fio, String address, String telephone, String email, String password){
        this.id_client=id_client;
       this.fio=fio;
       this.address=address;
       this.telephone=telephone;
       this.email=email;
       this.password=password;
    }

    
}
