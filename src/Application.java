public class Application {

  public static void main(String[] args) {
    LinkedListTest<Integer> linkedListTestFirst = new LinkedListTest<>();
    LinkedListTest<Integer> linkedListTestSecond = new LinkedListTest<>();
    linkedListTestFirst.add(0);
    linkedListTestFirst.add(1);
    linkedListTestFirst.add(2);
    linkedListTestFirst.add(3);
    linkedListTestSecond.add(4);
    linkedListTestSecond.add(5);
    System.out.println("Initial main List:");
    System.out.println(linkedListTestFirst.get(0));
    System.out.println(linkedListTestFirst.get(1));
    System.out.println(linkedListTestFirst.get(2));
    System.out.println(linkedListTestFirst.get(3));
   // linkedListTestFirst.remove(1);
//    linkedListTestFirst.remove(0);
//    linkedListTestFirst.remove(3);
//    linkedListTestFirst.remove(4);
//    linkedListTestFirst.remove(Integer.valueOf(2));
    //linkedListTestFirst.add(11, 0);
    linkedListTestFirst.add(11, 0);
//    linkedListTestFirst.add(11, 3);
//    linkedListTestFirst.add(11, 4);
    linkedListTestFirst.addAll(linkedListTestSecond);
   // linkedListTestFirst.set(22, 3);
    System.out.println("Changes in main List:");
    for (int i = 0; i < linkedListTestFirst.size(); i++) {
      System.out.println(linkedListTestFirst.get(i));
    }
  }
}

