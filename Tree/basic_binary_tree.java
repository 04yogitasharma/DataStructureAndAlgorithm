package Tree;

class node{
    int key;
    node left;
    node right;
    node(int k){
        key=k;
        System.out.println(key);

    }
}

public class basic_binary_tree {
    public static void main(String[] args) {
        node root=new node(30);
        root.left=new node(10);
        root.right=new node(40);
        root.left.left=null;
    }
}
