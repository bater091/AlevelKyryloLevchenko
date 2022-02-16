package com.levchenko.hw31;

import lombok.Getter;
import lombok.Setter;
import org.xml.sax.SAXException;

import javax.persistence.criteria.CriteriaBuilder;
import javax.xml.bind.JAXBException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SimpleNumbersCounterThread extends Thread {
    Storage storage;
    int count;

    public SimpleNumbersCounterThread(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {


        while(storage.iterator.hasNext()){
            int t = storage.iterator.next();
            if(t == 1){
                count++;
                break;
            }
            int i = 2;
            while (i < t){
                count++;
                if(t % i == 0){
                    count--;
                    break;
                }else if (t-1 == i){break;}
                i++;
                count--;
            }


            }
        }








    public static void main(String[] args) throws InterruptedException, JAXBException, SAXException {
        LinkedList<Integer > list = new LinkedList<>();
        for (int i = 1; i < 100; i++) {
            list.add(i);

        }
        Storage storage = new Storage(list);
        SimpleNumbersCounterThread simpleNumbersCounterThread1 = new SimpleNumbersCounterThread(storage);
        SimpleNumbersCounterThread simpleNumbersCounterThread2 = new SimpleNumbersCounterThread(storage);
        simpleNumbersCounterThread1.run();
        simpleNumbersCounterThread2.run();
        System.out.println(simpleNumbersCounterThread1.count);
        System.out.println(simpleNumbersCounterThread2.count);
        int result = simpleNumbersCounterThread1.count + simpleNumbersCounterThread2.count;
        System.out.println("result = " + result);





    }
}

