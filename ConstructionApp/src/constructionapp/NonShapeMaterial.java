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
public class NonShapeMaterial extends Material {

    private int amountPerPiece;
    private String unit;

    public NonShapeMaterial(int amount, String unit, int id, String name, int quantity) {
        super(id, name, quantity);
        this.amountPerPiece = amount;
        this.unit = unit;
    }

    public NonShapeMaterial(int id, String name, int quantity) {
        super(id, name, quantity);
    }

    public int getAmountPerPiece() {
        return amountPerPiece;
    }

    public void setAmountPerPiece(int amountPerPiece) {
        if (amountPerPiece >= 0) {
            this.amountPerPiece = amountPerPiece;
        }

    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return super.toString()+"NonShapeMaterial{" + "amountPerPiece=" + amountPerPiece + ", unit=" + unit + '}';
    }

}
