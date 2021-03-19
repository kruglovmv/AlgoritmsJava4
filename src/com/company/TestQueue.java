package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TestQueue<T> {
    private Queue<T> queue;

    public TestQueue(Queue<T> queue) {
        this.queue = queue;
    }

    public TestQueue(LinkedList<T> linkedList) {
        queue = new LinkedList<>(linkedList);

    }
    public void testOffer(T e){
        long time = System.nanoTime();
        queue.offer(e);
        time = System.nanoTime() -time;
        System.out.println("Время затраченное на добавление элемента в очередь, нс: " + time);
    }
    public void testPoll(){
        long time = System.nanoTime();
        queue.poll();
        time = System.nanoTime() -time;
        System.out.println("Время затраченное на удаление элемента из очереди, нс: " + time);
    }
    public void testPeek(){
        long time = System.nanoTime();
        queue.peek();
        time = System.nanoTime() -time;
        System.out.println("Время затраченное на просмотр вершины очереди, нс: " + time);
    }

    public String toString(String str) {
        return str +"\n" + this.queue.toString() +"\n";
    }
}
