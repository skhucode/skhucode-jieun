package class04;

import java.util.Scanner;

/*�ִ������� �ּҰ����

�� ���� �ڿ����� �Է¹޾� �ִ� ������� �ּ� ������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/
public class Code_2609 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int GCM=1, LCM=1;//�ִ�����, �ּҰ����
		
	    if(x<y) {
	    	int temp = x;
	    	x=y;
	    	y=temp;
	    }
	    for(int i=1; i<=y; i++) {
	    	if(x%i==0 && y%i==0) {
	    		GCM=i;
	    	}
	    }
		
	    LCM=GCM*(y/GCM)*(x/GCM);
		System.out.println(GCM);
		System.out.println(LCM);
	}

}
