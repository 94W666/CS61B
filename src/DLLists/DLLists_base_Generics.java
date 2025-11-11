/**
 * DLLists实际上就是是双向列表
 * @author:王浩
 * @time：2025-11-11 14:32
 */
package DLLists;

public class DLLists_base_Generics {
    public static class DLList<T> {
        public class IntNode {
            public T val;
            public IntNode prev;
            public IntNode next;

            public IntNode(T val,IntNode prev,IntNode next) {
                this.val = val;
                this.prev = prev;
                this.next = next;
            }
        }
        private IntNode sentinel;
        private int size;

        public DLList(T val) {
            this.sentinel = new IntNode(null,null,null);
            this.sentinel.prev = this.sentinel;
            this.sentinel.next = this.sentinel;

            if(val != null) {
                addFirst(val);
            }
            this.size = (val != null) ? 1 : 0;
        }
        public void addFirst(T val) {
            IntNode newNode = new IntNode(val,sentinel,sentinel.next);
            sentinel.next.prev = newNode;
            sentinel.next = newNode;
            size++;
        }
    }
    public static void main(String[] args) {
        DLList<String> Dl = new DLList<>("Hello");
        DLList<Integer> Dll = new DLList<>(12);
    }
}
