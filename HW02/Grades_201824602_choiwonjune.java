package hw02;

public class Grades_201824602_choiwonjune {
	private int A_score, B_score, C_score, D_score, F_score;
	
	public void setAllGrades() {
		A_score = 1;
		B_score = 4;
		C_score = 6;
		D_score = 2;
		F_score = 1;
	}
	
	public void readAllGrades() {
		System.out.printf("A: %d, B: %d, C: %d, D: %d, F: %d\n", A_score, B_score, C_score, D_score, F_score);
	}
	
	public int totalNumGrades() {
		return A_score + B_score + C_score + D_score + F_score;
	}
	
	public int percentage(double grade) {
		int percent = (int)(Math.round(grade*100/totalNumGrades()));
		return percent; 
	}
	
	public void drawGraph() {
		int[] ast = {
			(int)(Math.round(50.0*(percentage(A_score)/100.0))),
			(int)(Math.round(50.0*(percentage(B_score)/100.0))),
			(int)(Math.round(50.0*(percentage(C_score)/100.0))),
			(int)(Math.round(50.0*(percentage(D_score)/100.0))),
			(int)(Math.round(50.0*(percentage(F_score)/100.0)))
		};
		
		for(int i = 0; i < 11; i++) {
			System.out.printf("%-5d",i*10);
		}
		System.out.println();
		for(int i = 0; i < 11; i++) {
			System.out.printf("%-5c",'|');
		}
		System.out.println();
		for(int i = 0; i < 51; i++) {
			System.out.printf("%c",'*');
		}
		System.out.println();
		for(int i = 0; i < ast.length; i++) {
			for(int j = 0; j < ast[i]; j++) {
				System.out.print("*");
			}
			System.out.printf(" %c\n",'A'+ i + i/4);
		}
	}
	
	public static void main(String args[]) {
		Grades_201824602_choiwonjune grades = new Grades_201824602_choiwonjune();
		grades.setAllGrades();
		grades.readAllGrades();
		grades.drawGraph();
	}
}
