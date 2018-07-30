/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructionapp;

import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class MaterialList {
    ArrayList <Material> listOfMaterial = new ArrayList<Material>();
    Contract contract;

    public MaterialList(Contract contract) {
        listOfMaterial = new ArrayList<Material>();
        this.contract = contract;
    }

    public void addMaterial (Material m) {
        listOfMaterial.add(m);
    }
    public void removeMaterial (Material m) {
        for (Material material : listOfMaterial) {
            if (material.getId()==m.getId()) {
                listOfMaterial.remove(material);
            }
        }
    }
    
}
