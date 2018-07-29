/*정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 다섯 가지이다.
•push X: 정수 X를 스택에 넣는 연산이다.
•pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
•size: 스택에 들어있는 정수의 개수를 출력한다.
•empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
•top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
*/
package class02;

import java.util.*;

// 스택

public class Code_10828 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack<Integer> stack = new Stack<>(); 
		Scanner s = new Scanner(System.in); 
		         int num = s.nextInt(); 
		 
		 
		         s.nextLine(); 
		         for(int i=0; i<num; ++i) 
		         { 
		             String a = s.nextLine(); 
		             if(a.equals("pop")) 
		                 System.out.println(stack.empty() ? -1 : stack.pop()); 
		             else if(a.equals("size")) 
		                 System.out.println(stack.size()); 
		             else if(a.equals("empty")) 
		                 System.out.println(stack.empty() ? 1 : 0); 
		             else if(a.equals("top")) 
		                 System.out.println(stack.empty() ? -1 : stack.peek()); 
		             else 
		             { 
		                 String[] arr = a.split(" "); 
		                 stack.push(Integer.parseInt(arr[1])); 
		             } 
		         } 


		
	}

}
