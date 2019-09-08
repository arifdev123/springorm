package in.co.javacoder.springorm.product.dao.Impl;

import java.util.List;

import org.hibernate.FlushMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import in.co.javacoder.springorm.entities.Product;
import in.co.javacoder.springorm.product.dao.ProductDao;

@Component
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public int create(Product product) {
		//hibernateTemplate.getSessionFactory().getCurrentSession().setFlushMode(FlushMode.AUTO);
		
		return (int) hibernateTemplate.save(product);
	}

	@Override
	@Transactional
	public void update(Product product) {
		this.hibernateTemplate.update(product);
	}

	@Override
	@Transactional
	public void delete(Product product) {
		this.hibernateTemplate.delete(product);
	}

	@Override
	@Transactional
	public Product find(int id) {
		return this.hibernateTemplate.get(Product.class, id);
	}

	@Override
	@Transactional
	public List<Product> findAll() {
		return this.hibernateTemplate.loadAll(Product.class);
	}
	
	
	
	

}
