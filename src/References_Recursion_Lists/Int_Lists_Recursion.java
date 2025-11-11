package References_Recursion_Lists;
public class Int_Lists_Recursion {
    public static class IntList {
        public int first;
        public IntList next;

        public IntList(int f,IntList n) {
            first = f;
            next = n;
        }

        //基于递归进行长度求职
        public int Size() {
            if(next == null)
            {
                return 1;
            }

            return 1 + this.next.Size();
        }

        //基于迭代进行求长度方法
        public int iterativeSize() {
            IntList p = this;
            int totalSize = 0;
            while (p != null)
            {
                totalSize += 1;
                p = p.next;
            }
            return totalSize;
        }

        public void Print()
        {
            if(next == null)
            {
                System.out.println(this.first);
                return;
            }
            System.out.print(first+" ");
            this.next.Print();
        }
    }
    public static void main(String[] args) {
        IntList List = new IntList(2, null);
        List.next = new IntList(10,null);
        List.next.next = new IntList(15,null);

        int size = List.Size();
        System.out.println(size);
        List.Print();
    }
}
