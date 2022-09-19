package Tree;

public class Lowest_common_ancestor {

    public static node LCA(node root,int n1,int n2){
        if(root==null){return null;}
        if(root.key==n1||root.key==n2){return root;}
        node lca1=LCA(root.left, n1, n2);
        node lca2=LCA(root.right, n1, n2);
        if(lca1!=null&&lca2!=null){
            return root;
        }
        if(lca1!=null){return lca1;}
        else{return lca2;}
    }
    public static void main(String[] args) {
        node root=new node(50);
        root.left=new node(20);
        root.right=new node(70);
        root.left.left=new node(30);
        root.right.right=new node(80);
        
        node ans= LCA(root,30,20);
        System.out.println(ans.key);
    }
}
