package org.example;

public class Queue extends DoubleLinkedList {
    public Queue(){
        super();
    }

    public void enqueue(int element){
        super.addElementOnTop(element);
    }

    public int dequeue(){
        int element = super.getDown();
        super.deleteElementFromDown();
        return element;
    }

    public boolean isEmpty(){
        return super.getSize() == 0;
    }

}
