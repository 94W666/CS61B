package SLLists;

public class SLList_base {
    /**
    * 定义了SLList列表中的每一个节点，成员包括节点的数据item，下一个节点地址next
    * 构造方法传入数据和下一个节点地址
    */
    public static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i,IntNode n) {
            item = i;
            next = n;
        }
    }

    /**
    * 宏观定义SLList表类，它的成员就是其中的节点IntNode，这里根据链表性质，只定义其头节点地址
    * 构造方法直接调用IntNode构造方法，对外隐藏传入地址信息，用户只需要传入数据即可
    * 其中方法addFirst实际上是头插法添加元素
    */
    public static class SLList {
        private IntNode first;

        public SLList(int x) {
            first = new IntNode(x,null);
        }
        public void addFirst(int x) {
            first = new IntNode(x,first);
        }
        public int getFirst() {
            return first.item;
        }
        public void addLast(int x) {
            IntNode p = first;
            while(p.next != null) {
                p = p.next;
            }
            p.next = new IntNode(x,null);
        }
        //基于迭代求链表长度
        public int Size() {
            IntNode p = first;
            int count = 0;
            while (p != null) {
                count++;
                p = p.next;
            }
            return count;
        }
        //基于递归求链表长度
        public int Size(IntNode N) {
            if(N == null) {
                return 0;
            }
            return 1 + Size(N.next);
        }
        public void Print() {
            IntNode p = first;
            while(p != null) {
                System.out.println(p.item);
                p = p.next;
            }
        }
    }
    public static void main(String[] args) {
        SLList L = new SLList(5);
        L.addFirst(15);
        L.addFirst(7);
        L.addLast(9);
        /**
        *为了防止这种自我循环的错误情况，我们可以将first成员打上private关键字
        *L.first.next.next = L.first.next;
        * 这样的目的是防止用户私自操作头指针
        */
        L.Print();
        System.out.println(L.Size());
        System.out.println(L.Size(L.first));
        System.out.println(L.getFirst());
    }
}
