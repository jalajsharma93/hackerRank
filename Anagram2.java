// For all possible combination of String of same Size
import java.util.Arrays;
class Anagram2{
	boolean isAnagram(String str1, String str2){
		//replacing string to number of charecter
		String s1 = str1.replaceAll("\\s","");
		String s2 = str2.replaceAll("\\s","");
		
		//
		boolean check = true;
		if(s1.length()!=s2.length())
		{
			check = false;
		}
		else{
			s1=sortArray(s1);
			s2=sortArray(s2);
			check = s1.equalsIgnoreCase(s2);
		}
	return check;
	}
	 String sortArray(String st){
		char[] checkArray1 = st.toLowerCase().toCharArray();
		char[] temp = new char[checkArray1.length];
		int count = 0;
		for(int i=0;i<checkArray1.length;i++){
			count=0;
			for(int j=0;j<checkArray1.length;j++){
				if(checkArray1[i]<checkArray1[j]){
					count++;
				}
			}
			temp[count]=checkArray1[i];
		}
		String str3 = new String(temp);
		return str3;
	 }
}