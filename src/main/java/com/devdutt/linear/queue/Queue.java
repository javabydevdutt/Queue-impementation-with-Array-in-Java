package com.devdutt.linear.queue;

/* Time Complexity:-
    Insertion:- O(1)
    Deletion:- O(n)
    Peek:- O(n)
* */
public class Queue {
    int arr[] = null;
    int capacity = 5;
    int rear = -1;

    public Queue() {
        arr = new int[capacity];
    }

    public Queue(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
    }

    public boolean isFull() {
        return (rear + 1) == capacity;
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full, can't insert");
            return;
        }
        rear = rear + 1;
        arr[rear] = data;
        System.out.println(data + " is insert in the queue");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int front = arr[0];
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        return front;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[0];
    }


    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(20);
        System.out.println("Peek:- " + q.peek());
        q.enqueue(40);
        q.enqueue(10);
        q.enqueue(30);
        q.enqueue(50);
        System.out.println("Peek:- " + q.peek());
        q.enqueue(60);
        System.out.println("==============================");
        System.out.println(q.dequeue());
        System.out.println("Peek:- " + q.peek());
    }
}//class
