import java.util.Scanner;
public class p32 {
	public static void main(String[] args) {
		int num, fact, i;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number");
		num = sc.nextInt();

		fact=1;
		for(i=1; i<=num; i++)
		{
			fact = fact * i;
		}
		
		System.out.println("Factorial of " + num + " is " + fact);



	}

}
