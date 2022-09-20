package graph;

import java.util.Arrays;

public class Prism_Algorithm {
    public static void main(String[] args) {
        int graph[][]=new int[][]{{0,5,8,0},
                                  {5,0,10,15},
                                  {8,10,0,20},
                                  {0,15,20,0}};
    
    System.out.print(prismMST(graph));
    }
    static final int V=4;
    static int prismMST(int graph[][]){
        int[] key=new int[V];
        int res=0;
        Arrays.fill(key,Integer.MAX_VALUE);
        boolean[] mSet=new boolean[V];
        key[0]=0;
        for(int i=0;i<V;i++){
            int u=-1;
            for(int j=0;j<V;j++){
                if(!mSet[j]&&(u==-1||key[j]<key[u])){
                    u=j;
                }
            }
            mSet[u]=true;
            res+=key[u];

            for(int v=0;v<V;v++){
                if(graph[u][v]!=0&&mSet[v]==false){
                    key[v]=Math.min(key[v],graph[u][v]);
                }
            }
        }
        return res;
    }
}
