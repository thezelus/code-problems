import com.google.common.collect.Queues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void setRoot(int rootValue) {
        this.root = new Node(rootValue);
    }

    public void insertValue(int newValue) {
        if (root == null)
            throw new NullPointerException("Insertion failed : Root node is null");
        Node tempNode = root;
        while (tempNode != null) {
            if (tempNode.getValue() >= newValue) {
                if (tempNode.getLeftChild() == null) {
                    tempNode.setLeftChild(new Node(newValue));
                    break;
                } else
                    tempNode = tempNode.getLeftChild();
            } else if (tempNode.getValue() < newValue) {
                if (tempNode.getRightChild() == null) {
                    tempNode.setRightChild(new Node(newValue));
                    break;
                } else
                    tempNode = tempNode.getRightChild();
            }
        }
    }

    public void recursiveInsert(Node element, int newValue) {
        if (newValue <= element.getValue()) {
            if (element.getLeftChild() == null)
                element.setLeftChild(new Node(newValue));
            else
                recursiveInsert(element.getLeftChild(), newValue);
        } else {
            if (element.getRightChild() == null)
                element.setRightChild(new Node(newValue));
            else
                recursiveInsert(element.getRightChild(), newValue);
        }
    }

    public boolean searchValue(Node element, int desiredValue) {
        if (desiredValue == element.getValue())
            return true;
        else if (desiredValue < element.getValue()) {
            return element.getLeftChild() != null && searchValue(element.getLeftChild(), desiredValue);
        } else if (element.getValue() < desiredValue) {
            return element.getRightChild() != null && searchValue(element.getRightChild(), desiredValue);
        }
        return false;
    }

    public void preOrderTreeTraversal(Node element, ArrayList<Integer> traversalList) {
        traversalList.add(element.getValue());
        if (element.getLeftChild() != null)
            preOrderTreeTraversal(element.getLeftChild(), traversalList);
        if (element.getRightChild() != null)
            preOrderTreeTraversal(element.getRightChild(), traversalList);
    }

    public void inOrderTreeTraversal(Node element, ArrayList<Integer> traversalList) {
        if (element.getLeftChild() != null)
            inOrderTreeTraversal(element.getLeftChild(), traversalList);
        traversalList.add(element.getValue());
        if (element.getRightChild() != null)
            inOrderTreeTraversal(element.getRightChild(), traversalList);
    }

    public void postOrderTreeTraversal(Node element, ArrayList<Integer> traversalList) {
        if (element.getLeftChild() != null)
            postOrderTreeTraversal(element.getLeftChild(), traversalList);
        if (element.getRightChild() != null)
            postOrderTreeTraversal(element.getRightChild(), traversalList);
        traversalList.add(element.getValue());
    }

    public void breadthFirstTraversal(Node element, ArrayList<Integer> traversalList){
        Queue<Node> nodeQueue = new LinkedList<Node>();
        nodeQueue.add(element);
        while (!nodeQueue.isEmpty()){
            Node firstElement = nodeQueue.remove();
            traversalList.add(firstElement.getValue());
            if(firstElement.getLeftChild() != null)
                nodeQueue.add(firstElement.getLeftChild());
            if(firstElement.getRightChild() != null)
                nodeQueue.add(firstElement.getRightChild());
        }
    }

}


