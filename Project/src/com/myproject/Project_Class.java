package com.myproject;

public class Project_Class {

	public static void main(String[] args) {
		
		byte a = 10;
		short b = 10000;
		int c = 200 * 200 * 200;
		long d = 1000000000 * 1000000000;
		char e = 'c';
		boolean f = true;
	    float g = 0.1f;
	    double h = 1 / 3;
		
		System.out.println("Byte max & min = " + Byte.MAX_VALUE + ' ' + Byte.MIN_VALUE + ';');
		System.out.println("Short max & min = " + Short.MAX_VALUE + ' ' + Short.MIN_VALUE + ';');
		System.out.println("Integer max & min = " + Integer.MAX_VALUE + ' ' + Integer.MIN_VALUE + ';');
		System.out.println("Long max & min = " + Long.MAX_VALUE + ' ' + Long.MIN_VALUE + ';');
		System.out.println("Character max & min = " + Character.MAX_VALUE + ' ' + Character.MIN_VALUE + ';');
		System.out.println("Boolean max & min = " + Boolean.TRUE + ' ' + Boolean.FALSE + ';');
		System.out.println("Float max & min = " + Float.MAX_VALUE + ' ' + Float.MIN_VALUE + ';');
		System.out.println("Double max & min = " + Double.MAX_VALUE + ' ' + Double.MIN_VALUE + ';');
		
		int[] arr = {5, -2, 8, 4, 10, -3, 4, 2, 4, 6};
		int min = arr[0], max = arr[0];
		for(int i = 0; i < 10; i++) {
			if(arr[i] < min) min = arr[i];
			if(arr[i] > max) max = arr[i];
		}
		
		System.out.println("Min element : " + min + " and max element : " + max);

	}

}
