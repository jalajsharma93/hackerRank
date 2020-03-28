//Driver class
import java.util.Scanner;
class AnagramTest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Anagram2 ag = new Anagram2();
		//Input String 
		String str1 = sc.nextLine(); //To compare with
		String str2 = sc.nextLine();//To compare String
		
		boolean check = ag.isAnagram(str1,str2);
		if(check){
			System.out.println("Anagram");
		}
		else{
			System.out.println("Not Anagram");
		}
	}
}