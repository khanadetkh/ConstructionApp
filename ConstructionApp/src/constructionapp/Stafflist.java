/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructionapp;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Student
 */
public class Stafflist {

    ArrayList<Staff> listOfStaff;
    Contract contract;
    Date endWorkingDate;

    public Stafflist(Contract contract, Date endWorkingDate) {
        listOfStaff = new ArrayList<Staff>();
        this.contract = contract;
        this.endWorkingDate = endWorkingDate;
    }

    public void addStaff(Staff st) {
        listOfStaff.add(st);
    }

    public void removeStaff(Staff st) {
        for (Staff staff : listOfStaff) {
            if (staff.getId() == st.getId()) {
                listOfStaff.remove(staff);
            }
        }
    }
}
