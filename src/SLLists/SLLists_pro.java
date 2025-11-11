package SLLists;

public class SLLists_pro {
    public static class IntNode {
        public int val;
        public IntNode next;

        public IntNode(int val,IntNode next) {
            this.val = val;
            this.next = next;
        }
    }
    /**
    * 为了避免每一次求长度Size需要耗费的时间复杂度
    * 我们可以牺牲掉一部分内存来专门存储链表的长度变量Size，这样在需要长度时，我们可以在常数时间内返回
     */
    public static class SLLists {
        private IntNode first;
        private int Size;

        public SLLists(int val) {
            this.first = new IntNode(val,null);
            this.Size = 1;
        }

        public void addFirst(int val) {
            this.first = new IntNode(val,this.first);
            this.Size++;
        }
        public int getSize() {
            return this.Size;
        }
    }
    public static void main(String[] args) {
        SLLists L = new SLLists(10);
        L.addFirst(11);
        L.addFirst(12);
        System.out.println(L.getSize());
    }
}
