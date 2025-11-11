/**
 *Exercise 2.5.1and2: Try to build an AList class that supports addLast, getLast, get, and size operations.
 * @author:王浩
 * @time:2025-11-11 15:14
 * @CS61B
 * */
package Arrays;

public class exercise_2_5_1and2 {
    public static class ALists {
        public int MAX_SIZE = 100;
        private int[] val;
        private int size;

        public ALists() {
            val = new int[MAX_SIZE];
            size = 0;
        }
        public ALists(int capacity) {
            if(capacity > MAX_SIZE) {
                System.out.println("超过数组最大容量！");
                return;
            }
            val = new int[capacity];
            size = 0;
        }
        public void addLast(int val) {
            if(size == MAX_SIZE) {
                return;
            }
            if(size == 0) {
                this.val[size] = val;
                size++;
                return;
            }
            size++;
            this.val[size-1] = val;
        }
        public int getLast() {
            if(size == 0) {
                return -1;
            }
            return this.val[size-1];
        }
        public int getVal(int i) {
            if(i >= size) {
                return -1;
            }
            return this.val[i-1];
        }
        public int getSize() {
            return size;
        }
        public void removeLast() {
            size--;
        }
    }
    public static void main(String[] args) {
        ALists array = new ALists();
        array.addLast(10);
        array.addLast(11);
        array.addLast(13);
        System.out.println(array.getSize());
        System.out.println(array.getLast());
        System.out.println(array.getVal(2));
    }
}
