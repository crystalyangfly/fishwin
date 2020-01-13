class Solution2 {

    int[] cDeque;
    int front;
    int rear;
    int capacity;
    /** Initialize your data structure here. Set the size of the deque to be k. */
    public Solution2(int k) {
        capacity = k + 1;
        cDeque = new int[capacity];
        front = rear = 0;

    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if (isFull())
            return false;
        front = (front -1 + capacity) % capacity;
        cDeque[front] = value;
        return true;

    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if (isFull())
            return false;
        cDeque[rear] = value;
        rear = (rear +1)%capacity;
        return true;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if (isEmpty())
            return false;
        front = (front + 1)%capacity;
        return true;

    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if (isEmpty())
            return false;
        rear = (rear - 1 + capacity)%capacity;
        return true;

    }

    /** Get the front item from the deque. */
    public int getFront() {
        if (isEmpty())
            return -1;
        return cDeque[front];
    }

    /** Get the last item from the deque. */
    public int getRear() {
        if (isEmpty())
            return -1;
        return cDeque[(rear-1+capacity)%capacity];

    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        if (rear == front)
            return true;
        return false;

    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        if (front == (rear+1)%capacity)
            return true;
        return false;

    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */