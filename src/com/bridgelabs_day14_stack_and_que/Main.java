package com.bridgelabs_day14_stack_and_que;

public class Main {
    public static void main(String[] args) {
        Day14_Queue queue = new Day14_Queue();
        queue.uc3_enqueue(56);
        queue.uc3_enqueue(30);
        queue.uc3_enqueue(70);
        queue.get();
        queue.uc4_dequeue();
        queue.get();
    }
}
