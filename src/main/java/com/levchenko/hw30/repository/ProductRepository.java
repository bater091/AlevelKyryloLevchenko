
package com.levchenko.hw30.repository;


import com.levchenko.hw30.model.NotifiableProduct;
import com.levchenko.hw30.model.Product;
import com.levchenko.hw30.model.ProductBundle;

import java.util.List;

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