package class02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

//덱
/*•push_front X: 정수 X를 덱의 앞에 넣는다.
•push_back X: 정수 X를 덱의 뒤에 넣는다.
•pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
•pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
•size: 덱에 들어있는 정수의 개수를 출력한다.
•empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
•front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
•back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
*/
public class Code_10866 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); 
        int num = Integer.parseInt(buffer.readLine()); 

        Deque<Integer> queue = new LinkedList<>();

		for(int i=0; i<num; ++i) {
			String temp = buffer.readLine();
		    if (temp.equals("push_front"))
		    	System.out.println(deque.peek() == null ? -1: queue.peek()); = buffer.readLine();
			else if(temp.equals("push_back"))
				System.out.println(queue.peek() == null ? -1: queue.peek());
			else if(temp.equals("pop_front"))
				System.out.println(((LinkedList<Integer>) queue).peekLast() == null ? -1 : ((LinkedList<Integer>) queue).peekLast());
		    else if(temp.equals("pop_back"))
				System.out.println(((LinkedList<Integer>) queue).peekLast() == null ? -1 : ((LinkedList<Integer>) queue).peekLast());
			else if(temp.equals("size"))
				System.out.println(queue.size());
		    else if(temp.equals("empty"))
				System.out.println(queue.isEmpty() ? 1 : 0);
			else if(temp.equals("font"))
				System.out.println(queue.isEmpty() ? -1 : queue.poll());
			else if(temp.equals("back"))
				System.out.println(queue.isEmpty() ? -1 : queue.poll());
			else {
				String[] arr = temp.split(" ");
				((LinkedList<Integer>) queue).add(Integer.parseInt(arr[1]));
			}
		}
	}

}
