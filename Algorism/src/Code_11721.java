import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//열 개씩 끊어 출력하기
public class Code_11721 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//BufferReader가 Scanner 보다 실행속도면이 우수하여 사용하게 되었습니다.
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String a = buffer.readLine();
		
		for(int i=0; i<a.length(); ++i) {
			if(i == 0 || i %10 != 0)
				System.out.print(a.charAt(i));
			else
				//10으로 나머지가 있으면 한 줄 띄고 값 대입
				System.out.print("\n" +a.charAt(i));
		}
	}

}
