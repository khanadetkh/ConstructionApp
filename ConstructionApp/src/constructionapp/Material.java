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
public class Material {
    private int id;
    private String name;
    private int quantity;

    public Material(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int add_use_quantity) { // add+/use-
        this.quantity = this.quantity + add_use_quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Matterial{" + "id=" + id + ", name=" + name + ", quantity=" + quantity + '}';
    }
    
    
}
