import java.util.Scanner; 
class LexStringTest{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = sc.nextInt();
		sc.close();
		LexString ls = new LexString();
		ls.lexMinMax(str,n);
	}
}