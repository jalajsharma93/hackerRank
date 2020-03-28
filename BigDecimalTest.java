import java.math.BigDecimal;
import java.util.*;
class BigDecimalTest{

    public static void main(String []args) throws NullPointerException {
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();
		
		Comparator <String> sComp = new Comparator<String>()
		{
			public int compare(String s1, String s2){
				BigDecimal b1 = new BigDecimal(s1);
				BigDecimal b2 = new BigDecimal(s2);
				return b2.compareTo(b1);
			}
		};
		Arrays.sort(s,0,n,sComp);
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }

	}
}