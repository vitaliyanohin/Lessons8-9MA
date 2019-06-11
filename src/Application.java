public class Application {

  public static void main(String[] args) {
    LinkedListTest<Integer> linkedListTestOneFirst = new LinkedListTest<>();
    LinkedListTest<Integer> linkedListTestSecond = new LinkedListTest<>();
    linkedListTestOneFirst.add(0);
    linkedListTestOneFirst.add(1);
    linkedListTestOneFirst.add(2);
    linkedListTestOneFirst.add(3);
    linkedListTestSecond.add(4);
    linkedListTestSecond.add(5);
    System.out.println("Initial main List:");
    System.out.println(linkedListTestOneFirst.get(0));
    System.out.println(linkedListTestOneFirst.get(1));
    System.out.println(linkedListTestOneFirst.get(2));
    System.out.println(linkedListTestOneFirst.get(3));
    linkedListTestOneFirst.remove(1);
//    linkedListTestOneFirst.remove(0);
//    linkedListTestOneFirst.remove(3);
//    linkedListTestOneFirst.remove(4);
//    linkedListTestOneFirst.remove(Integer.valueOf(2));
    linkedListTestOneFirst.add(11, 0);
//    linkedListTestOneFirst.add(11, 2);
//    linkedListTestOneFirst.add(11, 3);
//    linkedListTestOneFirst.add(11, 4);
    linkedListTestOneFirst.addAll(linkedListTestSecond);
    linkedListTestOneFirst.set(22, 3);
    System.out.println("Changes in main List:");
    for (int i = 0; i < linkedListTestOneFirst.size(); i++) {
      System.out.println(linkedListTestOneFirst.get(i));
    }
  }
}

