// ****************************************************
// Reference-based implementation of ADT list.
// ****************************************************
@SuppressWarnings("rawtypes")
public class ListReferenceBased implements ListInterface {
  // reference to linked list of items
  private Node head; 
  private int numItems; // number of items in list

  public ListReferenceBased() {
    numItems = 0;
    head = null;
  }  // end default constructor

  public boolean isEmpty() {
    return numItems == 0;
  }  // end isEmpty

  public int size() {
    return numItems;
  }  // end size

  private Node find(int index) {
  // --------------------------------------------------
  // Locates a specified node in a linked list.
  // Precondition: index is the number of the desired
  // node. Assumes that 1 <= index <= numItems+1
  // Postcondition: Returns a reference to the desired 
  // node.
  // --------------------------------------------------
    Node curr = head;
    for (int skip = 1; skip < index; skip++) {
      curr = curr.getNext();
    } // end for
    return curr;
  } // end find

  public Object get(int index) 
                throws ListIndexOutOfBoundsException {
    if (index >= 1 && index <= numItems) {
      // get reference to node, then data in node
      Node curr = find(index);
      Object dataItem = curr.getItem();
      return dataItem;
    } 
    else {
      throw new ListIndexOutOfBoundsException(
                "List index out of bounds on get");
    } // end if
  } // end get

  public void add(int index, Object item)
                  throws ListIndexOutOfBoundsException {
    if (index >= 1 && index <= numItems+1) {
      if (index == 1) {
        // insert the new node containing item at
        // beginning of list
        Node newNode = new Node(item, head);
        head = newNode;
      } 
      else {
        Node prev = find(index-1);
        // insert the new node containing item after 
        // the node that prev references
        Node newNode = new Node(item, prev.getNext());
        prev.setNext(newNode);
      } // end if
      numItems++;
    } 
    else {
      throw new ListIndexOutOfBoundsException(
                "List index out of bounds on add");
    } // end if
  }  // end add

  public void remove(int index) 
                     throws ListIndexOutOfBoundsException {
    if (index >= 1 && index <= numItems) {
      if (index == 1) {
        // delete the first node from the list
        head = head.getNext();
      } 
      else {
        Node prev = find(index-1);
        // delete the node after the node that prev
        // references, save reference to node
        Node curr = prev.getNext(); 
        prev.setNext(curr.getNext());
      } // end if
      numItems--;
    } // end if
    else {
      throw new ListIndexOutOfBoundsException(
                "List index out of bounds on remove");
    } // end if
  }   // end remove

  public void removeAll() {
    // setting head to null causes list to be
    // unreachable and thus marked for garbage 
    // collection
    head = null;
    numItems = 0;
  } // end removeAll

public void reverseIterative() {
	
	Node prev = null;
	Node next = head.getNext();
	Node current = head;
	
	while (next != null) {
		next = current.getNext();
		current.setNext(prev);
		prev = current;
		current = next;
	}
	head = prev;
}

public void reverseRecursive() {
	reverseRecursiveNode(null, head);	
}

private Node reverseRecursiveNode(Node prev, Node current){
	
	if (current == null)
		return prev;
	
	Node next = current.getNext();
	current.setNext(prev);
	head = current;
	
	return reverseRecursiveNode(current, next);
	
}

public void addFirst(Object item){
	add(1, item);
}

public void addLast(Object item){
	add((numItems + 1), item);
}

public void addMiddle(Object item){
	add((((numItems) / 2) + 1), item);
}

public void removeFirst(){
	remove(1);
}

public void removeLast(){
	remove(numItems);
}

public void removeMiddle(){
	remove((numItems / 2) + 1);
}




} // end ListReferenceBased