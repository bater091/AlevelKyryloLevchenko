package com.levchenko.hw30.repository;

import com.levchenko.hw30.model.NotifiableProduct;
import com.levchenko.hw30.model.Product;
import com.levchenko.hw30.model.ProductBundle;
import com.levchenko.hw30.model.Storage;

import java.util.ArrayList;
import java.util.List;

public class MySQLRepository {
    Storage storage = new Storage();
    public Product save(NotifiableProduct product) {
        storage.getStorage().put(product.getId(), product);
        return storage.getNotifiableStorage().put(product.getId(), product);
    }
    public Product save(ProductBundle product) {
        storage.getStorage().put(product.getId(), product);
        return storage.getBundleStorage().put(product.getId(), product);
    }
    public List<Product> getAll() {
        return new ArrayList<>(storage.getStorage().values());
    }
    public List<NotifiableProduct> getAllNotifiable() {
        return new ArrayList<>(storage.getNotifiableStorage().values());
    }
    public List<ProductBundle> getAllBundle() {
        return new ArrayList<>(storage.getBundleStorage().values());
    }
}
