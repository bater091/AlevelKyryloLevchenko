package com.levchenko.hw31;

import lombok.Getter;
import org.apache.commons.collections.iterators.ArrayIterator;
import org.apache.commons.collections.iterators.ArrayListIterator;


import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;

@Getter
public class Storage {
    public volatile LinkedList<Integer> list;
    public volatile ListIterator<Integer> iterator;



    public Storage(LinkedList<Integer> list) {
        this.list = list;
        this.iterator = list.listIterator();

    }
}

