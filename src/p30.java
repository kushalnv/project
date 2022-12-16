import java.util.Scanner;
public class p30 {
	public static void main(String[] args) {
		int a,b,temp;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the a and b values");
		a=sc.nextInt();
		b=sc.nextInt();
		
	       temp=a;
			a=b;
			b=temp;
		System.out.println("swap number"+a);
	}

}
