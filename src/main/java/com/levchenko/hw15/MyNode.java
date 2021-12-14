package com.levchenko.hw15;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MyNode<E> {
    private E value;
    private MyNode<E> next;
    private MyNode<E> prev;
}
