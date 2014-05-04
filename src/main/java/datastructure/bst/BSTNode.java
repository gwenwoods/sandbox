package datastructure.bst;

public class BSTNode<T> {

    BSTNode(T value) {
        this.value = value;
    }

    T value;
    BSTNode<T> leftChild;
    BSTNode<T> rightChild;

}
