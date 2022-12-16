

import java.util.Scanner;public class p16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
			int num1, num2;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 2 Numbers");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			System.out.println("Num1 : " + num1 + " Num2 : " + num2);
			if (num1 < num2) {
			System.out.println("Num1 is Smaller");
			} else {
			System.out.println("Num2 is Smaller");}

	}

}
