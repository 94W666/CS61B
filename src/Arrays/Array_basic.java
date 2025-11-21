package Arrays;

public class Array_basic {
    public static void Print(int[] x) {
        for(int i = 0;i < x.length;i++) {
            System.out.print(x[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        /**
         * 这三种是初始化数组的基本方式
         * int[] x;
         *         int[] y;
         *         x = new int[3];
         *         y = new int[] {1,2,3};
         *         int[] w = {1,2,3};
         * */
        int[] z = null;
        int[] x,y;

        x = new int[] {1,2,3,4,5};
        Print(x);
        y = x;
        Print(y);

        x = new int[] {-1,2,5,4,99};
        Print(x);
        y = new int[3];
        z = new int[0];
        int xl = x.length;

        String[] s = new String[6];
        s[4] = "ketchup";
        s[x[3] - x[1]] = "muffins";

        int[] b = {9,10,11};
        Print(b);
        System.arraycopy(b,0,x,3,2);
        Print(x);
    }
}
