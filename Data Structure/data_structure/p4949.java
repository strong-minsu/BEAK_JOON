package data_structure;
import java.util.*;

public class p4949 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		Stack<String> stack = new Stack<>(); 
		
		while(true) {
			String s = sc.nextLine();
			if(s.equals(".")) {
				break;
			}
			stack.clear();
			String []str = s.split("");
			
			for(String string : str) {
				if(string.equals("(") || string.equals("[")) {
					stack.push(string);
				}
				else if(!stack.isEmpty() && string.equals(")") && stack.peek().equals("(")) {
					stack.pop();
				}
				else if(!stack.isEmpty() && string.equals("]") && stack.peek().equals("[")) {
					stack.pop();
				}
				else if(string.equals(")") || string.equals("]")) {
					stack.push(string);
				}
			}
			
			if(stack.isEmpty())
				sb.append("yes").append("\n");
			else
				sb.append("no").append("\n");
		}
		System.out.print(sb);
	}

}
