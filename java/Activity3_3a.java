package automationFramework;
import java.util.*;


public class Activity3_3a {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		 //Display contents of the queue. 
        System.out.println("Elements in queue: " + q);
// To Remove element from queue
        int removeEle = q.remove();
        System.out.println("removed element: " + removeEle);
        
      //To view the head of queue
        int headEle = q.peek();
        System.out.println("head of queue: " + headEle);
 
        int size = q.size();
        System.out.println("Size of queue: " + size);
	}

}
