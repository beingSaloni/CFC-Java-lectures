package com.company.lecture20;

public class CircularQueue {
    protected Integer[] data;
    protected int front ;
    protected int end;
    protected int size;
    protected static  final int DEFAULT_SIZE = 10;
    public CircularQueue(int size){
        this.data = new Integer[size];
        this.end=-1;
        this.front=0;
        this.size = 0;
    }

    CircularQueue(){
        this(DEFAULT_SIZE); // calling above constructor with size = DEFAULT_SIZE
    }
    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue Overflow !");
            return;
        }
        this.end =(this.end+1)% this.data.length;
        this.data[end]=value;
        this.size++;
    }
    protected boolean isFull(){
        return this.end == this.data.length;
    }
    public Integer dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty!!!");
            return null;
        }
        int temp = this.data[0];
        this.front = (this.front+1)% this.data.length;
        this.size--;
        return temp;
    }



    private boolean isEmpty() {
        return this.size==0;
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder("Queue: ");
        for (int i = 0; i <= end; i++) {
            str.append(this.data[i]).append(" ");

        }
        return str.toString();
    }
}
