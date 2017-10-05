import java.util.PriorityQueue;
public class PriorQ {

	public static void main(String[] args) {
		PriorityQueue<String> p = new PriorityQueue<String>();
		PriorityQueue<String> q = new PriorityQueue<String>();
		p.add("George");
		p.add("Jim");
		p.add("John");
		p.add("Blake");
		p.add("Kevin");
		p.add("Michael");
		q.add("George");
		q.add("Katie");
		q.add("Michelle");
		q.add("Ryan");
		q.add("Kevin");
		System.out.println(p);
		System.out.println(q);
		System.out.println("Intersection");
		PriorityQueue<String> test = new PriorityQueue<String>();
		while(!q.isEmpty()) {
			if (p.contains(q.peek()))
				test.offer(q.poll());
			else {
				q.poll();
			}
		}
		System.out.println(test);
		q.add("George");
		q.add("Katie");
		q.add("Michelle");
		q.add("Ryan");
		q.add("Kevin");
		System.out.println("\n");
		System.out.println(p);
		System.out.println(q);
		System.out.println("Union");
		test = p;
		while(!q.isEmpty()) {
			if (p.contains(q.peek())) {
				test.offer(q.peek());
				test.remove(q.poll());
			}
			else {
				test.offer(q.poll());
			}
		}
		System.out.println(test);
		p.clear();
		q.clear();
		p.add("George");
		p.add("Jim");
		p.add("John");
		p.add("Blake");
		p.add("Kevin");
		p.add("Michael");
		q.add("George");
		q.add("Katie");
		q.add("Michelle");
		q.add("Ryan");
		q.add("Kevin");
		System.out.println("\n");
		System.out.println(p);
		System.out.println(q);
		test = p;

		System.out.println("Difference");
		while(!q.isEmpty()) {
			if (p.contains(q.peek())) {
				test.remove(q.poll());
			}
			else {
				test.offer(q.poll());
			}
		}
		System.out.println(test);
	}
}
