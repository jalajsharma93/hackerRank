//For printing first and last lexographically string
class LexString{
	public static void lexMinMax(String str, int n){
		String curntStr =  str.substring(0,n);
		String minStr = curntStr;
		String maxStr = curntStr;
		
		for (int i = n; i < str.length(); i++){
			curntStr = curntStr.substring(1,n) + str.charAt(i);
			if(maxStr.compareTo(curntStr) <0 )
				maxStr = curntStr;
			if(minStr.compareTo(curntStr) > 0)
				minStr = curntStr;
		}
		System.out.println(minStr);
		System.out.println(maxStr);
	}
}