package com.myLib.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Assert;



@SpringBootTest
class Msa5ApplicationTests {

	@Autowired
	CustomerRepo repo;
	
	@BeforeEach
	public void setUp()
	{
		Customer c= new Customer();
		c.setId("C01");
		c.setName("Tarique");
		c.setAge(22);
		c.setGender('M');
		c.setPreferredFood("Non-Veg");
		repo.save(c);;
	}
	
	@Test
	void fetchTest()
	{
		Customer temp= repo.findById("C01").get();
		Assert.assertNotNull(temp);
	}
	
	@Test
	void createTest() {
		Customer a= new Customer();
		a.setId("C02");
		a.setName("John");
		a.setAge(24);
		a.setGender('M');
		a.setPreferredFood("Veg");
		repo.save(a);
		Assert.assertTrue(repo.existsById("C02"));
	}
	@Test
	public void deleteTest()
	{
		repo.deleteById("C01");
		Assert.assertFalse(repo.existsById("C01"));
	}
	
	@Test
	public void updateTest()
	{
		Customer temp= repo.findById("C01").get();
		temp.setName("Adam");
		repo.save(temp);
		Assert.assertEquals("Adam", repo.findById("C01").get().getName());
	}

}
