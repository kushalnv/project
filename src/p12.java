
public class p12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
int n1, n2,n3;
		
		n1 = 10;
		n2 = 20;
		n3 =  30;
		System.out.println("N1 : " + n1 + " N2 : " + n2 + "N3 : " + n3);

		if(n1<n2&&n1<n3)
		{
			System.out.println("N1 is smaller");
		}
		if(n2<n3&&n2<n1)
		{
			System.out.println("N2 is smaller");
		}
		else
		{
			System.out.println("N3 is smaller");
		}
	}}
