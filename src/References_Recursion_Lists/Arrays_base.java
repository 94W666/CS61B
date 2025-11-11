package References_Recursion_Lists;

import java.util.Arrays;

public class Arrays_base {
    public static void main(String[] args) {
        int[] x;
        x = new int[] {0,1,2,3,4};

        Ref(x);

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
        }
        System.out.println();
        System.out.println(x);

        int[] a1 = new int[] {0,1,2,3,4};
        int[] a2 = new int[] {0,1,2,3,4};
        System.out.println("The address of a1: "+a1+".The address of a2:"+a2);
        System.out.println(a1 == a2);
        System.out.println(Arrays.equals(a1,a2));
    }

    /**
    *由此可以发现，数组的数组名在C语言或者Java中都是第一个元素的地址
    * 将其作为变量传入给函数时，因为它是一个地址，所以可以直接修改影响main函数
    */



    public static void Ref(int[] x)
    {
        x[2] = 9;
    }
}
