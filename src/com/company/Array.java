package com.company;

public class Array {
    private int[] itemes;
    private int count;

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

    }

    public void print(){
        for(int i = 0; i<count; i++){
            System.out.println(itemes[i]);
        }
    }
}