package com.levchenko.hw9;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Passenger {
    private String passengerName;
    private boolean seatFlag;

    public void setSeatFlag(boolean seatFlag) {
        this.seatFlag = seatFlag;
    }
}
