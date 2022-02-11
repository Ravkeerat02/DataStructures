/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unordered;

public class OrderedArray {
    private int[] m_array;
    private int numElements;
    private int maxSize;
    
    public OrderedArray(int size){
        maxSize=size;
        numElements=0;
        m_array = new int[maxSize];
    }
    
    public void addInOrder(int item){
        if (numElements<maxSize){
            m_array[numElements] = item;
            numElements++;           
        } 
        
        int temp = m_array[numElements-1]; 
        int presPos =numElements-2;
        while (presPos>=0 && m_array[presPos]>temp){
            m_array[presPos+1]=m_array[presPos];
            presPos--;
        }
        m_array[presPos+1]=temp;      
    }
    
    public void listItems(){
        for (int index =0; index <numElements ;index++){
               System.out.print(m_array[index]+" ");
        }
        System.out.println("");
    }
    
    public void listItems(int amountToPrint){
        if ( amountToPrint<=numElements){
            for (int index =0; index <amountToPrint ;index++){
                   System.out.print(m_array[index]+" ");
            }
            System.out.println("");
        }
    }
    
    public int binarySearchAsc(int key){
        int lo=0,hi=numElements-1,mid;
        
        while (lo<=hi){
            mid = (lo+hi)/2;
            if (m_array[mid]==key) return mid;
            if (m_array[mid]>key)
                hi=mid-1;
            else
                lo=mid+1;      
        }
        return -1;     
    }
    
    public void removeLast(){
        if(numElements > 0){
            numElements--;
        }
    }
    
    public void removeByIndex(int index){
        if(index >=0 && index < numElements){
            for(int pres = index ; pres < numElements -1 ; pres++){
                m_array[pres]= m_array[pres+1];
            }
            
        }
    }
    
    public void efficeintRemove(int index){
        if(index >=0 && index < numElements){
                m_array[index]= m_array[numElements-1];
                numElements--;
            }
            
        }
    
    
    }
