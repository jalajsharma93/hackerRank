// For pailendrom String
import java.util.Scanner;
class Pailendrom{
	public static void main(String args[]){
		String rev = "";
		Scanner sc  = new Scanner(System.in);
		String str  = sc.nextLine();
		sc.close();
		for(int i = str.length()-1;i>=0;i--){
			rev = rev + str.charAt(i);
		}
		if(str.equalsIgnoreCase(rev))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}