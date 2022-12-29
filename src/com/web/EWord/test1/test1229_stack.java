package com.web.EWord.test1;

interface Stack{
	boolean isEmpty();
	boolean isFull();
	void push(char item);
	char pop();
	char peek();
	void clear();
}

public class test1229_stack implements Stack {
	
	private int top;
	private int stackSize;
	private char stackArr[];
	
	public test1229_stack(int stackSize) {
		top = -1;
		this.stackSize = stackSize;
		stackArr = new char[this.stackSize];
	}

	@Override
	public boolean isEmpty() {
		return (top == -1);
	}

	@Override
	public boolean isFull() {
		return (top == this.stackSize-1);
	}

	@Override
	public void push(char item) {
		if(isFull()) {
			System.out.println("Stack is full");
		} else {
			stackArr[++top] = item;
			System.out.println("Inserted Item : " + item);
		}
	}

	@Override
	public char pop() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Stack is empty!");
			return 0;
		} else {
			System.out.println("Delected Item : " + stackArr[top]);
			return stackArr[top--];
		}
	}

	@Override
	public char peek() {
		if(isEmpty()) {
			System.out.println("Peeking fail! Stack is empty!");
			return 0;
		} else {
			System.out.println("Peeked Item : " + stackArr[top]);
			return stackArr[top];
		}
	}

	@Override
	public void clear() {
		if(isEmpty()) {
			System.out.println("Stack is already empty!");
		} else {
			top = -1;
			stackArr = new char[this.stackSize];
			System.out.println("Stack is clear!");
		}
	}
	
	public void printStack() {
        if(isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            System.out.print("Stack elements : ");
            for(int i=0; i<=top; i++) {
                System.out.print(stackArr[i] + " ");
            }
            System.out.println();
        }
    }
	
	public static void main(String[] args) {
		
		int stackSize = 5;
		test1229_stack arrStack = new test1229_stack(stackSize);
		
		arrStack.push('A');
		arrStack.printStack();
		
		arrStack.push('B');
		arrStack.printStack();
		
		arrStack.push('C');
		arrStack.printStack();
		
		arrStack.pop();
		arrStack.printStack();
		
		arrStack.pop();
		arrStack.printStack();
		
		arrStack.peek();
		arrStack.printStack();
		
		arrStack.clear();
		arrStack.printStack();
	}
}
