

class QueueException extends RuntimeException{    
	public QueueException(String err) {
		super(err);
	}
}

public class Queue {
	private int f; // front of queue
	private int r; // rear of queue
	private int capacity;
    private Object[] Q;
    private static int MAX = 100; 

    public Queue(int capacity){
       this.capacity = capacity;
       Q =  new Object[capacity];
       f = 0;
       r = 0;
    } 

    public Queue(){
       this(MAX);
    }

    public int size(){
        return (capacity - f + r) % capacity;
    }
    public boolean isEmpty(){
        return (f==r);
    }

    public Object front() throws QueueException {
    	// if queue is empty, throw QueueException
        
        // else return Object at front of array Q
        return null; /* TODO */
     }

    public Object dequeue() throws QueueException {
    	// if queue is empty, throw QueueException
       
    	// get Object at front of array Q
        Object tmp = null; /* TODO */
        
        // set value at position f to null in array Q

        // increment f with wrap around
        f = f; /* TODO */
        
        // return the value that was at the front of the queue
        return null; /* TODO */
    }
    
    public void enqueue(Object e) throws QueueException {
    	// check that current size won't == capacity-1
    	// If it would, throw a QueueException
       
    	// else, add the object to the rear of the array Q
        
    	// increment r with wrap around
        r = r; /* TODO */
    }

	public String toString(){
		StringBuffer buf = new StringBuffer("[");
		if(size() > 0)
			buf.append(Q[f]);
		for(int i = 1; i < size();i++){
			buf.append(", " + Q[f + i % capacity]);
		}
		buf.append("]");
		return buf.toString();
	}
}
