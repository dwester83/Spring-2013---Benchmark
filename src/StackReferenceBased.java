@SuppressWarnings("rawtypes")
public class StackReferenceBased 
                  implements StackInterface {
  private Node top;
  private int count;

  public StackReferenceBased() {
    top = null; 
    count = 0;
  }  // end default constructor
  
  public boolean isEmpty() {
    return top ==  null;
  }  // end isEmpty

  public void push(Object newItem) {
    top = new Node(newItem, top);
    count++;
  }  // end push
  
  public Object pop() throws StackException {
    if (!isEmpty()) {
      Node temp = top;
      top = top.getNext();
      count--;
      return temp.getItem();
    }
    else {
      throw new StackException("StackException on " +
                               "pop: stack empty");
    }  // end if
  }  // end pop
  
  public void popAll() {
    top = null;
    count = 0;
  }  // end popAll
  
  public Object peek() throws StackException {
    if (!isEmpty()) {
      return top.getItem();
    }
    else {
      throw new StackException("StackException on " +
                               "peek: stack empty");
    }  // end if
  }  // end peek
  
  public int size(){
	  return count;
  }
  
  public void pushTop(Object newItem){
	  push(newItem);
  }
  
  public void pushBottom(Object newItem){
	  StackReferenceBased newStack = new StackReferenceBased();
	  
	  while (count > 0)
		  newStack.push(pop());
	  
	  push(newItem);
	  
	  while (newStack.size() > 0)
		  push(newStack.pop());
  }
  
  public void pushMiddle(Object newItem){
	  StackReferenceBased newStack = new StackReferenceBased();
	  int half = (count / 2);
	  
	  for (int i = 0; i < half;i++)
		  newStack.push(pop());
	  
	  push(newItem);
	  
	  while (newStack.size() > 0)
		  push(newStack.pop());
	  
  }
  
  public Object popTop(){
	  return pop();
  }
  
  public Object popBottom(){
	  StackReferenceBased newStack = new StackReferenceBased();
	  
	  while (count > 0)
		  newStack.push(pop());
	  
	  Object obj = newStack.pop();
	  
	  while (newStack.size() > 0)
		  push(newStack.pop());
	  
	  return obj;
  }
  
  public Object popMiddle(){
	  StackReferenceBased newStack = new StackReferenceBased();
	  int half = (count / 2);
	  
	  for (int i = 0; i < half;i++)
		  newStack.push(pop());
	  
	  Object obj = pop();
	  
	  while (newStack.size() > 0)
		  push(newStack.pop());
	  
	  return obj;
  }
  
  
}  // end StackReferenceBased
