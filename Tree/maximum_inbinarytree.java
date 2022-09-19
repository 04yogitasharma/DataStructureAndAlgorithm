package Tree;
class node{
    int key;
    node left;
    node right;
    node(int k){
        key=k;
    }
}

public class maximum_inbinarytree {
     static int maximum(node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        else{
            return Math.max(root.key,Math.max(maximum(root.left), maximum(root.right)));
        }
    }
    public static void main(String[] args) {
        node root=new node(40);
        root.left=new node(10);
        root.right=new node(60);
        root.left.left=new node(100);

        System.out.println(maximum(root));   
    }
}
