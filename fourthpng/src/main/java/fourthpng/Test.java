package fourthpng;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		Amazon a = c.getBean("ama",Amazon.class);
		System.out.println(a.pass());
	}

}
