
import java.util.Scanner;public class p17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 Numbers");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		System.out.println("Num1 : " + num1 + " Num2 : " + num2 + " Num3 : "
		+ num3);
		if (num1 > num2 && num1 > num3) {
		System.out.println("Num1 is Greater");
		} else if (num2 > num3) {
		System.out.println("Num2 is Greater");
		} else {
		System.out.println("Num3 is Greater");
	}

}

}