package org.example;

public class Stack extends DoubleLinkedList{
    public Stack(){
        super();
    }

    public void push(int element){
        super.addElementOnTop(element);
    }

    public int pop(){
        int element = super.getTop();
        super.deleteElementFromTop();
        return element;
    }

    public boolean isEmpty(){
        return super.getSize() == 0;
    }
}
