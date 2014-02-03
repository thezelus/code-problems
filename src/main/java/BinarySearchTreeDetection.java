import com.google.common.collect.Lists;

import java.util.ArrayList;

public class BinarySearchTreeDetection {

    public boolean isBinarySearchTree(Node root){
        ArrayList<Integer> traversedValues = Lists.newArrayList();
        traverseTreeInOrder(root, traversedValues);
        return isListSorted(traversedValues);
    }

    void traverseTreeInOrder(Node root, ArrayList<Integer> traversedValues) {
        if(root.getLeftChild() != null)
            traverseTreeInOrder(root.getLeftChild(), traversedValues);
        traversedValues.add(root.getValue());
        if(root.getRightChild() != null)
            traverseTreeInOrder(root.getRightChild(), traversedValues);
    }

    boolean isListSorted(ArrayList<Integer> traversedValues) {
        for(int i = 0; i <traversedValues.size()-1 ; i++){
            if(traversedValues.get(i) > traversedValues.get(i+1))
                return false;
        }
        return true;
    }

}
