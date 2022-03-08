/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Madhankumar Selvaraj
 */
@Entity
@Table
public class Product {

@Id
@Column
@GeneratedValue
private Integer prodRecid;
@Column
private String prodName;
@Column
private float prodCost;

public Integer getProdRecid() {
    return prodRecid;
}

public void setProdRecid(Integer prodRecid) {
    this.prodRecid = prodRecid;
}

public String getProdName() {
    return prodName;
}

public void setProdName(String prodName) {
    this.prodName = prodName;
}

public float getProdCost() {
    return prodCost;
}

public void setProdCost(float prodCost) {
    this.prodCost = prodCost;
}

public Product() {
}

public Product(String prodName, float prodCost) {
    this.prodName = prodName;
    this.prodCost = prodCost;
}

}
