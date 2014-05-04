package datastructure.bst;

public final class BST<T extends Number & Comparable<? super T>> {

    private BSTNode<T> rootNode;

    public void insert(T value) {
        if (rootNode == null) {
            rootNode = new BSTNode<T>(value);
            return;
        }

        recursiveInsert(rootNode, value);
    }

    private void recursiveInsert(BSTNode<T> currentNode, T value) {

        if (value.compareTo(currentNode.value) < 0) {
            if (currentNode.leftChild == null) {
                currentNode.leftChild = new BSTNode<T>(value);
            } else {
                recursiveInsert(currentNode.leftChild, value);
            }

        } else if (value.compareTo(currentNode.value) > 0) {
            if (currentNode.rightChild == null) {
                currentNode.rightChild = new BSTNode<T>(value);
            } else {
                recursiveInsert(currentNode.rightChild, value);
            }
        }

    }

    public T findMax() {
        return toRightChild(rootNode);
    }

    private T toRightChild(BSTNode<T> currentNode) {

        if (currentNode.rightChild != null) {
            return toRightChild(currentNode.rightChild);
        }
        return currentNode.value;

    }

    public void printInOrder() {
        // done with left child

        inOrderTraverse(rootNode);
    }

    public void printPreOrder() {
        // done with left child

        preOrderTraverse(rootNode);
    }

    private void inOrderTraverse(BSTNode<T> currentNode) {

        if (currentNode.leftChild != null) {
            inOrderTraverse(currentNode.leftChild);
        }

        System.out.println(currentNode.value);

        if (currentNode.rightChild != null) {
            inOrderTraverse(currentNode.rightChild);
        }
    }

    private void preOrderTraverse(BSTNode<T> currentNode) {

        System.out.println(currentNode.value);

        if (currentNode.leftChild != null) {
            preOrderTraverse(currentNode.leftChild);
        }

        if (currentNode.rightChild != null) {
            preOrderTraverse(currentNode.rightChild);
        }
    }

}
