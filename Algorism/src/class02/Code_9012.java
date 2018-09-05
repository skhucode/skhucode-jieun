/*��ȣ ���ڿ�(Parenthesis String, PS)�� �� ���� ��ȣ ��ȣ�� ��(�� �� ��)�� ������ �����Ǿ� �ִ� ���ڿ��̴�.
�� �߿��� ��ȣ�� ����� �ٸ��� ������ ���ڿ��� �ùٸ� ��ȣ ���ڿ�(Valid PS, VPS)�̶�� �θ���.
�� ���� ��ȣ ��ȣ�� �� ��( )�� ���ڿ��� �⺻ VPS �̶�� �θ���. ���� x �� VPS ��� �̰��� �ϳ��� ��ȣ�� ���� ���ο� ���ڿ� ��(x)���� VPS �� �ȴ�.
�׸��� �� VPS x �� y�� ����(concatenation)��Ų ���ο� ���ڿ� xy�� VPS �� �ȴ�.
���� ��� ��(())()���� ��((()))�� �� VPS ������ ��(()(��, ��(())()))�� , �׸��� ��(()�� �� ��� VPS �� �ƴ� ���ڿ��̴�. 

�������� �Է����� �־��� ��ȣ ���ڿ��� VPS ���� �ƴ����� �Ǵ��ؼ� �� ����� YES �� NO �� ��Ÿ����� �Ѵ�.*/ 

package class02;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.io.BufferedReader;
//��ȣ

public class Code_9012 {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); 
		         int n = Integer.parseInt(buffer.readLine()); 
		         Stack<String> stack = new Stack<>(); 
		 
		 
		         for (int i=0; i<n; ++i) 
		         { //temp�� ���ڰ� �ѱ��ھ� ��� ������ �ȴ�.
		             String[] temp = buffer.readLine().split(""); 
		             for (int j=0; j<temp.length; ++j) 
		             { 
		                 if (temp[j].equals("(")) 
		                     stack.push(temp[j]); 
		                 if(temp[j].equals(")") && stack.isEmpty()) 
		                 { 
		                     stack.push(temp[j]); 
		                     break; 
		                 } 
		                 if (temp[j].equals(")") && !stack.isEmpty()) 
		                     stack.pop(); 
		             } 
		             if (stack.isEmpty()) 
		                 System.out.println("YES"); 
		             else 
		                 System.out.println("NO"); 
		           //stack�� �����ϴ� ��� �ڷḦ �����ϴ� �޼ҵ� -> stack.clear()
		             stack.clear(); 
		         }  
		     } 
		 } 
