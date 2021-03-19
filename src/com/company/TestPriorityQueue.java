package com.company;

import java.util.PriorityQueue;

public class TestPriorityQueue <T extends Object>extends PriorityQueue{


    public TestPriorityQueue() {
        super();
    }

    public void testOffer(T e){
        long time = System.nanoTime();
        this.offer(e);
        time = System.nanoTime() -time;
        System.out.println("Время затраченное на добавление элемента в приоритетную очередь, нс: " + time);
    }
    public void testPoll(){
        long time = System.nanoTime();
        this.poll();
        time = System.nanoTime() -time;
        System.out.println("Время затраченное на удаление элемента из приоритетной очереди, нс: " + time);
    }
    public void testPeek(){
        long time = System.nanoTime();
        this.peek();
        time = System.nanoTime() -time;
        System.out.println("Время затраченное на просмотр вершины приоритетной очереди, нс: " + time);
    }

    public String toString(String str) {
        return str +"\n" + this.toString();
    }
}

