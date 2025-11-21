package ArrayLists;

public class AListTest {
    public static void main(String[] args) {
        AList array = new AList();
        array.addLast(5);
        array.addLast(4);
        array.addLast(3);
        array.addLast(2);

        int size = array.size();
        int target = array.get(2);
        int last = array.getLast();

        System.out.println(size);
        System.out.println(target);
        System.out.println(last);

        array.removeLast();
        System.out.println(array.getLast());
    }
}
