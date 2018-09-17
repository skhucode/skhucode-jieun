package class01;
import java.util.*;
/*
NMK 스페셜 저지 


문제
 

1부터 N까지의 수를 한 번씩 이용해서 최대 부분 증가 수열의 길이가 M이고, 최대 부분 감소 수열의 길이가 K인 수열을 출력한다.




입력
 

첫째 줄에 N M K가 주어진다. N은 500보다 작거나 같은 자연수, M과 K는 N보다 작거나 같은 자연수이다.




출력
 

첫째 줄에 문제의 정답을 출력한다. 정답이 없다면-1을 출력한다






예제 입력 1 복사 
 4 2 2




예제 출력 1 복사 
 2 1 4 3
*/
public class Code_1201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//1부터 n까지의 수
		int n = sc.nextInt();
		//증가 수열이 m
		int m = sc.nextInt();
		//최대 부분 감소 수열의 길이가 K인 수열
		int k = sc.nextInt();
		if(m+k-1 <= n && n <= m*k) {
			int[] a = new int[n];
			for(int i =0; i<n; i++) {
				a[i] = i+1;
			}
			ArrayList<Integer> group = new ArrayList<Integer>();
			group.add(0);
			group.add(k);
			n -= k;
			m -= 1;
			int group_size = m == 0? 1: n/m;
			int r = m == 0 ? 0: n%m;
			for(int i=0; i<m; i++) {
				group.add(group.get(group.size()-1)+group_size + (r > 0 ? 1 : 0));
				if(r > 0) {
					r -= 1;
				}
			}
			//group를 정렬한다.
			for(int i=0; i<group.size()-1; i++) {
				int begin = group.get(i);
				int end = group.get(i+1)-1;
				while(begin < end) {
					int temp = a[begin];
					a[begin] = a[end];
					a[end] = temp;
					begin += 1;
					end -= 1;
				}
			}
			for(int i=0; i<a.length; i++) {
				System.out.println(a[i] + " ");
			}
			System.out.println();
		}else {
			System.out.println(-1);
		}
	}

}
