package Inheritance;

public interface List61B<Item> {
    /** Inserts X into the front of the list. */
    public void addFirst(Item x);

    /** Inserts X into the back of the list. */
    public void addLast(Item y);

    /** Return the item from the front o f list. */
    public int getFirst();

    /** Returns the item from the back of the list. */
    public int getLast();

    /** Gets the ith item in the list (0 is the front). */
    public int get(int i);

    /** Returns the number of items in the list. */
    public int size();

    /** Deletes item from back of the list and
     * returns deleted item. */
    public int removeLast();

    /** Insert the item in the list of position. */
    public void insert(Item x,int position);
}
