import java.util.Scanner;

public class Code_10953 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
				
		int A=0;int B=0;
		int T=0;
		T = scan.nextInt();
		scan.nextLine();
		
		for(int i=0; i<T; i++) {
			//arr �迭�� ���� �Է¹��� �� ,�� �������� ��,�� ������ ���� ĭ�� ���� �����Ͽ� �����Ѵ�.
			String arr[] = scan.nextLine().split(",");
			//���� ���ڷ� �޾ұ� ������ integer�� �ٽ� ��ȯ�Ͽ� ����� �� int������ ����Ѵ�.
			System.out.printf("%d\n",Integer.parseInt(arr[0])+Integer.parseInt(arr[1]));
			
			
		}
	}

}
