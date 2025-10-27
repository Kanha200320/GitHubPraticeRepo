package com.nt.kanha;

/**
 * Hello world!
 */
public class App {
	
	public int sum(int x,int y) {
		System.out.println("The sum is "+(x+y));
		return x+y;
	}
	
    public static void main(String[] args) {
    	
    	App app=new App();
    	System.out.println("The sum is1 "+ app.sum(100,100));
        
    }
}
