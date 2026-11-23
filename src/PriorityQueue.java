import java.util.PriorityQueue;
class Priority {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);
        System.out.println("Priority Queue: " + pq);
        System.out.println("Removed: " + pq.poll());
        System.out.println("After removing: " + pq);
        System.out.println("Top element: " + pq.peek());
    }
}
