package com.martapanc.datastructures;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(5);
        priorityQueue.offer(3);
        priorityQueue.offer(8);
        priorityQueue.offer(1);
        priorityQueue.offer(6);

        while (!priorityQueue.isEmpty()) {
            int element = priorityQueue.poll();
            System.out.print(element + " ");
        }
        System.out.println();

        PriorityQueue<String> priorityQueue2 = new PriorityQueue<>();

        priorityQueue2.offer("ciao");
        priorityQueue2.offer("marta");
        priorityQueue2.offer("come");
        priorityQueue2.offer("stai");

        while (!priorityQueue2.isEmpty()) {
            String element = priorityQueue2.poll();
            System.out.print(element + " ");
        }
    }
}
