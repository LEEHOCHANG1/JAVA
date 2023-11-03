package test;

public class test6 {

	public static void main(String[] args) {
		for(int i=1; i<10; i+=2) {
			for(int k=10; k>i; k-=2) {
			System.out.print(' ');
			}
			for(int j=0; j<i; j++) {
			System.out.print("*");
				}	
			System.out.print("\n");
			}
	  }
}
