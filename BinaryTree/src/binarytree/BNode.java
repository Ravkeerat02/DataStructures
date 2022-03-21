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
public class BNode {
    public int data;
    public BNode left,right;

    public BNode(int data){
        this.data=data;
        left=right=null;
    }
}

