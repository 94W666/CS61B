package References_Recursion_Lists;

public class References_VS_pointer {
    public static class Walrus {
        public int weight;
        public double tuskSize;

        public Walrus(int w, double ts) {
            weight = w;
            tuskSize = ts;
        }
    }
    public static void main(String[] args) {
        //Java 实例化对象的原理类 VS C语言指针
        Walrus w1;//声明一个引用变量 相当于C语言中的指针变量 大小通常为4字节或8字节
        w1 = new Walrus(1000,5.3);//使用new函数为变量分配了一个可以储存变量成员大小总和的空间，调用构造函数自动的将成员变量初始化赋值，然后返回一个地址
        /**
        *   类似于C语言中的以下代码
        *   Walrus *w1;
        *   w1 = (Walrus*) malloc(sizeof(Walrus));
        *   if(w1 != NULL)
        *   {
        *       w1->weight = 1000;
        *       w1->tuskSize = 5.3;
        *   }
        */
        Walrus w2 = w1;
        w2.weight = 101;
        Walrus w3 = null;//此处可以将w3设置成null，说明它是一个储存地址的变量
        System.out.println("The w1 weight is " + w1.weight);
        System.out.println("The w2 weight is " + w2.weight);

        Walrus walrus = new Walrus(3500, 10.5);
        int x = 9;

        doStuff(walrus, x);
        System.out.println(walrus.weight);
        System.out.println(x);
    }

    /**
    * 此处可以发现，Java中的函数传递也是值传递，但是对象的引用是一个地址变量，他传入的是对象的地址
    * 因此可以得到修改
    */
    public static void doStuff(Walrus W, int x) {
        W.weight = W.weight - 100;
        x = x - 5;
    }

}
