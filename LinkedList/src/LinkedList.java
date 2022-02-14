/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Ravkeerat SIngh
 */

//package MyLinkedList;

public class LinkedList {

    /**
     * @param args the command line arguments
     */
    //Linekd list - manager of nodes
    public static void main(String[] args) {

                
//
        MyLinkedList l1 = new MyLinkedList(); 
        l1.AddFront(1001220,3.99);
        l1.AddFront(1001310,3.99);
//        l1.AddFront(1001440,3.99);
        l1.AddLast(1500000, 4.4);
        //li.AddLast(2000000,4.0);
        l1.printItem();
        System.out.println(l1.search(78));

        }
    }

