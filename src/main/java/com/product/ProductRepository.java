/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.product;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Madhankumar Selvaraj
 */
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
