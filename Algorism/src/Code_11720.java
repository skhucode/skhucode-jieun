import java.util.Scanner;
// ������ ��
public class Code_11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s =new Scanner(System.in);
		
		int num = s.nextInt();
		s.nextLine();
		
		//s.nextLine()���� ���� ���ڿ��� �迭 arr�� split�޼ҵ带 �̿��� �ϳ��� �߶�  �迭�� �Է� �޴´�.
		String[] arr = s.nextLine().split("");
		int sum =0;
		for(int i=0; i<num; ++i) {
			//�迭 arr�� String ���̹Ƿ� �� ���� sum���� ���� ���� Integer Ÿ������ �޾Ƽ� ���ؾ��Ѵ�.
			sum+=Integer.parseInt(arr[i]);	
		}
		System.out.printf("%d",sum);
	}

}
