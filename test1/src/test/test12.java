package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class test12 {

    public static void main(String[] args) throws IOException {
    	
    	BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\test.txt", false)); 
		 
        System.out.print("입력할 학생의 수를 입력하시오 : " + '\n');
        Scanner s = new Scanner(System.in);
        int in = s.nextInt();
        String[] names = new String[in];
        int[] koreanScores = new int [in];
        int[] englishScores = new int [in];
        int[] mathScores = new int[in];
        int totalKorean = 0;
        int totalEnglish = 0;
        int totalMath = 0;
        int totalTotal = 0;
        double totalAverage = 0;
        
        for (int i = 0; i < in; i++) {
        	System.out.println(in+"명 중 " + (i + 1) + "번째 학생의 이름 국어 영어 수학 점수를"
        			+ " 빈칸으로 분리하여 입력하시오.");
        	names[i] = s.next();
        	koreanScores[i] = s.nextInt();
        	englishScores[i] = s.nextInt();
        	mathScores[i] = s.nextInt();
        }
        String str = "이름\t국어\t영어\t수학\t총점\t평균" + '\n';
        System.out.print(str);
        bw.write(str);
        for (int i = 0; i < names.length; i++) {
            int totalScore = koreanScores[i] + englishScores[i] + mathScores[i];
            double averageScore = totalScore / 3.0;
            String kor = Integer.toString(koreanScores[i]);
            String eng = Integer.toString(englishScores[i]);
            String mat = Integer.toString(mathScores[i]);
            String tot = Integer.toString(totalScore);
            String avg = String.format("%.2f", averageScore);
           
            totalKorean += koreanScores[i];
            totalEnglish += englishScores[i];
            totalMath += mathScores[i];
            totalTotal += totalScore;
            totalAverage += averageScore;
            
            str = names[i]+"\t"+kor+"\t"+eng+"\t"+mat+"\t"
                    +tot+"\t"+avg+'\n';
            System.out.print(str);
            bw.write(str);
        }   
        //String tkor = Integer.toString(totalKorean);
        //String teng = Integer.toString(totalEnglish);
        //String tmat = Integer.toString(totalMath);
        //String ttot = Integer.toString(totalTotal);
        String tavg = String.format("%.2f", totalAverage/names.length);
        str = "합계\t" + totalKorean + "\t" + totalEnglish + "\t" + totalMath
                + "\t" + totalTotal + "\t"+ tavg + '\n';
	    System.out.println(str);
	    bw.write(str);
	    bw.close();
	    s.close();
    }
    
    
}