package com.rizwan.test.value_annotation_test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rizwan.test.value_annotation_test.config.AppConfig;
import com.rizwan.test.value_annotation_test.eventpublishers.CheckoutEventPublisher;
import com.rizwan.test.value_annotation_test.model.TestBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        
        System.out.println("Empty AnnotationConfigApplicationContext created");
        
        context.register(AppConfig.class);
        System.out.println("AppConfig.class registered with context");
        
        context.refresh();
        System.out.println("context refreshed");
        
        TestBean bean = context.getBean(TestBean.class);
        System.out.println(bean.getFirstName() + " " + bean.getLastName());
        
        CheckoutEventPublisher checkoutEventPublisher = (CheckoutEventPublisher)context.getBean("checkoutEventPublisher");
        checkoutEventPublisher.checkout(new Object());
        
        context.close();
    }
}
