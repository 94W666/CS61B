package Arrays;

public class Array_copy {
    public static void main(String[] args) {
        int[] x,y;
        x = new int[] {1,2,3,4,5};
        y = new int[] {7,8,9,10,11};
        System.arraycopy(y,0,x,3,2);
        /**
         * 复制数组的代码接收的参数包括：源数组，源数组起始复制位置，目标数组，目标数组起始粘贴位置，复制长度
         * */
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+" ");
        }
    }
}
