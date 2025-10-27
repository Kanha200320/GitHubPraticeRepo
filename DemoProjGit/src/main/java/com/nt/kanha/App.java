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
//<<<<<<< HEAD
    	System.out.println("The sum is2 "+app.sum(100,100));System.out.println("Changes done by the devloper");
        System.out.println("Something went wrong so i have again change");
//=======
    	System.out.println("The sum is1 "+ app.sum(100,100));
        
//>>>>>>> branch 'main' of https://github.com/Kanha200320/GitHubPraticeRepo.git
    }
}
