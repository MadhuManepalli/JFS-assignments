package springQ10;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringQ10 {
	 public static void main( String[] args ){
		    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springQ10.xml");
		    hi madhu = (hi) Q10.getBean("madhu");
		    madhu.hello();
		    context.close(); 
		  }
}
