/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author Ravkeerat SIngh
 */
public class BinaryTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BinTree b1 = new BinTree(); 
        
        b1.insert(10);
        b1.insert(2);
        b1.insert(5);
        b1.insert(8);
        b1.insert(100);
        b1.insert(20);
        b1.insert(55);
        b1.insert(8);
        b1.inOrder();
        System.out.println("-----------");
        b1.preOrder();
    }
    
}
