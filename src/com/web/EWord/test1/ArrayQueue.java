package com.web.EWord.test1;

interface Queue {
    boolean isEmpty();
    boolean isFull();
    void enqueue(char item);
    char dequeue();
    char peek();
    void clear();
}

public class ArrayQueue implements Queue {

	private int front;
    private int rear;
    private int queueSize;
    private char queueArr[];
	
    public ArrayQueue(int queueSize) {
        front = -1;    // front 포인터 초기화
        rear = -1;    // rear 포인터 초기화
        this.queueSize = queueSize;    // queue 사이즈 설정
        queueArr = new char[this.queueSize];    // 큐 배열 생성
    }

	@Override
	public boolean isEmpty() {
		if(front == rear) {
			front = -1;
			rear = -1;
		}
		return (front == rear);
	}

	@Override
	public boolean isFull() {
		return (rear == this.queueSize-1);
	}

	@Override
	public void enqueue(char item) {
		if(isFull()) {
			System.out.println("Queue is full!");
		} else {
			queueArr[++rear] = item;
			System.out.println("Inserted Item : " + item);
		}
	}

	@Override
	public char dequeue() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Queue is empty!");
			return 0;
		}else {
			System.out.println("Deleted Item : " + queueArr[front+1]);
			front = (front + 1) % this.queueSize;
			
			return queueArr[front];
		}
	}

	@Override
	public char peek() {
		if(isEmpty()) {
			System.out.println("Peeking fail! Queue is empty");
			return 0;
		} else {
			System.out.println("Peeked Item : " + queueArr[front+1]);
			return queueArr[front+1];
		}
	}

	@Override
	public void clear() {
		if(isEmpty()) {
			System.out.println("Queue is already empty!");
		} else {
			front = -1;
			rear = -1;
			queueArr = new char[this.queueSize];
			System.out.println("Queue is clear!");
		}
	}
	
	public void printQueue() {
		if(isEmpty()) {
			System.out.println("Queue is empty!");
		} else {
			System.out.print("Queue elements : ");
			for(int i = front+1; i<=rear; i++) {
				System.out.print(queueArr[i] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int queueSize = 5;
		ArrayQueue arrQueue = new ArrayQueue(queueSize);
		
		arrQueue.enqueue('A');
		arrQueue.printQueue();
		
		arrQueue.enqueue('B');
		arrQueue.printQueue();
		
		arrQueue.enqueue('C');
		arrQueue.printQueue();
		
		arrQueue.enqueue('D');
		arrQueue.printQueue();
		
		arrQueue.enqueue('E');
		arrQueue.printQueue();
		
		arrQueue.dequeue();
		arrQueue.printQueue();
		
		arrQueue.dequeue();
		arrQueue.printQueue();
		
		arrQueue.dequeue();
		arrQueue.printQueue();
		
		arrQueue.dequeue();
		arrQueue.printQueue();
		
		arrQueue.peek();
		arrQueue.printQueue();
		
		arrQueue.clear();
		arrQueue.printQueue();
	}
	
}
