package com.levchenko.hw29.utils;

import com.levchenko.hw29.model.NotifiableProduct;
import com.levchenko.hw29.model.Product;
import com.levchenko.hw29.model.ProductBundle;
import com.levchenko.hw29.repository.ProductRepository;

import java.util.List;

public class ProductUtils {
    private ProductRepository repository = new ProductRepository();
    ProductGenerator productGenerator = new ProductGenerator();

    public void saveNotifiableProduct(NotifiableProduct product) {
        repository.save( product);
    }
    public void saveProductBundle(ProductBundle product) {
        repository.save( product);
    }

    public int notifiableCount(){
        return repository.getAllNotifiable().size();

    }


    public List<Product> getAll() {
        return repository.getAll();
    }

    public Product generateRandomProduct(){
        if( productGenerator.random.nextBoolean()) {
            return productGenerator.generateBundleProduct();
        }else {
            return productGenerator.generateNotifiableProduct();
        }
    }

}