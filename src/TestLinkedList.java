public class TestLinkedList {
  @SuppressWarnings({ "unchecked", "unused" })
static public void main(String[] args) {
    ListReferenceBased myList = new ListReferenceBased();
    MyListIterator<Integer> iterList = new MyListIterator<Integer>(myList);
    
    //Making a list of numbers (Starting with 200)
    for (int i=1; i <= 20; i++) {
        myList.add(new Integer(i), i);
      } // end for
    
    //Showing a normal list.
    iterList = new MyListIterator<Integer>(myList);
    while (iterList.hasNext())
    	System.out.println("Normal - " + iterList.next());
    
    //Reversing it Iterative
    myList.reverseIterative();
    iterList = new MyListIterator<Integer>(myList);
    while (iterList.hasNext())
    	System.out.println("Reverse Iterative - " + iterList.next());
    
    //Reversing it back to normal with recursive
    myList.reverseRecursive();
    iterList = new MyListIterator<Integer>(myList);
    while (iterList.hasNext())
    	System.out.println("Reverse Recursive - " + iterList.next());
    
    System.out.println("//////////////////////////////////////////////////////");
    
    //Clearing the list and going to time it with 1.
    myList.removeAll();
    for (int i=1; i <= 1; i++) {
        myList.add(new Integer(i), i);
      }
    
    //Timer for iteration
    long startTime = System.nanoTime();
    myList.reverseIterative();
    long iterationTime = System.nanoTime() - startTime;
    
    //Timer of recursive
    startTime = System.nanoTime();
    myList.reverseRecursive();
    long recursiveTime = System.nanoTime() - startTime;
    
    System.out.println("With a value of " + myList.size() + " item in the list."
    		+ "\nIterative time was: " + iterationTime + "\nRecursive time was: " + recursiveTime);
    
    
    System.out.println("//////////////////////////////////////////////////////");
    
    //Clearing the list and going to time it with 2.
    myList.removeAll();
    for (int i=1; i <= 2; i++) {
        myList.add(new Integer(i), i);
      }
    
    //Timer for iteration
    startTime = System.nanoTime();
    myList.reverseIterative();
    iterationTime = System.nanoTime() - startTime;
    
    //Timer of recursive
    startTime = System.nanoTime();
    myList.reverseRecursive();
    recursiveTime = System.nanoTime() - startTime;
    
    System.out.println("With a value of " + myList.size() + " item in the list."
    		+ "\nIterative time was: " + iterationTime + "\nRecursive time was: " + recursiveTime);
    
    
    System.out.println("//////////////////////////////////////////////////////");
    
    //Clearing the list and going to time it with 100.
    myList.removeAll();
    for (int i=1; i <= 100; i++) {
        myList.add(new Integer(i), i);
      }
    
    //Timer for iteration
    startTime = System.nanoTime();
    myList.reverseIterative();
    iterationTime = System.nanoTime() - startTime;
    
    //Timer of recursive
    startTime = System.nanoTime();
    myList.reverseRecursive();
    recursiveTime = System.nanoTime() - startTime;
    
    System.out.println("With a value of " + myList.size() + " item in the list."
    		+ "\nIterative time was: " + iterationTime + "\nRecursive time was: " + recursiveTime);
    
    
    System.out.println("//////////////////////////////////////////////////////");
    
    //Clearing the list and going to time it with 1000.
    myList.removeAll();
    for (int i=1; i <= 1000; i++) {
        myList.add(new Integer(i), i);
      }
    
    //Timer for iteration
    startTime = System.nanoTime();
    myList.reverseIterative();
    iterationTime = System.nanoTime() - startTime;
    
    //Timer of recursive
    startTime = System.nanoTime();
    myList.reverseRecursive();
    recursiveTime = System.nanoTime() - startTime;
    
    System.out.println("With a value of " + myList.size() + " item in the list."
    		+ "\nIterative time was: " + iterationTime + "\nRecursive time was: " + recursiveTime);
    
    System.out.println("//////////////////////////////////////////////////////");
    
    //Clearing the list and going to time it with 5000.
    myList.removeAll();
    for (int i=1; i <= 5000; i++) {
        myList.add(new Integer(i), i);
      }
    
    //Timer for iteration
    startTime = System.nanoTime();
    myList.reverseIterative();
    iterationTime = System.nanoTime() - startTime;
    
    //Timer of recursive
    startTime = System.nanoTime();
    myList.reverseRecursive();
    recursiveTime = System.nanoTime() - startTime;
    
    System.out.println("With a value of " + myList.size() + " item in the list."
    		+ "\nIterative time was: " + iterationTime + "\nRecursive time was: " + recursiveTime);
    
    System.out.println("//////////////////////////////////////////////////////");
    
    //Clearing the list and going to time it with 8000.
    myList.removeAll();
    for (int i=1; i <= 8000; i++) {
        myList.add(new Integer(i), i);
      }
    
    //Timer for iteration
    startTime = System.nanoTime();
    myList.reverseIterative();
    iterationTime = System.nanoTime() - startTime;
    
    //Timer of recursive
    startTime = System.nanoTime();
    myList.reverseRecursive();
    recursiveTime = System.nanoTime() - startTime;
    
    System.out.println("With a value of " + myList.size() + " item in the list."
    		+ "\nIterative time was: " + iterationTime + "\nRecursive time was: " + recursiveTime);
    
    System.out.println("//////////////////////////////////////////////////////");
    
    
    //PART 2 PART 2 PART 2 PART 2 PART 2 PART 2 PART 2 PART 2 PART 2 PART 2 
    
    System.out.println("////////////////Start of List testing/////////////////");
    
    //Clearing the list adding the 5000 items to be added to the front.
    //Linked List
    myList.removeAll();
    
    startTime = System.nanoTime();
    for (int i=1; i <= 5000; i++) {
        myList.addFirst(i);
    }
    long time = System.nanoTime() - startTime;
    
    System.out.println("With a value of " + myList.size() + " item in the linked list adding to the front."
    		+ "\nLinked List time was " + time);
    
    System.out.println("//////////////////////////////////////////////////////");
    
    
    
    //Clearing the list adding the 5000 items to be added to the end.
    //Linked List
    myList.removeAll();
    
    startTime = System.nanoTime();
    for (int i=1; i <= 5000; i++) {
        myList.addLast(i);
    }
    time = System.nanoTime() - startTime;
    
    System.out.println("With a value of " + myList.size() + " item in the linked list adding to the end."
    		+ "\nLinked List time was " + time);
    
    System.out.println("//////////////////////////////////////////////////////");
    
    
    
    
    //Clearing the list adding the 5000 items to be added to the middle.
    //Linked List
    myList.removeAll();
    
    startTime = System.nanoTime();
    for (int i=1; i <= 5000; i++) {
        myList.addMiddle(i);
    }
    time = System.nanoTime() - startTime;
    
    System.out.println("With a value of " + myList.size() + " item in the linked list adding to the middle."
    		+ "\nLinked List time was " + time);
    
    System.out.println("//////////////////////////////////////////////////////");
    
    
    
    //Clearing the list adding the 5000 items to be added to the front, then removing 5000 of them from the start.
    //Linked List
    myList.removeAll();
    for (int i=1; i <= 5000; i++) {
        myList.addFirst(i);
    }
    
    startTime = System.nanoTime();
    for (int i=1; i <= 5000; i++) {
        myList.removeFirst();
    }
    time = System.nanoTime() - startTime;
    
    System.out.println("With a value of " + "5000" + " items in the linked list removed from the front."
    		+ "\nLinked List time was " + time);
    
    System.out.println("//////////////////////////////////////////////////////");
    
    
    //Clearing the list adding the 5000 items to be added to the front, then removing 5000 of them from the end.
    //Linked List
    myList.removeAll();
    for (int i=1; i <= 5000; i++) {
        myList.addFirst(i);
    }
    
    startTime = System.nanoTime();
    for (int i=1; i <= 5000; i++) {
        myList.removeLast();
    }
    time = System.nanoTime() - startTime;
    
    System.out.println("With a value of " + "5000" + " items in the linked list removed from the end."
    		+ "\nLinked List time was " + time);
    
    System.out.println("//////////////////////////////////////////////////////");
    
    
    //Clearing the list adding the 5000 items to be added to the front, then removing 5000 of them from the middle.
    //Linked List
    myList.removeAll();
    for (int i=1; i <= 5000; i++) {
        myList.addFirst(i);
    }
    
    startTime = System.nanoTime();
    for (int i=1; i <= 5000; i++) {
        myList.removeMiddle();
    }
    time = System.nanoTime() - startTime;
    
    System.out.println("With a value of " + "5000" + " items in the linked list removed from the middle."
    		+ "\nLinked List time was " + time);
    
    System.out.println("//////////////////////////////////////////////////////");
    
    
    //Clearing the list adding the 5000 items to be added to the front, then iterate through it from the start.
    //Linked List
    myList.removeAll();
    for (int i=1; i <= 5000; i++) {
        myList.addFirst(i);
    }
    
    iterList = new MyListIterator<Integer>(myList);
    startTime = System.nanoTime();
    while (iterList.hasNext())
    //	System.out.println("Normal - " + iterList.next());
    	iterList.next();
    time = System.nanoTime() - startTime;
    
    System.out.println("With a value of " + myList.size() + " items in the linked list iterated from the front."
    		+ "\nLinked List time was " + time);
    
    System.out.println("//////////////////////////////////////////////////////");
    
    
    //Iterate through it from the last.
    //Linked List
    
    iterList = new MyListIterator<Integer>(myList);
    iterList.setLoc(myList.size());
    startTime = System.nanoTime();
    while (iterList.hasPrevious())
    //	System.out.println("Normal - " + iterList.previous());
    	iterList.previous();
    time = System.nanoTime() - startTime;
    
    System.out.println("With a value of " + myList.size() + " items in the linked list iterated from end."
    		+ "\nLinked List time was " + time);
    
    System.out.println("//////////////////////////////////////////////////////");
    
    
    //Stack Test Stack Test Stack Test Stack Test Stack Test Stack Test Stack Test Stack Test
    StackReferenceBased myStack = new StackReferenceBased();
    MyStackIterator<Integer> iterStack = new MyStackIterator<Integer>(myStack);
    
    System.out.println("////////////////Start of Stack testing////////////////");
    
    myStack.popAll();
    startTime = System.nanoTime();
    for (int i=1; i <= 5000; i++) {
        myStack.pushTop(i);
    }
    time = System.nanoTime() - startTime;
    
    System.out.println("With a value of " + myStack.size() + " item in the stack adding to the top."
    		+ "\nStack time was " + time);
    
    System.out.println("//////////////////////////////////////////////////////");
    
    myStack.popAll();
    startTime = System.nanoTime();
    for (int i=1; i <= 5000; i++) {
        myStack.pushBottom(i);
    }
    time = System.nanoTime() - startTime;
    
    System.out.println("With a value of " + myStack.size() + " item in the stack adding to the bottom."
    		+ "\nStack time was " + time);
    
    System.out.println("//////////////////////////////////////////////////////");
    
    myStack.popAll();
    startTime = System.nanoTime();
    for (int i=1; i <= 5000; i++) {
        myStack.pushMiddle(i);
    }
    time = System.nanoTime() - startTime;
    
    System.out.println("With a value of " + myStack.size() + " item in the stack adding to the middle."
    		+ "\nStack time was " + time);
    
    System.out.println("//////////////////////////////////////////////////////");
    
    
    //Removing Items from the top, bottom and middle of a stack.
    
    myStack.popAll();
    for (int i=1; i <= 5000; i++) {
        myStack.push(i);
    }
    
    startTime = System.nanoTime();
    for (int i=1; i <= 5000; i++) {
        myStack.popTop();
    }
    time = System.nanoTime() - startTime;
    
    System.out.println("With a value of " + "5000" + " item in the stack removing from the top."
    		+ "\nStack time was " + time);
    
    System.out.println("//////////////////////////////////////////////////////");
    
    myStack.popAll();
    for (int i=1; i <= 5000; i++) {
        myStack.push(i);
    }
    
    startTime = System.nanoTime();
    for (int i=1; i <= 5000; i++) {
        myStack.popBottom();
    }
    time = System.nanoTime() - startTime;
    
    System.out.println("With a value of " + "5000" + " item in the stack removing from the bottom."
    		+ "\nStack time was " + time);
    
    System.out.println("//////////////////////////////////////////////////////");
    
    
    myStack.popAll();
    for (int i=1; i <= 5000; i++) {
        myStack.push(i);
    }
    
    startTime = System.nanoTime();
    for (int i=1; i <= 5000; i++) {
        myStack.popMiddle();
    }
    time = System.nanoTime() - startTime;
    
    System.out.println("With a value of " + "5000" + " item in the stack removing from the middle."
    		+ "\nStack time was " + time);
    
    System.out.println("//////////////////////////////////////////////////////");
    
    
    //Iteration of a stack
    
    iterStack = new MyStackIterator<Integer>(myStack);
    
    myStack.popAll();
    for (int i=1; i <= 5000; i++) {
        myStack.push(i);
    }
    
    iterStack = new MyStackIterator<Integer>(myStack);

    
    startTime = System.nanoTime();
    while (iterList.hasNext())
    //	System.out.println("Normal - " + iterList.next());
    	iterList.next();
    time = System.nanoTime() - startTime;
    
    
    System.out.println("With a value of " + myStack.size() + " item in the stack iteration from the top."
    		+ "\nStack time was " + time);
    
    System.out.println("//////////////////////////////////////////////////////");
    
    iterStack = new MyStackIterator<Integer>(myStack);
    iterList.setLoc(myList.size());
    
    startTime = System.nanoTime();
    while (iterList.hasPrevious())
    //	System.out.println("Normal - " + iterList.previous());
    	iterList.previous();
    time = System.nanoTime() - startTime;
    
    
    System.out.println("With a value of " + myStack.size() + " item in the stack iteration from the bottom."
    		+ "\nStack time was " + time);
    
    System.out.println("//////////////////////////////////////////////////////");
    
    
    //Queue Test Queue Test Queue Test Queue Test Queue Test Queue Test Queue Test 
    
    QueueReferenceBased myQueue = new QueueReferenceBased();
    MyQueueIterator<Integer> iterQueue = new MyQueueIterator<Integer>(myQueue);
    
    System.out.println("////////////////Start of Queue testing////////////////");
    
    myQueue.dequeueAll();
    startTime = System.nanoTime();
    for (int i=1; i <= 5000; i++) {
    	myQueue.enqueueFront(i);
    }
    time = System.nanoTime() - startTime;
    
    System.out.println("With a value of " + myQueue.size() + " item in the queue adding to the front."
    		+ "\nQueue time was " + time);
    
    System.out.println("//////////////////////////////////////////////////////");
    
    myQueue.dequeueAll();
    startTime = System.nanoTime();
    for (int i=1; i <= 5000; i++) {
    	myQueue.enqueueBack(i);
    }
    time = System.nanoTime() - startTime;
    
    System.out.println("With a value of " + myQueue.size() + " item in the queue adding to the back."
    		+ "\nQueue time was " + time);
    
    System.out.println("//////////////////////////////////////////////////////");
    
    myQueue.dequeueAll();
    startTime = System.nanoTime();
    for (int i=1; i <= 5000; i++) {
    	myQueue.enqueueMiddle(i);
    }
    time = System.nanoTime() - startTime;
    
    System.out.println("With a value of " + myQueue.size() + " item in the queue adding to the middle."
    		+ "\nQueue time was " + time);
    
    System.out.println("//////////////////////////////////////////////////////");
    
    
    //Removing Items from the front, back, and middle of a queue.
    
    myQueue.dequeueAll();
    for (int i=1; i <= 5000; i++) {
    	myQueue.enqueue(i);
    }
    
    startTime = System.nanoTime();
    for (int i=1; i <= 5000; i++) {
    	myQueue.dequeueFront();
    }
    time = System.nanoTime() - startTime;
    
    System.out.println("With a value of " + "5000" + " item in the queue removing from the front."
    		+ "\nQueue time was " + time);
    
    System.out.println("//////////////////////////////////////////////////////");
    
    myQueue.dequeueAll();
    for (int i=1; i <= 5000; i++) {
    	myQueue.enqueue(i);
    }
    
    startTime = System.nanoTime();
    for (int i=1; i <= 5000; i++) {
    	myQueue.dequeueBack();
    }
    time = System.nanoTime() - startTime;
    
    System.out.println("With a value of " + "5000" + " item in the queue removing from the bottom."
    		+ "\nQueue time was " + time);
    
    System.out.println("//////////////////////////////////////////////////////");
    
    
    myQueue.dequeueAll();
    for (int i=1; i <= 5000; i++) {
    	myQueue.enqueue(i);
    }
    
    startTime = System.nanoTime();
    for (int i=1; i <= 5000; i++) {
    	myQueue.dequeueMiddle();
    }
    time = System.nanoTime() - startTime;
    
    System.out.println("With a value of " + "5000" + " item in the queue removing from the middle."
    		+ "\nQueue time was " + time);
    
    System.out.println("//////////////////////////////////////////////////////");
    
    
    //Iteration of a queue
    /*
    iterQueue = new MyQueueIterator<Integer>(myQueue);
    
    myQueue.dequeueAll();
    for (int i=1; i <= 5000; i++) {
    	myQueue.enqueue(i);
    }
    
    iterQueue = new MyQueueIterator<Integer>(myQueue);

    
    startTime = System.nanoTime();
    while (iterQueue.hasNext())
    	System.out.println("Queue Normal - " + iterQueue.next());
    //	iterList.next();
    time = System.nanoTime() - startTime;
    
    
    System.out.println("With a value of " + myQueue.size() + " item in the queue iteration from the Front."
    		+ "\nQueue time was " + time);
    
    System.out.println("//////////////////////////////////////////////////////");
    
    iterQueue = new MyQueueIterator<Integer>(myQueue);
    iterList.setLoc(myList.size());
    
    startTime = System.nanoTime();
    while (iterList.hasPrevious())
    //	System.out.println("Normal - " + iterList.previous());
    //	iterList.previous();
    time = System.nanoTime() - startTime;
    
    
    System.out.println("With a value of " + myQueue.size() + " item in the stack iteration from the bottom."
    		+ "\nQueue time was " + time);
    
    System.out.println("//////////////////////////////////////////////////////");
    
    */
    
  } // end main
} // end TestLinkedList
