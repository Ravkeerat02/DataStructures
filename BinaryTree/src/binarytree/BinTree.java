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
public class BinTree {
    private BNode root ; 
    
    public BinTree(){
        root = null; 
    }
    
    //case 1 - insert - handled
    //ATTACH - needs a last item
    public void insert(int data){
        BNode newNode = new BNode(data); 
        if(root == null){
            root = newNode ; 
            return; 
        }
        BNode parent , current ; 
        current = parent =  root; 
        while(current != null){
            parent = current ; 
            if(data<current.data)
                current = current.left; 
            else
                current = current.right; 
            //will repeat unitl null
        }
        if(data<parent.data)
                parent.left = newNode; 
            else
                parent.right = newNode; 
    }
    public void inOrder(){
       recInOrder(root); 
        System.out.println("");
    }
    
    private void  recInOrder(BNode curr){
        if (curr == null)  return ; 
        recInOrder(curr.left); 
        System.out.println(curr.data+"");
        recInOrder(curr.right); 
    }
    
    public void preOrder(){
        recPreOrder(root); 
        System.out.println("");
    }
    
    private void  recPreOrder(BNode curr){
        if (curr == null)  return ; 
        System.out.println(curr.data+"");
        recInOrder(curr.left); 
        recInOrder(curr.right); 
    }
    public void postOrder(){
        recPostOrder(root); 
        System.out.println("");
    }
    
    private void  recPostOrder(BNode curr){
        if (curr == null)  return ; 
        recInOrder(curr.left); 
        recInOrder(curr.right);
        System.out.println(curr.data+"");
    }
    
    public void levelOrderTreversal(){
        MyQueue mq = new MyQueue(); 
        mq.enQueue(root);
        while(!mq.isEmpty()){
            BNode curr = mq.deQueue(); 
            System.out.println(curr.data+"");
            if(curr.left!=null ) mq.enQueue(curr.left); 
            if(curr.right!=null ) mq.enQueue(curr.right); 
        }
        System.out.println("");
    }
        
        public Integer search(int key){
            BNode curr = root; 
            if(root == null) return null; 
            while(curr != null && curr.data != key){
                if(key<curr.data)
                    curr = curr.left; 
                else
                    curr = curr.right;
        }
           if(curr == null) return null; 
           return curr.data; 
    }
        
        public void delete( int key ){
            //doing recursively 
            //resetting the node 
            root = deleteRecursive(root,key);
        }
        
        public BNode deleteRecursive(BNode root , int key ){
            //if root is null
            if(root == null) return root ;
            //searching for the item to be deleted
            if(key < root.data)//getting recursive search done 
                root.left = deleteRecursive(root.left,key); 
            else
                if ( key > root.data)
                    root.right = deleteRecursive(root.right , key ); 
                else {
                    if (root.left == null && root.right== null){
                        return null ; 
                    }//left returns right
                    if(root.left == null){
                        return root.right; 
                    }//right returns left
                    if(root.right == null){
                        return root.left;
                    }
                    BNode inOrderSucc = root.right ; 
                    while(inOrderSucc.left != null){
                        inOrderSucc = inOrderSucc.left; 
                    }
                    root.data = inOrderSucc.data; 
                    root.right = deleteRecursive(root.right,inOrderSucc.data);
                }  
            return root; 
        }
    
    
    
    
    
}
