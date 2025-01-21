import java.util.*;
class Graph {
    int n;
    int order;
    int[] vis;
    int[] low;
    int[][] a;
    Set<Integer> s;

    public Graph(int n) {
        this.n = n;
        order = 1;
        vis = new int[n];
        low = new int[n];
        a = new int[n][n];
        s = new HashSet<>();
    }

    public void read(Scanner sc) {
        System.out.println("Enter");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    public void dfs(int u, int v) {
        vis[u] = order++;
        low[u] = vis[u];
        int children = 0;

        for (int j = 0; j < n; j++) {
            if (a[u][j] == 1 && vis[j] == 0) {
                if (v == -1)
                    children++;
                dfs(j, u);
                if (v != -1 && low[j] >= low[u])
                    s.add(u);
                low[u] = Math.min(low[u], low[j]);
            } else if (j != v) {
                low[u] = Math.min(low[u], vis[j]);
            }
        }

        if (v == -1 && children > 1)
            s.add(u);
    }

    public void print() {
        System.out.println("Visited order: " + Arrays.toString(vis));
        System.out.println("Articulation points: " + s);
    }
}

public class Articulationp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Graph g = new Graph(n);
        g.read(sc);
        g.dfs(0, -1);
        g.print();
    }
}
