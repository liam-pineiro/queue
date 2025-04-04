package priorityQueue;

public class PriorityQueue<E> {
	private Object[] queues;
	int numPriorities;
		
	public PriorityQueue(int size){

		// create an array of queues of specified size
		queues =  new Object[size];
		
		// initialize the queues
		for (int i=size-1; i>=0; i--)
			queues[i] =  new ArrayQueue<E>();
		
		numPriorities = size;
			
	}
	
	public void add(E item, int priority) {
		ArrayQueue<E> queue; 
		queue = (ArrayQueue<E>) queues[priority];
		queue.add(item);
	}
	

	public E remove() {
		int priority = numPriorities-1;
		// find the highest priority non-empty queue
		ArrayQueue<E> queue;
		queue = (ArrayQueue<E>) queues[priority];
		while (queue.isEmpty()) {
			priority--;
			queue = (ArrayQueue<E>) queues[priority];
		}
			
		if (priority>=0)
		    return (E) queue.remove();	
		else return null;
	}

}
