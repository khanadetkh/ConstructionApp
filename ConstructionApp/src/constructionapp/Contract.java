/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructionapp;

import java.util.Date;

/**
 *
 * @author Student
 */
public class Contract {
    private int contractnumber;
    private String owner;
    private double budget;
    private Date startDate;
    private Date endDate;
    private int propertyLength;
    private int propertyWidth;

    public Contract(int contractnumber, String owner, double budget, Date startDate, Date endDate, int propertyLength, int propertyWidth) {
        this.contractnumber = contractnumber;
        this.owner = owner;
        this.budget = budget;
        this.startDate = startDate;
        this.endDate = endDate;
        this.propertyLength = propertyLength;
        this.propertyWidth = propertyWidth;
    }

    public int getPropertyWidth() {
        return propertyWidth;
    }

    public void setPropertyWidth(int propertyWidth) {
        this.propertyWidth = propertyWidth;
    }

    public int getContractnumber() {
        return contractnumber;
    }

    public void setContractnumber(int contractnumber) {
        this.contractnumber = contractnumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getPropertyLength() {
        return propertyLength;
    }

    public void setPropertyLength(int propertyLength) {
        this.propertyLength = propertyLength;
    }

    @Override
    public String toString() {
        return "Contract{" + "contractnumber=" + contractnumber + ", owner=" + owner + ", budget=" + budget + ", startDate=" + startDate + ", endDate=" + endDate + ", propertyLength=" + propertyLength + ", propertyWidth=" + propertyWidth + '}';
    }
    
    
}
