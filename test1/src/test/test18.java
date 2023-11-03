package test;

import java.util.Scanner;

public class test18 {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	      
	      System.out.print("숫자 오름차순 정렬\n\n");
	      System.out.print("몇 개의 숫자를 입력하시겠습니까? >> ");
	      int in = s.nextInt();
	      int arrary[] = new int [in];
	      
	      System.out.print("숫자를 입력해 주십시요\n");
	      for (int i=0;i<arrary.length;i++) {
	    	  arrary[i] = s.nextInt();
	      }
	      
	      int temp = 0;
	      for(int j=0;j<arrary.length;j++) {
	         for (int i=0;i<arrary.length;i++) {
	            if(i<arrary.length-1) {
	               if(arrary[i]>arrary[i+1]) {
	                  temp = arrary[i+1];
	                  arrary[i+1] = arrary[i];
	                  arrary[i] = temp;
	               }
	            }
	         }
	      }
	         
	                     
	      for (int i=0;i<arrary.length;i++) {
	         if (i==arrary.length-1) {
	            System.out.print(arrary[i]);
	         }
	         else {System.out.print(arrary[i]+",");
	         }
	      }
	      s.close();
	   }
}