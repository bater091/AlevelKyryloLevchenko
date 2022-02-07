package com.levchenko.hw29.a.model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;
@Setter
@Getter
public class Storage {
    private Map<Long, NotifiableProduct> notifiableStorage = new HashMap<>();
    private Map<Long, ProductBundle> bundleStorage = new HashMap<>();
    private Map<Long, Product> storage = new HashMap<>();
}
