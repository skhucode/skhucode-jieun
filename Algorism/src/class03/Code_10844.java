package class03;

import java.util.Scanner;

/*
���� ��� �� 


����
 

45656�̶� ���� ����.

�� ���� ������ ��� �ڸ����� ���̰� 1�� ����. �̷� ���� ��� ����� �Ѵ�.

�����̴� ���� ���̰� N�� ��� ���� �� �� �ִ��� �ñ�������.

N�� �־��� ��, ���̰� N�� ��� ���� �� �� �� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. (0���� �����ϴ� ���� ����.)



�Է�
 

ù° �ٿ� N�� �־�����. N�� 1���� ũ�ų� ����, 100���� �۰ų� ���� �ڿ����̴�.


���
 

ù° �ٿ� ������ 1,000,000,000���� ���� �������� ����Ѵ�.



���� �Է� 1 ���� 
 1


���� ��� 1 ���� 
 9




���� �Է� 2 ���� 
 2



���� ��� 2 ���� 
 17

*/
public class Code_10844 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n=0,num=0,count=0;
		int k=9; int m=9;
		//�ڸ��� �� �Է�
		n = sc.nextInt();
		//�ڸ��� ��ŭ �迭 ����
		int[] arr = new int[n];

		if(n==1) {
			num=9;	
		}
		if((1<=arr[0])&&(arr[0]<=9)) {
				for(int i=n-1; i<0; i--) {
					arr[i]=k; arr[i-1]=m;
					for( k=9;k<0;k--) {
						for( m=9; m<0; m--) {
							if((arr[i]-arr[i-1])==1 || (arr[i]-arr[i-1])== -1) {
								count++;
							}
						}
					}
/*					if(count==(n-1)) {
						num++;
					}*/
			}

	}
		System.out.println(num);
		System.out.println(count);
	}
}
