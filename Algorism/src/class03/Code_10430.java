package class03;
/*나머지 문제
(A+B)%C는 (A%C + B%C)%C 와 같을까?

(A×B)%C는 (A%C × B%C)%C 와 같을까?

세 수 A, B, C가 주어졌을 때, 위의 네가지 값을 구하는 프로그램을 작성하시오.*/

import java.util.Scanner;

public class Code_10430 {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
    int x=0;
    x=A+B;
    System.out.println(x%C);
    
    System.out.println( (A%C + B%C)%C);
    System.out.println((A*B)%C);
    System.out.println( (A%C * B%C)%C);
	}
}
