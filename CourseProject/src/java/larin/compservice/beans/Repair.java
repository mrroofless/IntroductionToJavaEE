/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package larin.compservice.beans;

/**
 *
 * @author roofless
 */
public class Repair {
    private int id_repair;
    private String difficulty;
    private String components;
    private int price;
    private boolean cashed;
    private boolean complete;
    private boolean executable;
    private int id_trouble;
   public Repair() {
       
   }

    /**
     * @return the id_repair
     */
    public int getId_repair() {
        return id_repair;
    }

    /**
     * @param id_repair the id_repair to set
     */
    public void setId_repair(int id_repair) {
        this.id_repair = id_repair;
    }

    /**
     * @return the difficulty
     */
    public String getDifficulty() {
        return difficulty;
    }

    /**
     * @param difficulty the difficulty to set
     */
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    /**
     * @return the components
     */
    public String getComponents() {
        return components;
    }

    /**
     * @param components the components to set
     */
    public void setComponents(String components) {
        this.components = components;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the cashed
     */
    public boolean isCashed() {
        return cashed;
    }

    /**
     * @param cashed the cashed to set
     */
    public void setCashed(boolean cashed) {
        this.cashed = cashed;
    }

    /**
     * @return the complete
     */
    public boolean isComplete() {
        return complete;
    }

    /**
     * @param complete the complete to set
     */
    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    /**
     * @return the executable
     */
    public boolean isExecutable() {
        return executable;
    }

    /**
     * @param executable the executable to set
     */
    public void setExecutable(boolean executable) {
        this.executable = executable;
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
    
     public Repair(int id_repair, String difficulty, String components, int price, boolean cashed, boolean complete, boolean executable, int id_trouble){
        this.id_repair=id_repair;
        this.difficulty=difficulty;
        this.price=price;
        this.components=components;
        this.cashed=cashed;
        this.complete=complete;
        this.executable=executable;
        this.id_trouble=id_trouble;
    }
}
