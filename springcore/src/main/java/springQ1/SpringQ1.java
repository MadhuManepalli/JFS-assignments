package springQ1;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringQ1 {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("springQ1.xml");
		Customer customer = (Customer) context.getBean("Customer");
		System.out.println(customer);
		context.close();
	}

}
