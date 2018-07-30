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
public class ShapeMaterial extends Material {

    private int length;
    private int width;
    private int height;

    public ShapeMaterial(int length, int width, int height, int id, String name, int quantity) {
        super(id, name, quantity);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public ShapeMaterial(int id, String name, int quantity) {
        super(id, name, quantity);
        this.length = 0;
        this.width = 0;
        this.height = 0;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length >= 0) {
            this.length = length;

        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width >= 0) {
            this.width = width;

        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (width >= 0) {
            this.height = height;

        }
    }

    @Override
    public String toString() {
        return super.toString() + "ShapeMaterial{" + "length=" + length + ", width=" + width + ", height=" + height + '}';
    }

}
