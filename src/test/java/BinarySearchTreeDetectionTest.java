import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class BinarySearchTreeDetectionTest {
    @Test
    public void testIsBinarySearchTree_withSimpleBinaryTree() throws Exception {
        Node root = new Node(5);
        root.setRightChild(new Node(2));
        root.setLeftChild(new Node(8));

        BinarySearchTreeDetection binarySearchTreeDetection = new BinarySearchTreeDetection();
        assertThat(binarySearchTreeDetection.isBinarySearchTree(root), equalTo(false));
    }

    @Test
    public void testIsBinarySearchTree_withBinarySearchTree() throws Exception {
        BinarySearchTree binarySearchTree =  new BinarySearchTree();
        binarySearchTree.setRoot(new Node(50));
        int[] testArray = new int[]{17, 1, 11, 65, 99, 0, 12, 4, 18, 2, 121};
        Node root = binarySearchTree.getRoot();
        for(int temp : testArray)
            binarySearchTree.recursiveInsert(root, temp);

        BinarySearchTreeDetection detection = new BinarySearchTreeDetection();

        assertThat(detection.isBinarySearchTree(root), equalTo(true));
    }

    @Test
    public void testIsListSorted() throws Exception {
        BinarySearchTreeDetection binarySearchTreeDetection =  new BinarySearchTreeDetection();

        ArrayList<Integer> sortedList = Lists.newArrayList(0,1,2,3,4,5,6,7);
        ArrayList<Integer> unsortedList = Lists.newArrayList(2,1,5,6,7,4,3);

        assertThat(binarySearchTreeDetection.isListSorted(sortedList), equalTo(true));
        assertThat(binarySearchTreeDetection.isListSorted(unsortedList), equalTo(false));

    }
}
