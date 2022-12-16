import java.util.Scanner;
public class p34 {
	public static void main(String[] args) {
		int r, c, k, num;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number");
		num = sc.nextInt();

		for(r=0; r<num; r++)
		{
			k=0;
			while(k<=num-r-1)
			{
				System.out.print("   ");
				k++;
			}
			for(c=0; c<=r; c++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
