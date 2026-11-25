import java.util.*;
public class Bfs {
    public static void main(String[] args) {
        Map<Character, List<Character>> graph = new HashMap<>();
        for (char c = 'A'; c <= 'F'; c++) {
            graph.put(c, new ArrayList<>());
        }
        graph.get('A').add('B');
        graph.get('A').add('C');
        graph.get('B').add('D');
        graph.get('C').add('E');
        graph.get('D').add('F');
        Set<Character> visited = new HashSet<>();
        java.util.Queue<Character> queue = new LinkedList<>();
        queue.add('A');        // start node
        visited.add('A');
        while (!queue.isEmpty()) {
            char node = queue.poll();
            System.out.print(node + " ");
            for (char next : graph.get(node)) {
                if (!visited.contains(next)) {
                    visited.add(next);
                    queue.add(next);
                }
            }
        }
    }
}