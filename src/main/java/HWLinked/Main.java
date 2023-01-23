package HWLinked;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer>myList = new MyLinkedList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        for (Integer item:myList) System.out.println(item);

    }
}
