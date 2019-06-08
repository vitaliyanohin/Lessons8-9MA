public class Application {

  public static void main(String[] args) {
    ArrayListTest<Integer> arrayListTest = new ArrayListTest<>();
    ArrayListTest<Integer> arrayListTest2 = new ArrayListTest<>(2);
    arrayListTest2.add(2);
    arrayListTest2.add(3);
    for (int i = 0; i < 11; i++) {
      arrayListTest.add(i);
    }
    for (int i = 0; i < arrayListTest.size(); i++) {
      System.out.println(arrayListTest.get(i));
    }
    System.out.println("________________");
    System.out.println(arrayListTest.size());
    arrayListTest.add(10);
    for (int i = 0; i < arrayListTest.size(); i++) {
      System.out.println(arrayListTest.get(i));
    }
    System.out.println(arrayListTest.isEmpty());
  }
}
