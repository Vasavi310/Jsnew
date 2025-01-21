import java.util.*;

public class MinimumMovesInGrid {

    static class Point {
        int x, y, moves;

        Point(int x, int y, int moves) {
            this.x = x;
            this.y = y;
            this.moves = moves;
        }
    }

    public static int bfsMinimumMoves(int[][] grid, int M, int N, Point src, Point dest, int[] moveRule) {
        Queue<Point> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.offer(src);
        visited.add(src.x + "," + src.y);

        
        int[][] directions = {
            {moveRule[0], moveRule[1]},   // Forward
            {moveRule[1], -moveRule[0]},  // Right
            {-moveRule[1], moveRule[0]},  // Left
            {-moveRule[0], -moveRule[1]}   // Backward
        };

        while (!queue.isEmpty()) {
            Point current = queue.poll();

         
            if (current.x == dest.x && current.y == dest.y) {
                return current.moves;
            }

            for (int[] dir : directions) {
                int newX = current.x + dir[0];
                int newY = current.y + dir[1];

               
                if (newX >= 0 && newX < M && newY >= 0 && newY < N && !visited.contains(newX + "," + newY)) {
                    if (grid[newX][newY] == 0) { // Valid cell
                        visited.add(newX + "," + newY);
                        queue.offer(new Point(newX, newY, current.moves + 1));
                    }
                }
            }
        }

        return -1; // Destination not reachable
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int[][] grid = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        Point src = new Point(scanner.nextInt(), scanner.nextInt(), 0);
        Point dest = new Point(scanner.nextInt(), scanner.nextInt(), 0);
        int[] moveRule = {scanner.nextInt(), scanner.nextInt()};

        int result = bfsMinimumMoves(grid, M, N, src, dest, moveRule);

              System.out.print(result);
    }
}