import java.util.*;
class StackBracketMatcher{
	
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            System.out.println(checkBalanced(input));
		}
	}
   public static boolean checkBalanced(String s){
            Stack<Character> stack = new Stack<Character>();
            for(int i =0; i<s.length();i++){
                if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                    
                    stack.push(s.charAt(i));

                }else {
                    if(stack.isEmpty()){
                        return false;
                    }else{
                        char topLetter = stack.pop();
                        if(s.charAt(i) == ']' && topLetter != '['){
                            return false;
                        } else if(s.charAt(i) == '}' && topLetter != '{'){
                            return false;
                        }else if (s.charAt(i) == ')' && topLetter != '('){
                            return false;
                        }
                    }
                }
            }
            if(!stack.isEmpty()){
                return false;
            }
            else{
                return true;
            }
    }
}



