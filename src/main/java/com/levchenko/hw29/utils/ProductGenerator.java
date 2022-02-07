package com.levchenko.hw29.utils;

import com.levchenko.hw29.model.NotifiableProduct;
import com.levchenko.hw29.model.ProductBundle;
import lombok.Getter;

import java.util.Random;
@Getter
public class ProductGenerator {

   public Random random = new Random();

    public ProductBundle generateBundleProduct() {
        ProductBundle productBundle = new ProductBundle();
        productBundle.setAmount(random.nextInt(15));
        productBundle.setAvailable(random.nextBoolean());
        productBundle.setChannel(random.nextBoolean() + "" + random.nextDouble());
        productBundle.setPrice(random.nextDouble());
        productBundle.setId(random.nextLong());
        productBundle.setTitle(random.nextFloat() + "" + random.nextDouble());
        return productBundle;
    }

    public NotifiableProduct generateNotifiableProduct() {
        NotifiableProduct product = new NotifiableProduct();
        product.setId(random.nextLong());
        product.setTitle(random.nextFloat() + "" + random.nextDouble());
        product.setAvailable(random.nextBoolean());
        product.setChannel(random.nextBoolean() + "" + random.nextDouble());
        product.setPrice(random.nextDouble());
        return product;
    }
}


