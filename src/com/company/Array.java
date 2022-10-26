package com.company;

import java.util.ArrayList;

public class Array {
    private int[] itemes;
    private int count;
    private int largest;

    public Array(int legnth){
        itemes = new int[legnth];
    }

    public void insert(int item){
        //to resize the array
        if(itemes.length == count){
            int[] newItem = new int[count * 2];
            for(int i = 0; i<count; i++)
                newItem[i] = itemes[i];

            itemes = newItem;
        }
        //to add itemes
        itemes[count++] = item;
    }

    public void removeAt(int index){
        if(index < 1 || index >= count){
            throw new IllegalArgumentException();
        }
        for(int i = index ; i<count; i++){
            itemes[i] = itemes[i+1];
        }
        count--;
    }

    public int indexOf(int item){
        /*for (int i = 0; i<count; i++){
            if(itemes[i] == item){
                System.out.print(i + " ");
            }
        }*/

        for(int  i = 0 ; i<count; i++){
            if(itemes[i] == item)
                return i;
        }
        return -1;
    }

    public int max(){
        largest = itemes[0];
        for(int i = 0; i<count; i++){
            if(largest < itemes[i+1]){
                largest = itemes[i+1];
            }
        }
        return largest;
    }

    public void intersect(ArrayList<Integer> newItem) {
    	for(int i = 0 ; i<itemes.length; i++) {
    		for(int j = 0; j<newItem.size(); j++) {
    			if(newItem.get(j) == itemes[i])
    				System.out.println(itemes[i]);
    		}
    	}
    	
    }
    
    public void reverse() {
    	int[] reversed = new int[itemes.length];
    	int j = 0;
    	for(int i = count; i>=0; i--) {
    		reversed[j++] = itemes[i];
    	}
    	
    	for(int i = 0; i<=count; i++) {
    		System.out.print(reversed[i]);
    	}
    	
    }
    
    /*public void insertAt(int item, int index) {
    	for(int i = 0; i<itemes.length; i++) {
    		if() {
    			
    		}
    	}
    	itemes[index]=item;
    	
    }*/
    
    public void print(){
        for(int i = 0; i<count; i++){
            System.out.println(itemes[i]);
        }
    }
}