
public class p9 {

	/**
	 * @param args
	 */

			public static void main(String[] args) {
				int n1, n2, n3;

				n1 = 10;
				n2 = 20;
				n3 = 15;

				System.out.println("Num1 : " + n1 + " Num2 : " + n2 + " Num3 : " + n3);

				if (n1 > n2) {
					if (n1 > n3)
						System.out.println("Num1 is Greater");
					else
						System.out.println("Num3 is Greater");
				} else if (n2 > n3) {
					System.out.println("Num2 is Greater");
				} else {
					System.out.println("Num3 is Greater");
				}

			}

		}

		
