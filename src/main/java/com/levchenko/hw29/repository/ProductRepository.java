
package com.levchenko.hw29.repository;


import com.levchenko.hw29.model.NotifiableProduct;
import com.levchenko.hw29.model.Product;
import com.levchenko.hw29.model.ProductBundle;
import com.levchenko.hw29.model.Storage;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository {

  MySQLRepository mySQLRepository = new MySQLRepository();

  public void save(NotifiableProduct product){
      mySQLRepository.save(product);

  }
    public void save(ProductBundle product){
        mySQLRepository.save(product);

    }
  public List<Product> getAll(){
      return mySQLRepository.getAll();
  }

    public List<NotifiableProduct> getAllNotifiable(){
        return mySQLRepository.getAllNotifiable();
    }
    public List<ProductBundle> getAllBundle(){
        return mySQLRepository.getAllBundle();
    }


}