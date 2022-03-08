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
private Integer prodrecid;
@Column
private String prodname;
@Column
private float prodcost;

public Integer getProdrecid() {
    return prodrecid;
}

public void setProdrecid(Integer prodrecid) {
    this.prodrecid = prodrecid;
}

public String getProdname() {
    return prodname;
}

public void setProdname(String prodname) {
    this.prodname = prodname;
}

public float getProdcost() {
    return prodcost;
}

public void setProdcost(float prodcost) {
    this.prodcost = prodcost;
}

public Product() {
}

public Product(String prodname, float prodcost) {
    this.prodname = prodname;
    this.prodcost = prodcost;
}

}
