import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//�� ���� ���� ����ϱ�
public class Code_11721 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//BufferReader�� Scanner ���� ����ӵ����� ����Ͽ� ����ϰ� �Ǿ����ϴ�.
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String a = buffer.readLine();
		
		for(int i=0; i<a.length(); ++i) {
			if(i == 0 || i %10 != 0)
				System.out.print(a.charAt(i));
			else
				//10���� �������� ������ �� �� ��� �� ����
				System.out.print("\n" +a.charAt(i));
		}
	}

}
