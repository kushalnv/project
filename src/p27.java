import java.util.Scanner;
public class p27 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num, temp, sum, rem;
		Scanner sc = new Scanner(System.in	);
		System.out.println("Enter a Number");
		num = sc.nextInt();
		
		temp = num;
		sum=0;
		while(temp>0)
		{
			rem = temp%10;
			sum = sum+rem;
			temp=temp/10;
		}
		
		System.out.println("Sum of all digits of " + num + " is " + sum);
	}
}


	
