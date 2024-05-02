package com.springcore.task;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	AbstractApplicationContext xml=new ClassPathXmlApplicationContext("com/springcore/task/config.xml");
    	AbstractApplicationContext anno=new AnnotationConfigApplicationContext(Config.class);
    	Product product=xml.getBean("product1",Product.class);
    	xml.registerShutdownHook();
    	System.out.println("p1 "+product);
    	
    	anno.registerShutdownHook();
    	Product product2=anno.getBean("product2",Product.class);
    	System.out.println("p2 "+product2);
    	
    
    }
}
