package class04;

import java.util.Scanner;

/*�ּҰ����
�� �ڿ��� A�� B�� ���ؼ�, A�� ����̸鼭 B�� ����� �ڿ����� A�� B�� �������� �Ѵ�.
�̷� ����� �߿��� ���� ���� ���� �ּҰ������� �Ѵ�. ���� ���, 6�� 15�� ������� 30, 60, 90���� ������, �ּ� ������� 30�̴�.
�� �ڿ��� A�� B�� �־����� ��, A�� B�� �ּҰ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/
public class Code_1934 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int GCM=1,LCM=1;
		int[] arr = new  int[3];
		for(int i=0; i<num; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A<B) {
				int temp = A;
				A=B;
				B=temp;
			}
		    for(int j=1; j<=B; j++) {
		    	if(B%j==0 && B%j==0) {
		    		GCM=j;
		    	}
		    }
		    LCM=GCM*(A/GCM)*(B/GCM);
			arr[i] = LCM;
		}
		for(int k=0; k<num; k++) {
			System.out.println(arr[k]);
		}
	}

}
