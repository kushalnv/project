import java.util.Scanner;
public class p29 {
	public static void main(String[] args) {
	int num,temp,rev,rem;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the values of num");
	num=sc.nextInt();
	temp=num;
	rev=0;
	while (temp>0)
	{
		rem=temp%10;
		rev=(rev*10)+rem;
		temp=temp/10;
	}
	System.out.println("reverse number "+rev);
	}

}
