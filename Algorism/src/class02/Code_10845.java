package class02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//큐
/*•push X: 정수 X를 큐에 넣는 연산이다.
•pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
•size: 큐에 들어있는 정수의 개수를 출력한다.
•empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
•front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
•back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.*/

public class Code_10845 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); 
        int num = Integer.parseInt(buffer.readLine()); 

		Queue<Integer> queue = new LinkedList<>();

		for(int i=0; i<num; ++i) {
			String temp = buffer.readLine();
			if(temp.equals("front"))
				System.out.println(queue.peek() == null ? -1: queue.peek());
			else if(temp.equals("back"))
				System.out.println(((LinkedList<Integer>) queue).peekLast() == null ? -1 : ((LinkedList<Integer>) queue).peekLast());
			else if(temp.equals("empty"))
				System.out.println(queue.isEmpty() ? 1 : 0);
			else if(temp.equals("size"))
				System.out.println(queue.size());
			else if(temp.equals("pop"))
				System.out.println(queue.isEmpty() ? -1 : queue.poll());
			else {
				String[] arr = temp.split(" ");
				((LinkedList<Integer>) queue).add(Integer.parseInt(arr[1]));
			}
		}
	}

}
