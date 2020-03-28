import static java.lang.System.in;
import java.util.Scanner;
public class Prime{
	
	public boolean checkPrime(int num){
		if(num == 1) return false;
		for(int i = 2;i<num/2+1;i++){
			if(num%i==0) return false;
		}
		return true;
	}
	public void testPrime(int...numbers){
		for(int num:numbers){
            System.out.print(checkPrime(num)?""+num+" ":"");
        }
        System.out.println("");
	}
}