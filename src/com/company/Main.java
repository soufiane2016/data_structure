package com.company;



public class Main {

    public static void main(String[] args) {
	    Array numbers = new Array(3);
	    numbers.insert(10);
	    numbers.insert(40);
	    numbers.insert(30);
	    numbers.insert(20);
		//numbers.RemoveAt(5);
		//System.out.print(numbers.IndexOf(40));

		System.out.print(numbers.Max());

	    //numbers.print();
    }
}
