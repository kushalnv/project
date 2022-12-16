
public class p8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
int num1, num2, num3;
		
		num1 = 10;
		num2 = 20;
		num3 = 15;
		
		System.out.println("Num1 : " + num1 + " Num2 : " + num2 + " Num3 : " + num3);

		if(num1<num2 && num1<num3)
		{
			System.out.println("Num1 is Smaller");
		}
		else if(num2<num3)
		{
			System.out.println("Num2 is Smaller");
		}
		else
		{
			System.out.println("Num3 is Smaller");	
		}

	}

}
