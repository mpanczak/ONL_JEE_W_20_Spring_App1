package pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.beans.HelloWorld;

public class SpringDiApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        HelloWorld hi = (HelloWorld) context.getBean("helloWorld"); // sposob 1
//        HelloWorld hi1 = (HelloWorld) context.getBean("pl.coderslab.beans.HelloWorld"); // tylko jesli nie ma id w bean
        HelloWorld hi2 = context.getBean("helloWorld", HelloWorld.class); // sposob 3
        HelloWorld hi3 = context.getBean(HelloWorld.class); // sposob 4

        hi.printMessage();
//        hi1.printMessage();
        hi2.printMessage();
        hi3.printMessage();

        context.close();
    }
}
