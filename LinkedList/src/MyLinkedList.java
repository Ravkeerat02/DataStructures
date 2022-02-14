/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravkeerat SIngh
 */

//head - is the starting - 1st one
public class MyLinkedList {
    
    private Node head; 
    
    public MyLinkedList(){
        head = null ; 
    }
    public void AddFront(int studNum , double gpa){
        Node newNode = new Node(studNum , gpa); 
        newNode.next = head; 
        head= newNode; 
    }
    
    public void AddLast(int studNum, double gpa){
        Node newNode = new Node(studNum , gpa);
        if(head == null){
            head = newNode; 
            return ; 
        }
        Node curr = head; 
        while(curr.next != null){
            curr =curr.next; 
            
        }
        curr.next = newNode;
        
    }
    
    
    public void addInOrder( int studNum , double gpa){
        Node newNode = new Node(studNum , gpa); 
        if(head != null){
            head = newNode;
            return ; 
        }
        if (studNum < head.studentNum){
            newNode.next = head;
            return;
        }
    }
    
    
  public boolean search(int id){
      Node curr = head ; 
      while(curr != null && curr.studentNum != id){
          curr = curr.next; 
          //will stop when end is reached
      }
      if(curr != null){
          return true; 
          
      }
      return false;
  }
    
    public void printItem(){
        Node pres = head ; 
        while (pres != null){
            System.out.println(pres.studentNum + "");
        }
    }
    
}
