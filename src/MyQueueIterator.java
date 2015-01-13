public class MyQueueIterator <T>
                implements java.util.ListIterator <T> {
  private QueueInterface<T> list;
  private int loc; // location of iterator in list

  public MyQueueIterator(QueueInterface<T> list) {
    this.list = list;
    loc = 0;
  }  // end constructor

  public void add(T item) {
  // Inserts the specified element into the list.
  // The element is inserted immediately before 
  // the next element that would be returned by next, if  
  // any, and after the next element that would be returned 
  // by previous, if any. If the list contains no elements, 
  // the new element becomes the sole element on the list. 
  // The new element is inserted before the implicit cursor: 
  // a subsequent call to next would be unaffected, and a 
  // subsequent call to previous would return the new 
  // element. (This call increases by 1 the value that 
  // would be returned by a call to nextIndex or 
  // previousIndex.)
    list.enqueue(item);
    setLoc(nextIndex()+1);
  }  // end add   

  public boolean hasNext() { 
  // Returns true if this list iterator has more
  // elements when traversing the list in the forward
  // direction.
    return (loc < list.size());
  }  // end hasNext

  public boolean hasPrevious() { 
  // Returns true if this list iterator has more
  // elements when traversing the list in the reverse
  // direction.
    return (loc > 0);
  }  // end hasPrevious

  public T next() throws java.util.NoSuchElementException {
  // Returns the next element in the list.
    if (hasNext()) {
      @SuppressWarnings("unchecked")
	T item = (T) list.dequeue();
      loc++;
      return item;
    }
    else {
      throw new java.util.NoSuchElementException();
    }  // end if
  }  // end next

  public int nextIndex() { 
  // Returns the index of the element that would be
  // returned by a subsequent call to next. Returns 
  // list size if the list iterator is at the end of 
  // the list.
    return loc;
  }  // end nextIndex

  @SuppressWarnings("unchecked")
public T previous() throws java.util.NoSuchElementException {
  // Returns the previous element in the list.
    if (hasPrevious()) {
      T item = (T) list.dequeue();
      loc--;
      return item;
    }
    else {
      throw new java.util.NoSuchElementException();
    }  // end if
  }  // end previous

  public int previousIndex() { 
  // Returns the index of the element that would be
  // returned by a subsequent call to previous.
  // Returns -1 if the list iterator is at the 
  // beginning of the list.
    return loc-1;
  }  // end previousIndex

  public void remove() throws UnsupportedOperationException {
  // Removes from the underlying collection the last element 
  // returned by the iterator (optional operation).
    // See Programming Problem 8.
    throw new UnsupportedOperationException();
  }  // end remove

  public void set(T item) throws UnsupportedOperationException {
  // Replaces the last element returned by next or
  // previous with the specified element (optional
  // operation).
    // See Programming Problem 8.
     throw new UnsupportedOperationException();
  }  // end set

  @SuppressWarnings("unchecked")
protected ListInterface<T> getList() {
  // This method may be needed by subclasses to access
  // the private data field list.
    return (ListInterface<T>) list;
  }  // end getList

  protected void setLoc(int newLoc) {
  // This method may be needed by subclasses to set
  // the private data field loc.  The method nextIndex
  // can be used to get the loc value.
    loc = newLoc;
  }  // end setLoc
  
}  // end MyListIterator