import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class BinarySearchTreeTest {

    public static BinarySearchTree getTestTree() throws Exception {
        int testValueArray[] = new int[]{0,2,4,6,8,12,14,16,18,20};
        int testRoot = 10;
        BinarySearchTree testBinarySearchTree = new BinarySearchTree();

        testBinarySearchTree.setRoot(testRoot);
        for(int temp : testValueArray){
            testBinarySearchTree.insertValue(temp);
        }

        return testBinarySearchTree;
    }

    @Test
    public void testInsertValue() throws Exception {
        BinarySearchTree testBinarySearchTree = getTestTree();

        testBinarySearchTree.insertValue(3);
        testBinarySearchTree.recursiveInsert(testBinarySearchTree.getRoot(), 17);

        assertTrue(testBinarySearchTree.searchValue(testBinarySearchTree.getRoot(),3));
        assertTrue(testBinarySearchTree.searchValue(testBinarySearchTree.getRoot(), 17));

    }

    @Test
    public void testSearchValue() throws Exception {
        BinarySearchTree testBinarySearchTree = getTestTree();

        assertTrue(testBinarySearchTree.searchValue(testBinarySearchTree.getRoot(), 4));
        assertFalse(testBinarySearchTree.searchValue(testBinarySearchTree.getRoot(), 5));
    }
}
