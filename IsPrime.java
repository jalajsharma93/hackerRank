import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class IsPrime {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        int len = (n/2)+1;
        boolean flag = true;
        scanner.close();
        if(n==1){
           flag = false;
           break; 
        }else{
            for(int i=2;i<=len;i++){
                if(n%i==0){
                    flag = false;
                    break;
                }
            }
        }
        if(flag){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}
