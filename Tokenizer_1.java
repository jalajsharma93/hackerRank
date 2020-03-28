import java.util.StringTokenizer;
import java.util.Scanner;
class Tokenizer_1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.replaceAll("[^a-zA-Z0-9]", " ");
		StringTokenizer st = new StringTokenizer(str);
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
}