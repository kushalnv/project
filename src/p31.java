import java.util.Scanner;
public class p31 {
	public static void main(String[] args) {
		int num, fact, sum, i, j;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number");
		num = sc.nextInt();

		sum = 0;
		for (i = 1; i <= num; i++) {
			fact = 1;
			for (j = 1; j <= i; j++) {
				fact = fact * j;
			}
			sum = sum + fact;
		}

		System.out.println("Sum of series of " + num + " is " + sum);


	}

}
