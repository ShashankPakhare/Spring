package com.example.demo;

import com.example.demo.model.Alien;
import com.example.demo.model.mongodb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootjpaApplication.class, args);
//		mongodb ab=new mongodb();
//		Alien a=new Alien(501,"shashank","cs",9080);
//
//		Alien b=new Alien(1,"Pakhare","IT",9980);
//		//ab.save(a);
//		System.out.println(ab.findAllAlien());
//		System.out.println("the alien with aid "+ab.findAlien(1));
//		System.out.println("the update value of "+ ab.update(b));
//		ab.delete(501);
	}

}
