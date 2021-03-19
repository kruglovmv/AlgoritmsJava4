package com.company;

import java.util.*;

public class TestDeque<T>  {
    private Deque<T> deque;

    public TestDeque(Deque<T> deque) {
        this.deque = deque;
    }

    public TestDeque(LinkedList<T> linkedList) {
        deque = new LinkedList<>(linkedList);

    }
    public void testAddFirst(T e){
        long time = System.nanoTime();
        deque.addFirst(e);
        time = System.nanoTime() -time;
        System.out.println("Время затраченное на добавление элемента в начало дек, нс: " + time);
    }
    public void testAddLast(T e){
        long time = System.nanoTime();
        deque.addLast(e);
        time = System.nanoTime() -time;
        System.out.println("Время затраченное на добавление элемента в конец дека, нс: " + time);
    }
    public void testPollFirst(){
        long time = System.nanoTime();
        deque.pollFirst();
        time = System.nanoTime() -time;
        System.out.println("Время затраченное на удаление элемента из начала дека, нс: " + time);
    }
    public void testPollLast(){
        long time = System.nanoTime();
        deque.pollLast();
        time = System.nanoTime() -time;
        System.out.println("Время затраченное на удаление элемента из конца дека, нс: " + time);
    }
    public void testOffer(T e){
        long time = System.nanoTime();
        deque.offer(e);
        time = System.nanoTime() -time;
        System.out.println("Время затраченное на добавление элемента в дек, нс: " + time);
    }
    public void testPoll(){
        long time = System.nanoTime();
        deque.poll();
        time = System.nanoTime() -time;
        System.out.println("Время затраченное на удаление элемента из дека, нс: " + time);
    }
    public void testPeek(){
        long time = System.nanoTime();
        deque.peek();
        time = System.nanoTime() -time;
        System.out.println("Время затраченное на просмотр вершины дека, нс: " + time);
    }

    public String toString(String str) {
        return str +"\n" + this.deque.toString() +"\n";
    }

}


