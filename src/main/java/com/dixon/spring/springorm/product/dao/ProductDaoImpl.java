package com.dixon.spring.springorm.product.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
/**
 * @author dixon
 *
 */
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.dixon.spring.springorm.entity.Product;


@Component
public class ProductDaoImpl implements ProductDao {

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Override
	@Transactional
	public int create(Product product) {
	
		Integer save = (Integer) hibernateTemplate.save(product);
		return save;
	}

}
