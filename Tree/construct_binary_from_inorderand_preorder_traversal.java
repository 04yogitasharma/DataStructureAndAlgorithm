package Tree;

public class  construct_binary_from_inorderand_preorder_traversal {
    static node binary_tree(int in[],int pre[],int is,int ie){
        int preIndex=0;
        if(is>ie){
            return null;
        }
        node root =new node(pre[preIndex++]);

        int inIndex=0;
        for(int i=is;i<=ie;i++){
            if(in[i]==root.key){
                inIndex=i;
                break;
            }
        }
        root.left=binary_tree(in, pre, is, inIndex-1);
        root.right=binary_tree(in, pre, inIndex+1, ie);
        return root;
    }

    static void inorder_traversal(node root){
        if(root!=null){ 
        inorder_traversal(root.left);
        System.out.print(root.key+" ");
        inorder_traversal(root.right);
    }
    }
    
    public static void main(String[] args) {
        int in[]={20,10,40,30,50};
        int pre[]={10,20,30,40,50};
        int is=0;            //index start
        int ie=in.length-1;  //index end
        node root=binary_tree(in,pre,is,ie);
        inorder_traversal(root);
    }

    
} 
