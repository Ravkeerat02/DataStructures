/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

/**
 *
 * @author Ravkeerat SIngh
 */
public class MergeSort {
    // A & B -> ASCENDING ORDER
    // POST CONDITION : RETURN A & B AFTER MERGING 
 // pre condition: Assume a and b are in ascending order.
    // post condition: Return an array with the contents of a a and b in ascending order.
   public static int[] merge (int[] a, int[] b, int lengthA, int lengthB){
    int[] c = new int[lengthA + lengthB];
    int pa = 0, pb = 0, pc = 0;
    while(pa < lengthA && pb < lengthB){
        if(a[pa] < b[pb]){
            c[pc] = a[pa];
            pa++;
        }
        else{
            c[pc] = b[pb];
            pb++;
        }
        pc++;
    }
    while(pa < lengthA){
        c[pc] = a[pa];
        pa++; pc++;
    }
    while (pb < lengthB){
        c[pc] = b[pb];
        pb++; pc++;
    }
    return c;
}

    public static void main(String[] args) {
       int[] A = new int[] {2, 2, 8, 10, 13, 15, 19, 23, 23, 27, 45 ,2, 2, 8, 10, 13, 15, 19, 23, 23, 27, 45};
       int[] B = new int[] {5, 6, 7, 12, 18, 34, 67, 77, 77,2, 2, 8, 10, 13, 15, 19, 23, 23, 27, 45};
       int[] C = merge(A,B,A.length,B.length);
       for(int x = 0; x < C.length; x++){
           System.out.print(C[x]+" ");
       }
    }

}
