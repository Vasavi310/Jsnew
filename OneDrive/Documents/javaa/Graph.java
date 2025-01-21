import java.util.*;
public class Graph {
    int n;
    int order;
    int[] vis;
    int[] low;
    int[][] a;
    Set<Integer> s;
    public Graph(int n)
    {
        this.n=n;
        order=1;
        vis=new int[n];
        low=new int[n];
        a=new int[n][n];
        s=new HashSet<>();
    }
    public void read(Scanner sc)
    {
        System.out.println("Enter");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
    }
    public void dfs(int u,int v)
    {
        int children=0;
        low[u]=vis[u]=order++;
        for(int j=0;j<n;j++)
        {
            if(a[u][j]==1 && vis[j]==0)
            {
                if(v==-1)
                   children++;
                dfs(j,u);
                if(v!=-1 && low[j]>=low[u])
                   s.add(u);
                low[u]=Math.min(low[j],low[u]);
            }
            else if(j!=v)
            {
                low[u]=Math.min(low[u],low[j]);
            }
        }
        if(v==-1 && children>1)
           s.add(u);
    }
    public void print() {
        System.out.println("Visited order: " + Arrays.toString(vis));
        System.out.println("Articulation points: " + s);
    }
}