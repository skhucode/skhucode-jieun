package class04;
/*������ ����
(A+B)%C�� (A%C + B%C)%C �� ������?

(A��B)%C�� (A%C �� B%C)%C �� ������?

�� �� A, B, C�� �־����� ��, ���� �װ��� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.*/

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
