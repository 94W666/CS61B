/**
* Exercise 2.2.1: The curious reader might object and say that the IntList would be just as easy to use if we simply wrote an addFirst method.
*                 Try to write an addFirst method to the IntList class. You'll find that the resulting method is tricky as well as inefficient.
* @author:王浩
* @time 2025-11-9
* @CS61B
*/
package SLLists;

public class exercise_2_2_1 {
    public static class IntNode {
        public int first;
        public IntNode rest;

        public IntNode(int f,IntNode r) {
            first = f;
            rest = r;
        }

        public IntNode addFirst(int f) {
            return new IntNode(f,this);
        }
    }
    public static void main(String[] args) {
        IntNode Node = new IntNode(10,null);
        Node = Node.addFirst(11);
        Node = Node.addFirst(12);

        System.out.println(Node.first);
    }
}
