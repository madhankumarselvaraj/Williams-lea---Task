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
private int prodrecid;
@Column
private String prodname;
@Column
private float prodcost;

public int getProdrecid() {
    return prodrecid;
}

public void setProdrecid(int prodrecid) {
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

}
