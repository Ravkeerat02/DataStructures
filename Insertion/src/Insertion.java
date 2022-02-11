
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Ravkeerat SIngh
 */
public class Insertion {

    public static void main(String[] args) {
        // TODO code application logic here
        int [] numbers = {100,10,100}; 
        var sorter = new InsertionSort(); 
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        
    }
    
}
