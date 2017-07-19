package com.rizwan.test.value_annotation_test.listeners;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.rizwan.test.value_annotation_test.events.CheckoutEvent;

@SuppressWarnings("rawtypes")
@Component
public class CheckoutEventListener implements  ApplicationListener
{

    @Override
    public void onApplicationEvent(ApplicationEvent event)
    {
        if(event instanceof CheckoutEvent)
            System.out.println("Checkout event occured at " + ((CheckoutEvent)event).getCheckoutTime());
    }

    /*@Override
    public void onApplicationEvent(CheckoutEvent checkoutEvent) {
        
        System.out.println("Checkout event occured at " + checkoutEvent.getCheckoutTime());
    }*/

}
