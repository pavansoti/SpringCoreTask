package com.springcore.task;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public Customer customer2() {
		Map<String,String> address=new LinkedHashMap<>();
		address.put("primary", "sangareddy");
		address.put("alterante", "karimnager");
		Set<Integer> mob=new LinkedHashSet<>();
		mob.add(9440656);
		mob.add(6548765);
		return new Customer("anil","anil$gmail.com",address,mob);
	}
	@Bean
	public Product product2() {
		Product p2=new Product();
		p2.setCustomer(customer2());
		Map<String,String> details=new LinkedHashMap<String, String>();
		details.put("id", "5456");
		details.put("name","mobile");
		details.put("price", "15000");
		details.put("quantity", "1");
		p2.setDetails(details);
		return p2;
	}
}
