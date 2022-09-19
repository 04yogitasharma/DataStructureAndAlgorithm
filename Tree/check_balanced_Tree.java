package Tree;

public class check_balanced_Tree {
    static int balanced_tree(node root){
        if(root==null){
            return 0;
        }
        int lh=balanced_tree(root.left);
        if(lh==-1){return -1;}
        int rh=balanced_tree(root.right);
        if(rh==-1){return -1;}
        if(Math.abs(lh-rh)>1){return -1;}
        else{
            return Math.max(lh, rh)+1;
        }
    }

    public static void main(String[] args) {
        node root=new node(40);
        root.left=new node(67);
        root.right=new node(78);
        root.left.left=new node(7);
        // root.left.left.left=new node(4);

        System.out.println( balanced_tree(root));
    }
}
