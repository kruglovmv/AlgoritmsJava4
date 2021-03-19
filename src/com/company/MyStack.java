package com.company;

import java.util.LinkedList;

public class MyStack<T>  {
    private LinkedList<T> stack;


    public MyStack(LinkedList<T> list) {
        this.stack = new LinkedList<>(list);
    }

    public LinkedList<T> getList() {
        return stack;
    }

    public boolean isEmpty (){
        return this.stack.isEmpty();
    }
    public void push(T e){
        stack.add(e);
    }
    public T pop(){
        Object last = stack.getLast();
        stack.remove(stack.size()-1);
        return (T)last;
    }
    public T peek(){
        return stack.getLast();
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "list=" + stack +
                '}';
    }
}
