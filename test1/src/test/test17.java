package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class test17 {

    public static void main(String[] args) {
    	try {
    		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\test.txt", false));
    		 bw.write("홍길동, 김길동, 이길동" + '\n');
    		 
	        String[] names = {"홍길동", "김길동", "이길동"};
	        Scanner s = new Scanner(System.in);
	        int in = s.nextInt();
	        
	        int[] koreanScores = {80, 85, 70};
	        int[] englishScores = {70, 65, 80};
	        int[] mathScores = {90, 100, 75};
	        int totalKorean = 0;
	        int totalEnglish = 0;
	        int totalMath = 0;
	        int totalTotal = 0;
	        double totalAverage = 0;
	        System.out.print("이름\t국어\t영어\t수학\t총점\t평균" + '\n');
	        for (int i = 0; i < names.length; i++) {
	            int totalScore = koreanScores[i] + englishScores[i] + mathScores[i];
	            double averageScore = totalScore / 3.0;
	            System.out.printf(
	            		names[i]+"\t"+koreanScores[i]+"\t"+englishScores[i]+"\t"+mathScores[i]+"\t"
	            +totalScore+"\t"+"%.2f",averageScore);
	            System.out.print('\n');
	            totalKorean += koreanScores[i];
	            totalEnglish += englishScores[i];
	            totalMath += mathScores[i];
	            totalTotal += totalScore;
	            totalAverage += averageScore;
	        }   
	        System.out.print("합계\t" + totalKorean + "\t" + totalEnglish + "\t" + totalMath
	                + "\t" + totalTotal + "\t");
	            System.out.printf("%.2f", totalAverage / names.length);
	            System.out.print("\n");
	         
    	   } catch (IOException e) { 
    	   }


    }
}