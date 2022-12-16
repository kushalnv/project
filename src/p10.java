
public class p10 {

	/**
	 * @param args
	 */
		public static void main(String[] args) {
			int n1, n2, n3;

			n1 = 10;
			n2 = 20;
			n3 = 15;

			System.out.println("N1 : " + n1 + " N2 : " + n2 + " N3 : " + n3);

			if (n1 < n2) {
				if (n1 < n3)
					System.out.println("N1 is Smaller");
				else
					System.out.println("N3 is Smaller");
			} else if (n2 < n3) {
				System.out.println("N2 is Smaller");
			} else {
				System.out.println("N3 is Smaller");
			}}}

		
