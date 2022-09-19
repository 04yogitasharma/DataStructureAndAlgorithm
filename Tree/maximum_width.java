package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class  maximum_width {

    static int check_maximumWidth(node root){
        if(root==null){return 0;}
        Queue <node> q=new LinkedList<node>();
        q.add(root);
        int res=0;

        while(q.isEmpty()==false){
            int count=q.size();
            res=Math.max(res, count);
            for(int i=0;i<count;i++){
                node curr=q.poll();
                // System.out.print(curr.key+" ");
                
                
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            // System.out.println();
        }
        System.out.println("Maximum width is "+res);
        return res;
    }
    public static void main(String[] args) {
        node root=new node(40);
        root.left=new node(67);
        root.right=new node(78);
        root.left.left=new node(7);

        System.out.println( check_maximumWidth(root));
    }
}
