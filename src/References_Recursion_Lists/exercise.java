/**
* Exercise: Write a method get(int i) that returns the ith item of the list.
*           For example, if L is 5 -> 10 -> 15, then L.get(0) should return 5, L.get(1) should return 10, and L.get(2) should return 15.
*           It doesn't matter how your code behaves for invalid i, either too big or too small.
* @author 王浩
* @time 2025-11-9
*/


package References_Recursion_Lists;

public class exercise {
    public static class List {
        public int val;
        public List next;

        public List(int val,List next) {
            this.val = val;
            this.next = next;
        }

        public int Size() {
            if(next == null)
            {
                return 1;
            }

            return 1 + this.next.Size();
        }

        public int get(int i) {
            if(i > this.Size()) {
                return -1;
            }
            List p = this;
            for (int j = 0; j < i - 1; j++) {
                p = p.next;
            }
            return p.val;
        }
    }

    public static void main(String[] args) {
        List L = new List(5,null);
        L.next = new List(10,null);
        L.next.next = new List(15,null);

        int val = L.get(2);
        System.out.println(val);
    }
}
