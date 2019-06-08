public class ArrayListTest<T> implements List<T> {

  private T[] arrayList;
  private int arraySize;
  private static final int DEFAULT_CAPACITY = 10;

  public ArrayListTest() {
    arrayList = (T[]) new Object[DEFAULT_CAPACITY];
  }

  public ArrayListTest(int initialCapacity) {
    if (initialCapacity > 0) {
      arrayList = (T[]) new Object[initialCapacity];
    } else if (initialCapacity == 0) {
      arrayList = (T[]) new Object[DEFAULT_CAPACITY];
    }
  }

  @Override
  public void add(T value) {
    if (arrayList.length == arraySize) {
      changeSizeArray();
    }
    arrayList[arraySize++] = value;
  }

  @Override
  public void add(T value, int index) {
    checkExceptionForAdd(index);
    if (index < size()) {
      System.arraycopy(arrayList, index, arrayList, index + 1, arrayList.length - index - 1);
      arrayList[index] = value;
      arraySize++;
    }
    if (index == size()) {
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
    return arrayList[index];
  }

  @Override
  public void set(T value, int index) {
    checkException(index);
    if (index < size()) {
      arrayList[index] = value;
    }
    if (index == size()) {
      add(value);
    }
  }

  @Override
  public T remove(int index) {
    checkException(index);
    T oldElement = arrayList[index];
    int copyLength = arraySize - index - 1;
    System.arraycopy(arrayList, index + 1, arrayList, index, copyLength);
    arrayList[--arraySize] = null;
    return oldElement;
  }

  @Override
  public T remove(T t) {
    T oldElement = null;
    for (int i = 0; i < size(); i++) {
      if (arrayList[i].equals(t)) {
        oldElement = arrayList[i];
        remove(i);
        break;
      }
    }
    return oldElement;
  }

  @Override
  public int size() {
    return arraySize;
  }

  @Override
  public boolean isEmpty() {
    return arraySize == 0;
  }

  private void changeSizeArray() {
    int oldCapacity = arrayList.length;
    int newCapacity = oldCapacity + (oldCapacity >> 1);
    T[] tempArrayList = (T[]) new Object[newCapacity];
    System.arraycopy(arrayList, 0, tempArrayList, 0, oldCapacity);
    arrayList = tempArrayList;
  }

  private void checkException(int index) {
    if (index >= arraySize || index < 0) {
      try {
        throw new ArrayException("ArrayIndexOutOfBoundsException");
      } catch (ArrayException e) {
        e.printStackTrace();
      }
    }
  }

  private void checkExceptionForAdd(int index) {
    if (index > arraySize || index < 0) {
      try {
        throw new ArrayException("ArrayIndexOutOfBoundsException");
      } catch (ArrayException e) {
        e.printStackTrace();
      }
    }
  }
}
