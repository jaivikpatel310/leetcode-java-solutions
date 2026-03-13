class MyCircularQueue {

    int[] arr;
    int front;
    int rear;
    int size;
    int count;

    public MyCircularQueue(int k) {
        arr = new int[k];
        size = k;
        front = 0;
        rear = -1;
        count = 0;
    }
    
    public boolean enQueue(int value) {
        if(count == size) return false;
        rear = (rear + 1) % size;
        arr[rear] = value;
        count++;
        return true;
    }
    
    public boolean deQueue() {
        if(count == 0) return false;
        front = (front + 1) % size;
        count--;
        return true;
    }
    
    public int Front() {
        if(count == 0) return -1;
        return arr[front];
    }
    
    public int Rear() {
        if(count == 0) return -1;
        return arr[rear];
    }
    
    public boolean isEmpty() {
        return count == 0;
    }
    
    public boolean isFull() {
        return count == size;
    }
}
