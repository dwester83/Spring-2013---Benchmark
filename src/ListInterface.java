// ********************************************************
// Interface ListInterface for the ADT list.
// *********************************************************
public interface ListInterface<T> {
  public boolean isEmpty();
  public int size();
  public void add(int index, Object item) 
                  throws ListIndexOutOfBoundsException,
                         ListException;
  public Object get(int index) 
                  throws ListIndexOutOfBoundsException;
  public void remove(int index) 
                  throws ListIndexOutOfBoundsException;
  public void removeAll();
  
  public void reverseIterative();
  public void reverseRecursive();
}  // end ListInterface

