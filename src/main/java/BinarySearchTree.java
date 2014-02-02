import java.util.List;

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

}


class Node {
    private int value;
    private Node leftChild;
    private Node rightChild;

    public Node(int value) {
        this.value = value;
        leftChild = null;
        rightChild = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}
