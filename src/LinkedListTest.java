public class LinkedListTest<T> implements List<T> {

  private Node<T> first;
  private Node<T> last;
  private int size;

  private static class Node<T> {
   private T item;
   private Node<T> next;
   private Node<T> prev;

    Node(Node<T> prev, T element, Node<T> next) {
      this.item = element;
      this.next = next;
      this.prev = prev;
    }
  }

  @Override
  public void add(T value) {
    Node<T> lastNode = last;
    Node<T> newNode = new Node<T>(lastNode, value, null);
    last = newNode;
    if (lastNode == null) {
      first = newNode;
    } else {
      lastNode.next = newNode;
    }
    size++;
  }

  @Override
  public void add(T value, int index) {
    checkExceptionForAdd(index);
    Node<T> prev = null;
    Node<T> next = getNode(index);
    if (index == 0) {
      Node<T> newNode = new Node<>(prev, value, next);
      next.prev = newNode;
      first = newNode;
      size++;
    }
    if (index != 0 & index < size) {
      prev = getNode(index - 1);
      Node<T> newNode = new Node<>(prev, value, next);
      prev.next = newNode;
      next.prev = newNode;
      size++;
    }
    if (index == size) {
      add(value);
    }
  }

  @Override
  public void addAll(List<T> list) {
    for (int i = 0; i < list.size(); i++) {
      T value = list.get(i);
      add(value);
    }
  }

  @Override
  public T get(int index) {
    checkException(index);
    Node stepNode = first;
    Node nextStepNode;
    int searchNode = 0;
    if (index == 0) {
      return first.item;
    }
    if (index == size - 1) {
      return last.item;
    }
    while (searchNode < index) {
      nextStepNode = stepNode.next;
      stepNode = nextStepNode;
      if (searchNode == (index - 1)) {
        return (T) stepNode.item;
      }
      searchNode++;
    }
    return null;
  }

  @Override
  public void set(T value, int index) {
    checkException(index);
    if (index < size) {
      T newValue = value;
      Node<T> getNode = getNode(index);
      getNode.item = newValue;
    }
  }

  @Override
  public T remove(int index) {
    checkException(index);
    T oldElement = get(index);
    if (index == 0) {
      getNode(index).item = null;
      getNode(index + 1).prev = null;
      first = getNode(index + 1);
      size--;
    }
    if (index == size - 1) {
      getNode(index).item = null;
      getNode(index - 1).next = null;
      last = getNode(index - 1);
      size--;
    }
    if (index != 0 & index < size - 1) {
      getNode(index).item = null;
      getNode(index - 1).next = getNode(index + 1);
      getNode(index + 1).prev = getNode(index - 1);
      size--;
    }
    return oldElement;
  }

  @Override
  public T remove(T t) {
    for (int i = 0; i < size(); i++) {
      if (get(i).equals(t)) {
       return remove(i);
      }
    }
    return null;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  private Node<T> getNode(int index) {
    checkException(index);
    Node stepNode = first;
    Node nextStepNode;
    int searchNode = 0;
    if (index == 0) {
      return first;
    }
    if (index == size - 1) {
      return last;
    }
    while (searchNode < index) {
      nextStepNode = stepNode.next;
      stepNode = nextStepNode;
      if (searchNode == (index - 1)) {
        return stepNode;
      }
      searchNode++;
    }
    return null;
  }

  private void checkException(int index) {
    if (index >= size || index < 0) {
      try {
        throw new ArrayException("ArrayIndexOutOfBoundsException");
      } catch (ArrayException e) {
        e.printStackTrace();
      }
    }
  }

  private void checkExceptionForAdd(int index) {
    if (index > size || index < 0) {
      try {
        throw new ArrayException("ArrayIndexOutOfBoundsException");
      } catch (ArrayException e) {
        e.printStackTrace();
      }
    }
  }
}
