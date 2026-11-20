class Queue {
    int a[] = new int[5];
    int front = 0, rear = -1;
    int insert(int x) {
        rear++;
        a[rear] = x;
        return x;
    }
    int delete() {
        int x = a[front];
        front++;
        return x;
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println("Inserted: " + q.insert(10));
        System.out.println("Inserted: " + q.insert(20));
        System.out.println("Inserted: " + q.insert(30));
        System.out.println("Deleted: " + q.delete());
    }
}
