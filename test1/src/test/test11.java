package test;

public class test11 {

    public static void main(String[] args) {

            String[] names = {"홍길동", "김길동", "이길동"};
            int[] koreanScores = {80, 85, 70};
            int[] englishScores = {70, 65, 80};
            int[] mathScores = {90, 100, 75};

            int totalKorean = 0;
            int totalEnglish = 0;
            int totalMath = 0;
            int totalTotal = 0;
            double totalAverage = 0;

            System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
            for (int i = 0; i < names.length; i++) {
                int totalScore = koreanScores[i] + englishScores[i] + mathScores[i];
                double averageScore = totalScore / 3.0;

                System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f%n", names[i], koreanScores[i], englishScores[i], mathScores[i], totalScore, averageScore);

                totalKorean += koreanScores[i];
                totalEnglish += englishScores[i];
                totalMath += mathScores[i];
                totalTotal += totalScore;
                totalAverage += averageScore;
            }

            System.out.printf("합계\t%d\t%d\t%d\t%d\t%.2f%n", totalKorean, totalEnglish, totalMath, totalTotal, totalAverage / names.length);
        } 

          
        
    }