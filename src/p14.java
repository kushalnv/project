import java.util.Scanner;

public class p14{
public static void main(String[] args) {
	int num1, num2;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 2 Numbers");
	num1 = sc.nextInt();
	num2 = sc.nextInt();
	System.out.println("Num1 : " + num1 + " Num2 : " + num2);
	System.out.println("Sum : "+(num1+num2));
	System.out.println("Sub : "+(num1-num2));
	System.out.println("Mul : "+(num1*num2));
	System.out.println("Div : "+(num1/num2));
	System.out.println("Mod : "+(num1%num2));
}
}
