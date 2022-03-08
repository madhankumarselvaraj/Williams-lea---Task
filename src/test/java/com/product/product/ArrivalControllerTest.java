/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.product.product;

import com.product.Product;
import com.product.ProductRepository;
import java.util.List;
import java.util.Optional;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author Madhankumar Selvaraj
 */
@ActiveProfiles("test") // Active profile load application context for test class.
@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = NONE)
public class ArrivalControllerTest {

@Autowired
private TestEntityManager entityManager;

@Autowired
private ProductRepository prodrep;

@Test
public void whenFindAll() {
    //given
    Product prdOne = new Product();
    prdOne.setProdcost((float) 100.34);
    prdOne.setProdname("Mobile");
    entityManager.persist(prdOne);
    entityManager.flush();

    Product prdTwo = new Product();
    prdTwo.setProdcost((float) 100.34);
    prdTwo.setProdname("Laptop");
    entityManager.persist(prdTwo);
    entityManager.flush();

    //when
    List<Product> prodDet = (List<Product>) prodrep.findAll();
    System.out.println("prodDet " + prodDet);

    //then
    assertThat(prodDet.size()).isEqualTo(2);
    assertThat(prodDet.get(0)).isEqualTo(prdOne);
    assertThat(prodDet.get(1)).isEqualTo(prdTwo);
}

@Test
public void whenFindAllById() {
    //given
    Product prod = new Product();
    prod.setProdname("Mobiles");
    entityManager.persist(prod);
    entityManager.flush();

    //when
    Optional<Product> testProd = prodrep.findById(prod.getProdrecid());

    //then
    assertThat(testProd.get().getProdname()).isEqualTo(prod.getProdname());
}

@Test
public void whenSaveNewProduct() {
    Product savedProduct = prodrep.save(new Product("iPhone 10", (float) 789.32));

    assertThat(savedProduct.getProdrecid()).isGreaterThan(0);
}

}
