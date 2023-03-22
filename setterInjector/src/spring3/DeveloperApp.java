package spring3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeveloperApp {
public static void main(String[] args) {
	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
	JavaDeveloper jd = ctx.getBean("jd", JavaDeveloper.class);
	
	jd.work();
	jd.doProject();
	System.out.println("ID is: "+ jd.id);
	System.out.println("Name is: "+jd.name);

}
}
