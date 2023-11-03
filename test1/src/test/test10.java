package test;

public class test10 {

	public static void main(String[] args) {
		int intArray[][] = {{1, 3}, {22, 4}, {25, 6}, {7, 81}, {9, 10}};
        
   	 for(int i = 0; i < intArray.length; i++) {
   				for(int j = 0; j < intArray[i].length; j++) {
   					System.out.print("[" + i + "]"+"[" + j + "] = " + intArray[i][j] + "\n");
   						
   				}
          
   		}
   }
} 