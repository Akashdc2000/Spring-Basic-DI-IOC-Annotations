package bean.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("beanlifecycle.xml");

//        Call Just before the JVM exits from the context
        context.registerShutdownHook();


//        BeanLifeCycleXML beanLifeCycleXML=(BeanLifeCycleXML) context.getBean("beanLifeCycleXML");
//        System.out.println(beanLifeCycleXML);
//
//        BeanLifeCycleInterface beanLifeCycleInterface=(BeanLifeCycleInterface)  context.getBean("beanLifeCycleInterface");
//        System.out.println(beanLifeCycleInterface);

        BeanLifeCycleAnnotations beanLifeCycleAnnotations=(BeanLifeCycleAnnotations) context.getBean("beanLifeCycleAnnotations");
        System.out.println(beanLifeCycleAnnotations);





//        This method Force fully destroy the context
//        context.close();


    }
}
