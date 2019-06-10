public class Application {

  public static void main(String[] args) {
    LinkedListTest<Integer> linkedListTest = new LinkedListTest<>();
    linkedListTest.add(0);
    linkedListTest.add(1);
    linkedListTest.add(2);
    linkedListTest.add(3);
    System.out.println(linkedListTest.get(0));
    System.out.println(linkedListTest.get(1));
    System.out.println(linkedListTest.get(2));
    System.out.println(linkedListTest.get(3));
    linkedListTest.remove(2);
    System.out.println("_____________");
    for (int i = 0; i < linkedListTest.size(); i++) {
      System.out.println(linkedListTest.get(i));
    }
  }
}

