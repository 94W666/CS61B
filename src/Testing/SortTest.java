package Testing;

import org.junit.Test;
import static org.junit.Assert.*;

/** 引入测试文档，不使用main函数达到测试代码的目的. */
public class SortTest {

    @Test
    public void testSort() {
        String[] input = {"i","have","an","egg"};
        String[] expected = {"an","egg","have","i"};

        Sort.sort(input);
        assertArrayEquals(expected,input);
    }

    @Test
    public void testFindSmallest() {
        String[] input = {"i","have","an","egg"};
        int expected = 2;

        int actual1 = Sort.findSmallest(input,0);
        assertEquals(expected,actual1);

        String[] input2 = {"i","love","money","too"};
        int expected2 = 2;

        int actual2 = Sort.findSmallest(input2,2);
        assertEquals(expected2,actual2);
    }

    @Test
    public void testSwap() {
        String[] input = {"i","have","an","egg"};
        int a = 0;
        int b = 2;
        String[] expected = {"an","have","i","egg"};

        Sort.swap(input,a,b);
        assertArrayEquals(expected,input);
    }
}
