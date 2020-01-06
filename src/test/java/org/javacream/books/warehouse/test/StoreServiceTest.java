package org.javacream.books.warehouse.test;

import org.javacream.store.impl.SimpleStoreService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class StoreServiceTest {

	@Autowired
	private SimpleStoreService simpleStoreService;
	@Test
	public void testBusinessObjects() {
		System.out.println(simpleStoreService.getStock("books", "ISBN1"));

	}

	

}
