import com.google.common.collect.Lists;
import org.hamcrest.Matcher;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;

public class BinarySearchTreeTest {

    public static BinarySearchTree getTestTree(int[] testValueArray, int testRoot) throws Exception {
        BinarySearchTree testBinarySearchTree = new BinarySearchTree();

        testBinarySearchTree.setRoot(testRoot);
        for(int temp : testValueArray){
            testBinarySearchTree.insertValue(temp);
        }

        return testBinarySearchTree;
    }

    @Test
    public void testInsertValue() throws Exception {
        BinarySearchTree testBinarySearchTree = getTestTree(new int[]{0,2,4,6,8,12,14,16,18,20}, 10);

        testBinarySearchTree.insertValue(3);
        testBinarySearchTree.recursiveInsert(testBinarySearchTree.getRoot(), 17);

        assertTrue(testBinarySearchTree.searchValue(testBinarySearchTree.getRoot(), 3));
        assertTrue(testBinarySearchTree.searchValue(testBinarySearchTree.getRoot(), 17));

    }

    @Test
    public void testSearchValue() throws Exception {
        BinarySearchTree testBinarySearchTree = getTestTree(new int[]{0,2,4,6,8,12,14,16,18,20}, 10);

        assertTrue(testBinarySearchTree.searchValue(testBinarySearchTree.getRoot(), 4));
        assertFalse(testBinarySearchTree.searchValue(testBinarySearchTree.getRoot(), 5));
    } 

    @Test
    public void testPreOrderTraversal() throws Exception {
        BinarySearchTree binarySearchTree = getTestTree(new int[]{17, 1, 11, 65, 99, 0, 12, 4, 18, 2, 121}, 50);
        ArrayList<Integer> actualTraversedList = Lists.newArrayList();
        ArrayList<Integer> expectedTraversedList = Lists.newArrayList(50,17,1,0,11,4,2,12,18,65,99,121);

        binarySearchTree.preOrderTreeTraversal(binarySearchTree.getRoot(), actualTraversedList);

        assertThat(actualTraversedList.size(), equalTo(expectedTraversedList.size()));
        for(int i = 0; i<actualTraversedList.size(); i++){
            assertThat(actualTraversedList.get(i), equalTo(expectedTraversedList.get(i)));
        }
    }

    @Test
    public void testInOrderTraversal() throws Exception {
        BinarySearchTree binarySearchTree = getTestTree(new int[]{17, 1, 11, 65, 99, 0, 12, 4, 18, 2, 121}, 50);
        ArrayList<Integer> actualTraversedList = Lists.newArrayList();
        ArrayList<Integer> expectedTraversedList = Lists.newArrayList(0,1,2,4,11,12,17,18,50,65,99,121);

        binarySearchTree.inOrderTreeTraversal(binarySearchTree.getRoot(), actualTraversedList);

        assertThat(actualTraversedList.size(), equalTo(expectedTraversedList.size()));
        for(int i = 0; i<actualTraversedList.size(); i++){
            assertThat(actualTraversedList.get(i), equalTo(expectedTraversedList.get(i)));
        }
    }

    @Test
    public void testPostOrderTraversal() throws Exception {
        BinarySearchTree binarySearchTree = getTestTree(new int[]{17, 1, 11, 65, 99, 0, 12, 4, 18, 2, 121}, 50);
        ArrayList<Integer> actualTraversedList = Lists.newArrayList();
        ArrayList<Integer> expectedTraversedList = Lists.newArrayList(0,2,4,12,11,1,18,17,121,99,65,50);

        binarySearchTree.postOrderTreeTraversal(binarySearchTree.getRoot(), actualTraversedList);

        assertThat(actualTraversedList.size(), equalTo(expectedTraversedList.size()));
        for(int i = 0; i<actualTraversedList.size(); i++){
            assertThat(actualTraversedList.get(i), equalTo(expectedTraversedList.get(i)));
        }
    }
}
