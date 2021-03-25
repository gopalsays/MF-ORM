package first;

import java.util.ResourceBundle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainConsumer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		IWorker fp = (IWorker)context.getBean("fp");
	
		Consumer c = new Consumer(fp);
		c.consumer();
	}

}
