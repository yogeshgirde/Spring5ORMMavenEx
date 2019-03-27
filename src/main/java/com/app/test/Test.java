package com.app.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.AppConfig;
import com.app.model.Product;
import com.app.service.IProductService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		IProductService service=ac.getBean("productServiceImpl",IProductService.class);
		//1. save data
		/*service.saveProduct(new Product(10, "AA", 2.2));
		service.saveProduct(new Product(11, "AB", 6.2));
		service.saveProduct(new Product(12, "CA", 5.2));
	    service.saveProduct(new Product(13, "DE", 8.2));
		service.saveProduct(new Product(14, "ff",9.2));
		*/
		//2. display all rows
		List<Product> list=service.getAllProducts();
		list.forEach(System.out::println);
		
		
		
		//3. delete
		//service.deleteProduct(17);
		
		
		
		
		
		
		
	}
}
