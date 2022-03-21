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
public class MyQueue {
    private QNode head , tail ; 
    
    public MyQueue(){
        head = tail = null; 
        
    }
    
    public void enQueue(BNode curr){
        QNode newNode = new QNode(curr); 
        if(head == null){
            head = tail = newNode;
            return ; 
        }
        tail.next = newNode ;
        tail = newNode;     
    }
    
    public BNode deQueue(){
        if(head == null) return null; 
        BNode result = head.data; 
        head = head.next ; 
        return result ; 
    }
    
    public boolean isEmpty(){
        return head == null; 
    }
    
    
    
}
