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
public class Hash_review {

   
    public static void main(String[] args) {
        LinearHashTable lht = new LinearHashTable(10,0.75); 
        lht.add("INDIA");
        lht.add("PHILIPPINES");
        lht.add("USA");
        lht.add("UK");
        lht.add("GER");
        lht.printTable();
        System.out.println(lht.exists("INDIA"));
        System.out.println(lht.exists("USA"));
        //lht.delete("GER");
        lht.printTable();
                
        
    }
    
}
