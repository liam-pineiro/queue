package priorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> priorityQueue = new PriorityQueue<String>(4);
		
		priorityQueue.add("Ginger Snap", 0);
		priorityQueue.add("Natalie Attired", 3);
		priorityQueue.add("Emanual Transmission", 2);
		priorityQueue.add("Gene Pool", 3);
		priorityQueue.add("Kay Sera", 2);
		
		for (int i=0;i<5;i++) {
		   String name = priorityQueue.remove();
		   System.out.println(name);
		}
	}

}
