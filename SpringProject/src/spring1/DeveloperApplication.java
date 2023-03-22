package spring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeveloperApplication {
public static void main(String[] args) {
	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
	JavaDeveloper jd = ctx.getBean("jd", JavaDeveloper.class);
//	jd.work();
//	jd.doProject();
	
	
	PythonDeveloper pd = ctx.getBean("pd", PythonDeveloper.class);
//	pd.work();
//	pd.doProject();
	
	SE se = ctx.getBean("ad", SE.class);

	se.activity(jd);
	se.activity(pd);
}
}
 