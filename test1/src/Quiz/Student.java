package Quiz;

public class Student {
	private String name;
	private int Kor;
	private int Eng;
	private int Math;
	
		public Student(){
			name = "익명";
			Kor = 0;
			Eng = 0;
			Math = 0;
		}
		
		public Student(String name, int Kor, int Eng, int Math) {
			this.name = name;
			this.Kor = Kor;
			this.Eng = Eng;
			this.Math = Math;
		}
		
		public void setName(String name) {
			this.name = name;
		
		}
		
		public void setScores(int Kor, int Eng, int Math) {
			this.Kor = Kor;
			this.Eng = Eng;
			this.Math = Math;
		}
		
		public String getName() {
			return this.name;
		}
		
		
		public int getKor() {
			return Kor;
		}
		
		public int getEng() {
			return Eng;
		}
		
		public int getMath() {
			return Math;
		}
			
}
