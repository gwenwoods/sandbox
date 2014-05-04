package datastructure.bst.intcase;

public final class BSTInt {

    private BSTNodeInt rootNode;

    public void insert(Integer value) {
        if (rootNode == null) {
            rootNode = new BSTNodeInt(value);
            return;
        }

        recursiveInsert(rootNode, value);
    }

    private void recursiveInsert(BSTNodeInt currentNode, Integer value) {

        if (value < currentNode.value) {
            if (currentNode.leftChild == null) {
                currentNode.leftChild = new BSTNodeInt(value);
            } else {
                recursiveInsert(currentNode.leftChild, value);
            }

        } else if (value > rootNode.value) {
            if (currentNode.rightChild == null) {
                currentNode.rightChild = new BSTNodeInt(value);
            } else {
                recursiveInsert(currentNode.rightChild, value);
            }

        } else {
            // no duplicated node
            return;
        }
    }
}
