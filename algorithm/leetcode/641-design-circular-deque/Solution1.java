class Solution1{
    int size = 0;
    int initialCapacity = 0;
    LinKNode head, tail;
    /** Initialize your data structure here. Set the size of the deque to be k. */
    public Solution1(int k) {
        head = tail = null;
        initialCapacity = k;
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if (size == initialCapacity) {
            return false;
        }
        LinKNode node = new LinKNode(value);
        if (head == null) {
            head = tail = node;
            head.next = tail;
            tail.pre = head;
        } else {
            node.next = head;
            node.pre = head.pre;
            head.pre = node;
            head = node;
            tail.next = head;
        }
        size ++;
        return true;
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if (size == initialCapacity) {
            return false;
        }
        LinKNode node = new LinKNode(value);
        if (head == null) {
            head = tail = node;
            head.next = tail;
            tail.pre = head;
        } else {

            node.next = tail.next;
            node.pre = tail;
            tail.next = node;
            tail = node;
            head.pre = tail;
        }
        size ++;
        return true;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if (size == 0) {
            return false;
        }
        if (head == tail) {
            head = tail = null;
            size --;
            return true;
        }
        LinKNode newHead = head.next;
        newHead.pre = head.pre;
        tail.next = newHead;
        head = newHead;
        size --;
        return true;

    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if (size == 0) {
            return false;
        }
        if (head == tail) {
            head = tail = null;
            size --;
            return true;
        }
        System.out.println("start to delete last");
        LinKNode nTail = tail.pre;
        nTail.next = tail.next;
        head.pre = nTail;
        tail= nTail;
        size --;
        return true;
    }

    /** Get the front item from the deque. */
    public int getFront() {
        if (size == 0) {
            return -1;
        }
        return head.value;
    }

    /** Get the last item from the deque. */
    public int getRear() {
        if (size == 0) {
            return -1;
        }
        if(tail == null){
        //printDequeue();
        System.out.println("head = "+head + " tail = "+ tail +" size = "+ size);
        }
        return tail.value;
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        if (size == 0)
            return true;
        else return false;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        if (size ==  initialCapacity)
            return true;
        else return false;
    }
}

class LinKNode {
    int value;
    LinKNode next;
    LinKNode pre;
    LinKNode (int value) {
        this.value = value;
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