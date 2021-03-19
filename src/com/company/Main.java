package com.company;

import java.util.LinkedList;
        import java.util.Queue;
        import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        LinkedList<MyClass> linkedList = getListMyClasses();
        //Задание №4.1

        TestStack<MyClass> testStack = new TestStack<>(linkedList);
        System.out.printf(testStack.toString("Задание №4.1 \nСтек на основе списка: "));
        testStack.testPush(new MyClass("Five","79100000005"));
        testStack.testPop();
        testStack.testPeek();

        //Задание №4.2

        TestQueue<MyClass> testQueue = new TestQueue<>(linkedList);
        System.out.printf(testQueue.toString("Задание №4.2 \nОчередь на основе списка: "));
        testQueue.testOffer(new MyClass("Six","79100000006"));
        testQueue.testPoll();
        testQueue.testPeek();

        //Задание №4.3

        TestDeque<MyClass> testDeque = new TestDeque<>(linkedList);
        System.out.printf(testDeque.toString("Задание №4.3 \nДек на основе списка: "));
        testDeque.testOffer(new MyClass("Seven","79100000007"));
        testDeque.testPoll();
        testDeque.testPeek();
        testDeque.testAddLast(new MyClass("Eight","79100000008"));
        testDeque.testPollLast();
        testDeque.testAddFirst(new MyClass("Nine","79100000009"));
        testDeque.testPollFirst();

        //Задание №4.4

        TestPriorityQueue priorityQueue = new TestPriorityQueue();
        priorityQueue.add(25);
        priorityQueue.add(0);
        priorityQueue.add(50);
        System.out.println(priorityQueue.toString("Задание №4.4 \nПриоритетная очередь: "));
        priorityQueue.testOffer(20);
        priorityQueue.testPeek();
        priorityQueue.testPoll();

        //Задание №4.5

        //Стек
        System.out.println("Задание №4.5 \nСтек: ");
        MyStack<MyClass> myStack =new MyStack<>(linkedList);
        System.out.println(myStack.toString());
        testPop(myStack);
        System.out.println(myStack.toString());
        testPeek(myStack);
        testPush(myStack, new MyClass("Ten", "+79100000010"));
        System.out.println(myStack.toString());

        //Очередь
        System.out.println("\nОчередь: ");
        MyQueue<MyClass> queue = new MyQueue<>(linkedList);
        System.out.println(queue.toString());
        testPoll(queue);
        System.out.println(queue.toString());
        testPeek(queue);
        testOffer(queue,new MyClass("Ten", "+79100000010"));
        System.out.println(queue.toString());

    }
    public static void testOffer(MyQueue<MyClass> queue, MyClass e){
        long time = System.nanoTime();
        queue.offer(e);
        time = System.nanoTime() -time;
        System.out.println("Время затраченное на добавление элемента в очередь, нс: " + time);
    }
    public static void testPoll(MyQueue<MyClass> queue){
        long time = System.nanoTime();
        queue.pool();
        time = System.nanoTime() -time;
        System.out.println("Время затраченное на удаление элемента из очереди, нс: " + time);
    }
    public static void testPeek(MyQueue<MyClass> queue ){
        long time = System.nanoTime();
        MyClass t =queue.peek();
        time = System.nanoTime() -time;
        System.out.println("Время затраченное на просмотр вершины "+t+" очереди, нс: " + time);
    }
    private static void testPush(MyStack<MyClass> myStack, MyClass e) {
        long time = System.nanoTime();
        myStack.push(e);
        time = System.nanoTime() -time;
        System.out.println("Время затраченное на добавление элемента в стек, нс: " + time);
    }
    private static void testPeek(MyStack<MyClass> myStack) {
        long time = System.nanoTime();
        MyClass t = myStack.peek();
        time = System.nanoTime() -time;
        System.out.println("Время затраченное на просмотр вершины стека " +t+", нс: " + time);
    }
    private static void testPop(MyStack<MyClass> myStack) {

        long time = System.nanoTime();
        myStack.pop();
        time = System.nanoTime() -time;
        System.out.println("Время затраченное на удаление элемента из стека, нс: " + time);
    }

    private static LinkedList<MyClass> getListMyClasses() {
        LinkedList<MyClass> linkedList = new LinkedList<>();
        linkedList.add(new MyClass("One", "+79100000001"));
        linkedList.add(new MyClass("Two", "+79100000002"));
        linkedList.add(new MyClass("Three", "+79100000003"));
        linkedList.add(new MyClass("Four", "+79100000004"));
        return linkedList;
    }
}

