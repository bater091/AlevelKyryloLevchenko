package com.levchenko.hw15;

import lombok.Setter;

import java.util.Comparator;

public class BoxVolumeComparator implements Comparator<Box> {
    public int compare(Box a, Box b) {


        if (a.getVolume() < b.getVolume() && (a.getVolume() == 0 || b.getVolume() == 0)) {
            return -1;
        } else if (a.getVolume() > b.getVolume() && (a.getVolume() == 0 || b.getVolume() == 0) ) {
            return 1;
        } else if(a.getVolume() < b.getVolume()) {
            return 1;
        }else if(a.getVolume() > b.getVolume()){
            return -1;
        }else
            return -1;
    }


}
