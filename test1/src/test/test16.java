package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class test16 {

    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("test2.txt", true));
            bw.write("홍길동");
            bw.newLine();
            bw.write("\n홍길동");
            bw.close();

            BufferedReader br = new BufferedReader(new FileReader("test2.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("파일 처리 중 오류가 발생했습니다.");
            e.printStackTrace();
        }
    }
}