package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class test15 {

	public static void main(String[] args) {
		  try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt", true));
			bw.write("홍길동");
			bw.newLine();
			bw.write("\n홍길동");
			bw.close();
		}catch (IOException e) {
            e.printStackTrace();
	}
}
}