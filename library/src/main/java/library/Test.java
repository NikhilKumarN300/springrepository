package library;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		Library l = c.getBean("li",Library.class);
		System.out.println(l.showstaff());
		System.out.println(l.showstudent());
	}

}
