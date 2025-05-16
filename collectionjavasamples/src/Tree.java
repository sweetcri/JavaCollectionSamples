public class Tree<T extends Comparable<T>> {

    protected Treenode<T> root;

    public Tree(){
        root = null;
    }

    
    public void add(T value) {
    Treenode<T> newnode = new Treenode<>(value);
    if (root == null) {
        root = newnode;
        return;
    }
    Treenode<T> current = root;
    while (true) {
        if (value.compareTo(current.getValue()) < 0) {
            if (current.getLeft() == null) {
                current.setLeft(newnode);
                return;
            }
            current = current.getLeft();
        } else {
            if (current.getRight() == null) {
                current.setRight(newnode);
                return;
            }
            current = current.getRight();
        }
    }
}
}   