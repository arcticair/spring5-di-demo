package guru.springframework;

import guru.springframework.controllers.ConstructorInjectedController;
import guru.springframework.controllers.GetterInjectedController;
import guru.springframework.controllers.MyController;
import guru.springframework.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"guru.services", "guru.springframework"})
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		System.out.println("Loclzd = " + controller.hello());
		System.out.println("Propty " + ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println("Getter " + ctx.getBean(GetterInjectedController.class).sayHello());
		System.out.println("Constr " + ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
