package com.levchenko.hw15;


import lombok.Getter;

@Getter
public class MyList<E> {
    private MyNode<E> head;
    private MyNode<E> tail;

    public void add(E value) {
        MyNode<E> newNode = new MyNode<>();
        if (head == null) {
            newNode.setValue(value);
            newNode.setNext(head);
            newNode.setPrev(tail);
            head = newNode;
            tail = newNode;


        } else {
            newNode.setValue(value);
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;

        }


    }

    public E getFromLast(E value) {
        MyNode<E> temp = tail;

        if(head == null ){
            return null;
        }
        while (!value.equals(temp.getValue())) {
            if (temp == head && temp.getValue() != value) {
                return null;

            }
            temp = temp.getPrev();


        }
        return temp.getValue();
    }
}




