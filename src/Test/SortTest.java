package Test;

public class SortTest {
    public  static void testSort() {
        //由 Visuallizer 可知，数组的数组名实际上是第一个元素的地址
        String[] input = {"i","have","an","egg"};
        String[] expected = {"an","egg","have","i"};

        Sort.sort(input);
        org.junit.Assert.assertArrayEquals(expected,input);
    }

    public static void testFindSmallest() {
        String[] input = {"i","have","an","egg"};
        String expected = "an";

        String actual = Sort.findSmallest(input);
        org.junit.Assert.assertEquals(expected,actual);
    }

    public static void main(String[] args) {
       testFindSmallest();
    }
}
