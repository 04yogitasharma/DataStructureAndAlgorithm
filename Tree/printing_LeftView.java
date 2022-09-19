package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class printing_LeftView {
    static void left_view(node root){
        if(root==null){return;}
        Queue <node> q=new LinkedList<node>();
        q.add(root);
        while(q.isEmpty()==false){
            int count=q.size();
            for(int i=0;i<count;i++){
                node curr=q.poll();
                if(i==0){
                    System.out.print(curr.key+" ");
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        node root=new node(40);
        root.left=new node(10);
        root.right=new node(50);
        root.left.left=new node(5);
        root.right.right=new node(6);
        root.right.right.right=new node(12);

        left_view(root);
    }
}
