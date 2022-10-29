package com.company;

public class Main {

    public static void main(String[] args) {
////////////////// Array list examples /////////////
	    /*Array numbers = new Array(3);
	    int[] newNumbers = new int[4];
	    ArrayList<Integer> newNumber = new ArrayList<Integer>();
	    numbers.insert(10);
	    numbers.insert(40);
	    numbers.insert(30);
	    numbers.insert(20);
	    
	    newNumber.add(10);
	    newNumber.add(300);
	    newNumber.add(50);
	    newNumber.add(20);
	
		//numbers.removeAt(5);
		//System.out.print(numbers.indexOf(40));
	    //TODO 

		//System.out.print(numbers.max());
		//numbers.intersect(newNumber);
	    //numbers.reverse();
	    numbers.insertAt(315,1);
	    //System.out.print(newNumber);
	    //numbers.print();*/

/////////////// LinkedList examples //////////////
    	
    	var linkedList = new LinkedList();
    	
    	linkedList.addLast(10);
    	linkedList.addLast(20);
    	linkedList.addLast(30);
    	
    	System.out.print(linkedList.indexOf(20));
    	
    	

    }
}
