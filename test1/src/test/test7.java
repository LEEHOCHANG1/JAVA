package test;

public class test7 {

    public static void main(String[] args) {
	    	int [] n = { 4, 1, 3, 5, 2 };
	 
	    	for (int k : n) {
	    		if (k % 2 ==1) {
	    		System.out.print(k + " "); 
	    		for (int i = 0; i < k; i++) {
	    			System.out.print("*");
	    		}
	    	} else {
	    		System.out.print(k + " ");
	    		for (int j = 0; j < k; j++) {
	    			System.out.print("*");
	    		}
	    	}
	    		System.out.print('\n');
	    	}
	    }
	}