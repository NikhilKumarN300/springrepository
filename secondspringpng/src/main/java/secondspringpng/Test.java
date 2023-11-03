package secondspringpng;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Resource r = new ClassPathResource("beans.xml");
BeanFactory f = new XmlBeanFactory(r);
f.getBean("creditcard",CreditCard.class);
f.getBean("debit",Debit.class);
f.getBean("zeta",Zeta.class);

	}

}
