import java.util.Scanner;

public class HW01_201824602_choiwonjune {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		
		double number = input.nextDouble();
		
		if(number > 150.45 || number > 60.30 && number < 70.25 )
			System.out.print("YES");
		else
			System.out.print("No");
	}
}
