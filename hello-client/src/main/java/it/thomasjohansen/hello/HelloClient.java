package it.thomasjohansen.hello;

import it.thomasjohansen.hello.types.HelloRequest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloClient {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Hello hello = (Hello)context.getBean("hello");
//        Hello hello = helloService.getHelloPort();
        HelloRequest request = new HelloRequest();
        request.setRequestText("Good day!");
        System.out.println(hello.sayHello(request));
    }

}
