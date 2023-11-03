package test;

public class test8 {

    public static void main(String[] args) {
    	
    		int intArray[] = {5, 2, 4, 3, 1};
    		int r = 5;
    		
    		for (int i = 0; i <intArray.length; i++) {
    			for(int j = 0; j<intArray.length; j++) {
    				if(intArray[j] >= r)
    					System.out.print("* ");
    				else
    					System.out.print("  ");
    			}
    			System.out.print('\n');
    			r--;
    		}
    		for (int y = 0; y < intArray.length; y++) {
    			System.out.print(intArray[y] + " ");
    		}
    	
    }
}