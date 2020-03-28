import static java.lang.System.in;
import java.util.Scanner;

class PrimeTest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Prime pr = new Prime();
		System.out.println("Enter Numbers");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int n5 = sc.nextInt();
		pr.testPrime(n1);
		pr.testPrime(n1,n2);
		pr.testPrime(n1,n2,n3);
		pr.testPrime(n1,n2,n3,n4);
		pr.testPrime(n1,n2,n3,n4,n5);
	}
}