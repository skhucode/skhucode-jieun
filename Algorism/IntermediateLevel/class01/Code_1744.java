package class01;
import java.util.*;
/*
수 묶기 





시간 제한

메모리 제한

제출

정답

맞은 사람

정답 비율


2 초 128 MB 3830 1023 860 27.814% 





문제
 

길이가 N인 수열이 주어졌을 때, 그 수열의 합을 구하려고 한다. 하지만, 그냥 그 수열의 합을 모두 더해서 구하는 것이 아니라, 수열의 두 수를 묶으려고 한다. 어떤 수를 묶으려고 할 때, 위치에 상관없이 묶을 수 있다. 하지만, 같은 위치에 있는 수(자기 자신)를 묶는 것은 불가능하다. 그리고 어떤 수를 묶게 되면, 수열의 합을 구할 때 묶은 수는 서로 곱한 후에 더한다.

예를 들면, 어떤 수열이 {0, 1, 2, 4, 3, 5}일 때, 그냥 이 수열의 합을 구하면 0+1+2+4+3+5 = 15이다. 하지만, 2와 3을 묶고, 4와 5를 묶게 되면, 0+1+(2*3)+(4*5) = 27이 되어 최대가 된다.

수열의 모든 수는 단 한번만 묶거나, 아니면 묶지 않아야한다.

수열이 주어졌을 때, 수열의 각 수를 적절히 묶었을 때, 그 합이 최대가 되게 하는 프로그램을 작성하시오.




입력
 

첫째 줄에 수열의 크기 N이 주어진다. N은 10,000보다 작다. 둘째 줄부터 N개의 줄에, 수열의 각 수가 주어진다. 수열의 수는 -10,000보다 크거나 같고, 10,000보다 작거나 같은 정수이다.




출력
 

수를 적절히 묶어 그 합이 최댓값을 출력한다. 정답은 항상 231보다 작다.






예제 입력 1 복사 
 4
-1
2
1
3





예제 출력 1 복사 
 6





힌트
 

(-1)+1+(2*3)=6
*/
public class Code_1744 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
	
			Scanner sc = new Scanner(System.in);
			int n =sc.nextInt();
			//plus 부분과 minus 부분을 ArrayList로 각각 분리하여 저장한다.
			ArrayList<Integer> plus = new ArrayList<Integer>();
			ArrayList<Integer> minus = new ArrayList<Integer>();
			int zero = 0;
			int one =0;
			//plus와 minus를 나눠 각각의 배열에 할당한다. 0보다 크면 plus 작으면 minus
			for(int i=0; i<n; i++) {
				int x = sc.nextInt();
				if(x == 1) {
					one += 1;
				}else if(x>0) {
					plus.add(x);
				}else if(x<0) {
					minus.add(x);
				}else {
					zero +=1;
				}
			}
			Collections.sort(plus);
			Collections.sort(minus);
			Collections.reverse(plus);
			if(plus.size() % 2 ==1) {
				plus.add(1);
			}
			if(minus.size() % 2 ==1) {
				minus.add(zero > 0 ? 0 : 1);
			}
			int ans = one;
			//plus의 값들을 받아 ans에 할당한다.
			for(int i=0; i<plus.size(); i+=2) {
				ans += plus.get(i)*plus.get(i+1);
			}
			//minus의 값들을 받아 ans에 할당한다.
			for(int i=0; i<minus.size(); i+=2) {
				ans += minus.get(i)*minus.get(i+1);
			}
			System.out.println(ans);
 		}
	

}
