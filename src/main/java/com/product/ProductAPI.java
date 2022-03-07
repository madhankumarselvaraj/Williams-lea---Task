/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.product;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Madhankumar Selvaraj
 */
@RestController
public class ProductAPI {

@Autowired
ProductService prodService;

@RequestMapping(value = "/productlist", method = RequestMethod.GET)
public List getAllProductList() {
    return prodService.getAllProduct();
}

@RequestMapping(value = "/createproduct", method = RequestMethod.POST)
public String createProduct(@RequestBody Product product) {
    prodService.createProduct(product);
    return product.getProdname();
}

@RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
public List<Product> getSpecificProduct(@PathVariable("id") int id) {
    return prodService.getSpecificProduct(id);
}

}
