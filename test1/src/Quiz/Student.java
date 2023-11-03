package Quiz;

public class Student {
	private String Name;
	private int Kor;
	private int Eng;
	private int Math;

	
		public Student(){
			Name = "익명";
			Kor = 0;
			Eng = 0;
			Math = 0;

		}
		
		public Student(String name, int Kor, int Eng, int Math) {
			this.Name = name;
			this.Kor = Kor;
			this.Eng = Eng;
			this.Math = Math;
		}
		
		public void setName(String name) {
			this.Name = name;
		
		}
		
		public void setScores(int Kor, int Eng, int Math, int Sum) {
			this.Kor = Kor;
			this.Eng = Eng;
			this.Math = Math;
			
		}
		
		public String getName() {
			return this.Name;
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
		
		public int AllScores() {
			return (Kor + Eng + Math);		
		}
		
		public double Average() {
			return ((double)(Kor + Eng + Math)/3);
		}
		
			
}
