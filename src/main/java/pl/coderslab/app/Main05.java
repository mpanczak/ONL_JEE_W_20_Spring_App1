package pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.beans.MessageSender;

public class Main05 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        MessageSender messageSender = ctx.getBean("messageSender", MessageSender.class);
        messageSender.setMessageFromProperty();
        ctx.close();
    }
}
