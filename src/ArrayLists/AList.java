package ArrayLists;

/** Array based list.
 *  @author Josh Hug
 */

public class AList {
    private int[] item;
    private int size;

    /** Creates an empty list. */
    public AList() {
        item = new int[100];
        size = 0;
    }

    /** Resizes the underlying array to target capacity. */
    private void resize(int capacity) {
        int[] a = new int[capacity];
        System.arraycopy(item,0,a,0,size);
        item = a;
    }

    /** Inserts X into the back of the list. */
    public void addLast(int x) {
        if(size >= item.length) {
            resize(size + 1);
        }
        item[size] = x;
        size += 1;
    }

    /** Returns the item from the back of the list. */
    public int getLast() {
        return item[size-1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        return item[i-1];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and
     * returns deleted item. */
    public int removeLast() {
        int returnItem = item[size-1];
        size -= 1;
        return returnItem;
    }
}
