/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructionapp;

/**
 *
 * @author Student
 */
public class Staff {

    public static int getRunningnumberForID() {
        return runningnumberForID;
    }

    public static void setRunningnumberForID(int aRunningnumberForID) {
        runningnumberForID = aRunningnumberForID;
    }
    private int id;
    private static int runningnumberForID=0;
    private String name;
    private String position;
    private double paypate;
    private String payPeriod;
    private String gender;
    
    public Staff(String name, String position, double paypate, String payPeriod, String gender) {
        this.id = runningnumberForID;
        runningnumberForID++;
        this.name = name;
        this.position = position;
        this.paypate = paypate;
        this.payPeriod = payPeriod;
        this.gender = gender;
    }
    public Staff(int id, String name, String position, double paypate, String payPeriod, String gender) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.paypate = paypate;
        this.payPeriod = payPeriod;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getPaypate() {
        return paypate;
    }

    public String getPayPeriod() {
        return payPeriod;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setPaypate(double paypate) {
        this.paypate = paypate;
    }

    public void setPayPeriod(String payPeriod) {
        this.payPeriod = payPeriod;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Staff{" + "id=" + id + ", name=" + name + ", position=" + position + ", paypate=" + paypate + ", payPeriod=" + payPeriod + ", gender=" + gender + '}';
    }
    
    
            
            
}
