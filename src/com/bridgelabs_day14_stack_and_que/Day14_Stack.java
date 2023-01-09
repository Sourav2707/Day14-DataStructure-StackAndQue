package com.bridgelabs_day14_stack_and_que;

public class Day14_Stack {
    private Node top;
    public Day14_Stack()
    {
        this.top = null;
    }
    public void uc1_push(int value)
    {
        Node node = new Node(value);
        if (this.top == null) //if top is null then it is null
            node.next = null;
        else
            node.next = this.top; //else top is fed to node's next
        this.top = node;
        System.out.println(value+" pushed to stack ");
    }
    public void get()
    {
        Node temp = this.top;
        while (temp != null)
        {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}
