package in.co.javacoder.springorm.product.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.co.javacoder.springorm.entities.Product;
import in.co.javacoder.springorm.product.dao.ProductDao;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("in/co/javacoder/springorm/product/test/springconfig.xml");
		ProductDao productdao = (ProductDao) context.getBean("productDaoImpl");
		
		Product product = new Product();
		product.setId(3);
		product.setName("nexus plus");
		product.setDesc("This is good one. Now 50$ offer !!! ");
		product.setPrice(550);
		
		//System.out.println(productdao.create(product));
		
		//productdao.update(product);
		//System.out.println("updated...");
		
		//productdao.delete(product);
		//System.out.println("deleted...");
		
		
		//System.out.println(productdao.find(2));
		
		System.out.println(productdao.findAll());

	}

}
