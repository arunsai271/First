package com.test;

/**
 * @author arunsai
 *
 */
public class Practise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	System.out.println(nearHundred(18));
			}
	
	
	public static boolean nearHundred(int n) {
		  return ((Math.abs(100 - n) <= 10) ||
		    (Math.abs(200 - n) <= 10));
		}
}

