package myproject;

import java.util.LinkedList;
import java.util.Queue;

public class myclass {
	
		public static void main(String[] args) {
			Queue<Integer> q= new LinkedList<>();
		
			q.add(12);
			q.add(13);
			q.add(15);
			System.out.println(q);
			q.remove(1);
		int a =q.size();
		System.out.println(a);
		//	System.out.println(q);
			
		}
}

