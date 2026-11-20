class Stack {
    int a[] = new int[5];
    int top = -1;
    int push(int x) {
        top++;
        a[top] = x;
        return x;
    }
    int pop() {
        int x = a[top];
        top--;
        return x;
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println("Inserted: " + s.push(10));
        System.out.println("Inserted: " + s.push(20));
        System.out.println("Inserted: " + s.push(30));
        System.out.println("Deleted: " + s.pop());
    }
}
