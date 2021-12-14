package com.levchenko.hw15;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class BoxVolumeComparatorTest {
    Box box1 = new Box(2);
    Box box2 = new Box(1);

    BoxVolumeComparator boxVolumeComparator = new BoxVolumeComparator();


    @Test
    public void compareNegative() {
        box1.setVolume(1);
        box2.setVolume(2);

        Assert.assertEquals(1, boxVolumeComparator.compare(box1, box2));
    }

    @Test
    public void comparePositive() {
        box1.setVolume(2);
        box2.setVolume(1);
        Assert.assertEquals(-1, boxVolumeComparator.compare(box1, box2));
    }

    @Test
    public void compareEquals() {
        box1.setVolume(2);
        box2.setVolume(2);
        Assert.assertEquals(1, boxVolumeComparator.compare(box1, box2));
    }

}