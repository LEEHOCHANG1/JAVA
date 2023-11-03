package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class test14 {

	public static void main(String[] args) {
		String txt = "테스트입니다!!";
		String fileName = "D://example.txt";
		
		try {
			File file = new File(fileName);
			FileWriter fw = new FileWriter(file, true) ;
			fw.write(txt);
			fw.flush();
			fw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}