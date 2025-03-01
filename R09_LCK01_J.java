private int count = 0;
private final Integer Lock = new Integer(count); // Boxed primitive Lock is shared
 
public void doSomething() {
  synchronized (Lock) {
    count++;
    // ...
  }
}
