package com.levchenko.hw15;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.Assert.*;

public class MyListTest {
    MyList<String> myList = new MyList<>();


    @Before
    public void set() {
        myList.add("test1");
        myList.add("test2");
        myList.add("test3");
    }

    @Test
    public void add() {


        Assert.assertEquals(myList.getHead().getValue(), "test1");
        Assert.assertEquals(myList.getTail().getValue(), "test3");


    }

    @Test
    public void getFromLast() {

        Assert.assertEquals(myList.getFromLast("test1"), "test1");


    }

    @Test
    public void getFromLastNull() {

        assertNull(myList.getFromLast("test4"));


    }
}