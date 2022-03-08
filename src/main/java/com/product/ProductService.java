/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.product;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Madhankumar Selvaraj
 */
@Service
public class ProductService {

@Autowired
ProductRepository productRep;

public List<String> getAllProductNames() {
    List<String> product = new ArrayList<String>();
    productRep.findAll().forEach(prod -> product.add(prod.getProdName()));
    return product;
}

public void createProduct(Product product) {
    productRep.save(product);
}

public List<Product> getSpecificProduct(Integer prodId) {
    List<Product> getProductList = new ArrayList();
    getProductList.add(productRep.findById(prodId).get());
    return getProductList;
}

}
