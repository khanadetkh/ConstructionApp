/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructionapp;

import javax.swing.JFrame;

/**
 *
 * @author Student
 */
public class ConstructionApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Material m = new NonShapeMaterial(20,"15-kq bag", 11 , "Cement", 30);
//        System.out.println(m);
//        m.setQuantity(-4);
//        System.out.println(m);

         JFrame f = new JFrame("test frame");
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         UpdateStaffPanel p = new UpdateStaffPanel();
//         f.getContentPane().add(p);
          
         ShowStaffss st = new ShowStaffss();
            f.getContentPane().add(st);
            
            f.pack();
            f.setVisible(true);
          

    }
    
}
