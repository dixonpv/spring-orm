/**
 * 
 */
package com.dixon.spring.springorm.product.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dixon.spring.springorm.entity.Product;
import com.dixon.spring.springorm.product.dao.ProductDao;
import com.dixon.spring.springorm.product.dao.ProductDaoImpl;

/**
 * @author dixon
 *
 */
public class Test {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/dixon/spring/springorm/product/test/config.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDaoImpl");
		Product product = new Product();	
        product.setId(11);
        product.setName("Iphone");
        product.setPrice(100.00);
        product.setDesc("Mobile Phone");
		productDao.create(product);


	}

}
