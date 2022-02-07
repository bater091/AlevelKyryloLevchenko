package com.levchenko.hw29.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class NotifiableProduct extends Product implements BasicInfo, GeneratbleAddressForNotification {
    protected String channel;



    @Override
    public String getBasicInfo() {
        return "NotifiableProduct{" +
                "channel='" + channel + '\'' +
                ", id=" + id +
                ", available=" + available +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }



    @Override
    public String generateAddressForNotification() {
        return null;
    }
}