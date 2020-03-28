import java.util.Scanner;
class SubStringLex{
	public static void main(String args[]){
		String[] temp;
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n =  sc.nextInt();
		sc.close();
		temp = new String[str.length()];
		int count=0;
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<=str.length();j++){
				if(str.substring(i,j).length()==n){
					System.out.println(str.substring(i,j));
					temp[i] = str.substring(i,j);
					count++; 
				}
			}
		}
		String temp2[] = new String[count];
		temp2=temp;
		
		System.out.println(temp2[0]+" "+temp[count-1]);
	}
}