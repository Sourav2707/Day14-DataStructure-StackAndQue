package com.bridgelabs_day14_stack_and_que;

public class Day14_Queue {
    Node head = null;
    public void uc3_enqueue(int data) {
        Node node = new Node(data);
        if (head == null) //as usual if head is null we are feeding the node data to head
            head = node;
        else
        {
            Node temp = head; //if head is not null feeding head data to temp
            while (temp.next != null) //looping till the temp.next becomes null
            {
                temp = temp.next;
            }
            temp.next = node;
            //node.next = head;

        }
        System.out.println((node.data)+" inserted into queue ");
    }
    public void uc4_dequeue() { //head wil be rmeoved
        if (head == null)
        {
            System.out.println("\nQueue is empty");
        }
        else
        {
            System.out.println("\nTaken out " + head.data + " from the que");
            head = head.next;
        }
    }

    public void get() {
        Node temp = this.head;
        if (temp == null)
        {
            System.out.println("Queue is empty");
            return;

        }
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}
