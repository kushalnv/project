import java.util.Scanner;
public class p33 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int r, c, num;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number");
		num = sc.nextInt();

		for(r=0; r<num; r++)
		{
			for(c=0; c<=r; c++)
			{
				System.out.print("* ");
			}
			System.out.println();


	}

}}
