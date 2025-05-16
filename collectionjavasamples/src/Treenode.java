public class Treenode<T> {

    private T value;
    private Treenode<T> left, right;

    public Treenode(T value){
        this.value = value;
        left = right = null;
    }

    public T getValue() {
        return value;
    }

    public Treenode<T> getLeft() {
        return left;
    }

    public Treenode<T> getRight() {
        return right;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setLeft(Treenode<T> left) {
        this.left = left;
    }

    public void setRight(Treenode<T> right) {
        this.right = right;
    }

    @Override
    public String toString(){
        return "Treenode [value =" + value + "]";
    }
    
}