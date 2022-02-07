
package com.levchenko.hw29.repository;


import com.levchenko.hw29.model.NotifiableProduct;
import com.levchenko.hw29.model.Product;
import com.levchenko.hw29.model.ProductBundle;

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