package com.company;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

public class TestStack<T> {
    private Stack<T> stack;

    public TestStack(Stack<T> stack) {
        this.stack = stack;
    }

    public TestStack(LinkedList<T> linkedList) {
        this.stack =new Stack<>();
        this.stack.addAll(linkedList);

    }


    public void testPush(T e){
        long time = System.nanoTime();
        stack.push(e);
        time = System.nanoTime() -time;
        System.out.println("Время затраченное на добавление элемента в стек, нс: " + time);
    }
    public void testPop(){
        long time = System.nanoTime();
        stack.pop();
        time = System.nanoTime() -time;
        System.out.println("Время затраченное на удаление элемента из стека, нс: " + time);
    }
    public void testPeek(){
        long time = System.nanoTime();
        stack.peek();
        time = System.nanoTime() -time;
        System.out.println("Время затраченное на просмотр вершины стека, нс: " + time);
    }

     public String toString(String str) {
        return str +"\n" + this.stack.toString() +"\n";
    }
}
