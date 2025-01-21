import java.util.*;
public class Articulation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Graph g=new Graph(n);
        g.read(sc);
        g.dfs(0,-1);
        g.print();
    }
}