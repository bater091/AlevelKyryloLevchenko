package com.levchenko.hw16;

import java.lang.reflect.Array;
import java.util.Iterator;


public class ArrayIterator<E> implements Iterator<E> {

    E[] arr;
    int arrIndex;

    public ArrayIterator(E[] arr) {
        this.arr = arr;
        this.arrIndex = 0;
    }


    @Override
    public boolean hasNext() {
        return arrIndex < arr.length;

    }

    @Override
    public E next() {

        return arr[arrIndex++];
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();


    }
}
