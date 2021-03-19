package com.company;

import java.util.LinkedList;

public class MyQueue<T> {
    private LinkedList<T> queue;

    public MyQueue(LinkedList<T> list) {
        queue = new LinkedList<>(list);
    }

    public LinkedList<T> getQueue() {
        return queue;
    }
    public boolean isEmpty (){
        return this.queue.isEmpty();
    }
    public void offer(T e){
        queue.addFirst(e);
    }
    public T pool(){
        Object last = queue.getLast();
        queue.remove(queue.size()-1);
        return (T)last;
    }
    public T peek(){
        return queue.getLast();
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "list=" + queue +
                '}';
    }
}
