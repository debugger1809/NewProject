package com.group6.pro.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Set;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;


import com.group6.pro.model.Kitchens;
import com.group6.pro.model.Product;
import com.group6.pro.model.ServiceProvider;
import com.group6.pro.repository.ProductRepository;
import com.group6.pro.repository.RoleRepository;
import com.group6.pro.repository.UserRepository;

@RunWith(MockitoJUnitRunner.class)
class ProductServiceTest {
	@MockBean
    private ProductRepository productRepo;
	

    @Autowired
    private ProductService productService;

    
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void saveTest() {
		Product p=new Product();
		p.setId(0);
		p.setName("Pizza");
		p.setPhoto("Pizza.png");
		p.setPrice(5.0);
		Kitchens k=new Kitchens();
		p.setKitchen(k);
		productService.save(p);
		when(productRepo.save(p)).thenReturn(p);
		//assertEquals(p,productService.save(p));
		
		//assertThat(productService.save(p)).isEqualTo(productRepo.save(p));
	}
	

}
