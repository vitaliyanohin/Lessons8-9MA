public class Application {

  public static void main(String[] args) {
    ArrayListTest<Integer> arrayListTestOne = new ArrayListTest<>();
    ArrayListTest<Integer> arrayListTestTwo = new ArrayListTest<>(2);
    arrayListTestTwo.add(2);
    arrayListTestTwo.add(3);
    for (int i = 0; i < 11; i++) {
      arrayListTestOne.add(i);
    }
    for (int i = 0; i < arrayListTestOne.size(); i++) {
      System.out.println(arrayListTestOne.get(i));
    }
    System.out.println("________________");
    System.out.println(arrayListTestOne.size());
    arrayListTestOne.add(10);
    for (int i = 0; i < arrayListTestOne.size(); i++) {
      System.out.println(arrayListTestOne.get(i));
    }
    System.out.println(arrayListTestOne.isEmpty());
  }
}
