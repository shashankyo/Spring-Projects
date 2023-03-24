package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp {
public static void main(String[] args) {
	
	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
	StudentDetails st = ctx.getBean("st", StudentDetails.class);
	System.out.println(st);
}
}
