package com.artist;

import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

public class JpaSessionManager {

	@Bean(name="entityManagerFactory")
	public LocalSessionFactoryBean sessionFactory() {
	    LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();

	    return sessionFactory;
	} 
}
