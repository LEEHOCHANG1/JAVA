package Quiz;

import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FilePrint {

	public static void filePrint (Student[] stu) {
		LocalDate now = LocalDate.now();
		String Date = now.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
		try {
			File file = new File("D://FilePrint_" + Date + " .txt");
			FileWriter fw = new FileWriter(file, false) ;
			fw.write("이름" +'\t'+ "국어" +'\t'+ "영어" +'\t'+ "수학" +'\t'+ "총점" +'\t'+ "평균" + '\n');
			fw.write("---------------------------------------------------------" + '\n');
			for (Student student : stu) {
				if (student != null) {
					fw.write(student.getName() +'\t' + student.getKor()  +'\t' + student.getEng()
					+'\t'+ student.getMath()  +'\t' + student.AllScores() +'\t' + String.format("%.2f", student.Average())+'\n');

				}
			}
			fw.flush();
			fw.close();

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
