/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash_review;

/**
 *
 * @author Ravkeerat SIngh
 */
public class LinearHashTable {
    private String[] table;
    private int maxSize ; 
    private int numItems ; 
    private double loadFactor; //how much load it can carry 
    
    public LinearHashTable(int max, double loadFactor){
        table = new String[max]; 
        maxSize = max; 
        numItems = 0 ; 
        this.loadFactor = loadFactor ; 
    }
    
    private int hashFunction(String word){
        //converting char to an int
        int value = 0 , weight =1; 
        for( int x = 0 ; x< word.length(); x++){
            value += word.charAt(x)*weight;
            weight++;
        }
        return value%maxSize ; 
    }
    
    public void add(String word){
           // hash table is gonna keep a particular performance
        if(numItems/maxSize < loadFactor){
            //adding location to the array
            int loc = hashFunction(word); 
            while(table [loc] != null && !table [loc].equals("_DEL_")){
            loc = (loc+1)%maxSize ;
        }
        table[loc] = word; 
        numItems++; 
    }
    }
    private int search(String word){
        int loc = hashFunction(word);
        while(table[loc] != null && !table[loc].equals(word) ){
            loc = (loc+1)%maxSize;
        }
        if (table[loc] != null)
            return loc; 
        return -1;
    }
    
    private void delete( String word){
        int loc = hashFunction(word); 
        while(table[loc] != null && !table[loc].equals(word) ){
            loc = (loc+1)%maxSize; 
        }
        if(table[loc] != null){
            table[loc] ="_DEL_"; 
            numItems--; 
        }
    }
    
    public boolean exists(String word){
        //to check if item exists
        return search(word) != -1;
    }
    
    public void printTable(){
        for ( int x=0 ; x<maxSize ; x++){
            System.out.println(x+" -> ");
            if(table[x] == null){
                System.out.println("EMPTY");
            }else{
                System.out.println(table[x]);
            }
        }
        System.out.println("--------------------------");
    }
}
        
