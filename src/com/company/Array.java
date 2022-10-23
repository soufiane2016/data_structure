package com.company;

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

    public void RemoveAt(int index){
        if(index < 1 || index >= count){
            throw new IllegalArgumentException();
        }
        for(int i = index ; i<count; i++){
            itemes[i] = itemes[i+1];
        }
        count--;
    }

    public int IndexOf(int item){
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

    public int Max(){
        largest = itemes[0];
        for(int i = 0; i<count; i++){
            if(largest < itemes[i+1]){
                largest = itemes[i+1];
            }
        }
        return largest;
    }

    public void print(){
        for(int i = 0; i<count; i++){
            System.out.println(itemes[i]);
        }
    }
}