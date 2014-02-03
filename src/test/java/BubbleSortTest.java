import com.google.common.collect.Lists;
import com.sun.tools.javac.util.List;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class BubbleSortTest {
    @Test
    public void testBubbleSortList() throws Exception {

        BubbleSort bubbleSort = new BubbleSort();
        ArrayList<Integer> testList = Lists.newArrayList(5,2,11,6,4,16,13,1,19,12,3);
        bubbleSort.sortList(testList);
        ArrayList<Integer> expectedList = Lists.newArrayList(1, 2, 3, 4, 5, 6, 11, 12, 13, 16, 19);
        assertThat(testList.equals(expectedList), equalTo(true));
    }
}
