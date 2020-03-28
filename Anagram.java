// For all possible combination of String of same Size
//import java.util.Arrays;
class Anagram{
	static boolean isAnagram(String str1, String str2){
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
			char[] checkArray1 = s1.toLowerCase().toCharArray();
			char[] checkArray2 = s2.toLowerCase().toCharArray();
			Arrays.sort(checkArray1);
			Arrays.sort(checkArray2);
			check = Arrays.equals(checkArray1,checkArray2);
		}
	return check;
	}
}