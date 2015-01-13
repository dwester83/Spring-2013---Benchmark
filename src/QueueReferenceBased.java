@SuppressWarnings("rawtypes")
public class QueueReferenceBased implements QueueInterface {
  private Node lastNode;
  private int count;
  
  public QueueReferenceBased() {
    lastNode = null;   
    count = 0;
  }  // end default constructor
  
  // queue operations:
  public boolean isEmpty() {
    return lastNode == null;
  }  // end isEmpty

  public void dequeueAll() {
    lastNode = null;
    count = 0;
  }  // end dequeueAll

  public void enqueue(Object newItem) {
    Node newNode = new Node(newItem);

    // insert the new node
    if (isEmpty()) {
      // insertion into empty queue
      newNode.setNext(newNode);
    }
    else {
      // insertion into nonempty queue
      newNode.setNext(lastNode.getNext());
      lastNode.setNext(newNode);
    }  // end if

    count++;
    
    lastNode = newNode;  // new node is at back
  }  // end enqueue

  public Object dequeue() throws QueueException {
    if (!isEmpty()) {
      // queue is not empty; remove front
      Node firstNode = lastNode.getNext();
      if (firstNode == lastNode) { // special case?
        lastNode = null;           // yes, one node in queue
      }
      else {
        lastNode.setNext(firstNode.getNext());
      }  // end if
      count--;
      return firstNode.getItem();
    }
    else {
      throw new QueueException("QueueException on dequeue:" 
                             + "queue empty");
    }  // end if
  }  // end dequeue

  public Object peek() throws QueueException {
    if (!isEmpty()) {  
      // queue is not empty; retrieve front
      Node firstNode = lastNode.getNext();
      return firstNode.getItem();
    }
    else {
      throw new QueueException("QueueException on peek:" 
                             + "queue empty");
    }  // end if
  }  // end peek
   
  public int size(){
	  return count;
  }
  
  public void enqueueFront(Object newItem){
	  QueueReferenceBased newQueue = new QueueReferenceBased();
	  
	  while (size() > 0)
		  newQueue.enqueue(dequeue());
	  
	  enqueue(newItem);
	  
	  while (newQueue.size() > 0)
		  enqueue(newQueue.dequeue());
  }
  
  public void enqueueBack(Object newItem){
	  enqueue(newItem);
  }
  
  public void enqueueMiddle(Object newItem){
	  QueueReferenceBased newQueue = new QueueReferenceBased();
	  int half = (count/2);
	  
	  for(int i = 0; i < half;i++)
		  newQueue.enqueue(dequeue());
	  
	  newQueue.enqueue(newItem);
	  
	  while (size() > 0)
		  newQueue.enqueue(dequeue());
	  
	  while (newQueue.size() > 0)
		  enqueue(newQueue.dequeue());
  }
  
  public Object dequeueFront() {
	  return dequeue();
  }
  
  public Object dequeueBack() {
	  QueueReferenceBased newQueue = new QueueReferenceBased();
	  
	  while (size() > 1)
		  newQueue.enqueue(dequeue());
	  
	  Object node = dequeue();

	  while (newQueue.size() > 0)
		  enqueue(newQueue.dequeue());
	  
	  return node;
  }
  
  public Object dequeueMiddle() {
	  QueueReferenceBased newQueue = new QueueReferenceBased();
	  int half = count/2;
	  
	  for(int i = 0; i < half;i++)
		  newQueue.enqueue(dequeue());
	  
	  Object node = dequeue();
	  
	  while (size() > 0)
		  newQueue.enqueue(dequeue());
	  
	  while (newQueue.size() > 0)
		  enqueue(newQueue.dequeue());
	  
	  return node;
  }
  
  
  
  
  
  
  
  
} // end QueueReferenceBased
