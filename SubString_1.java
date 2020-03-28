class SubString_1{
	String[] temp;
	String copy = " ";
	String[] subString(String str){
	temp = new String [str.length()];
	for(int i=0;i<str.length();i++){
			for(int j=i+1;j<=str.length();j++){
				if(str.substring(i,j).length()==3){
					
					System.out.println(str.substring(i,j));
					copy = str.substring(i,j);
				}
			}//count++;
			temp[i] = copy;
		}
		return temp;
	}
}