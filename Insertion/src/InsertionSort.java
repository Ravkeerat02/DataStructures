/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravkeerat SIngh
 */
public class InsertionSort {
    public  void sort(int[] array) {
        for(var i = 1; i < array.length ; i++){
            var current = array[i]; 
            var j = i-1 ; //stars from previos item
            while( j >= 0 && array[j] > current){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
        
    }
    
}
