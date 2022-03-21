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
public class QNode {
    public BNode data;
    public QNode next;

    public QNode(BNode data){
        this.data = data;
        next=null;
    }
}


