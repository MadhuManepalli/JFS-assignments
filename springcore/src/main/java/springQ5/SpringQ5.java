package springQ5;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringQ5 {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("springQ5.xml");
		Shape s = (Shape) context.getBean("Dot");
		s.draw();
		Shape si = (Shape) context.getBean("Circle");
		si.draw();
		context.close();
}
}
