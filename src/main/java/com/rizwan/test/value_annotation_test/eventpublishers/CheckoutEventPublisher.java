package com.rizwan.test.value_annotation_test.eventpublishers;

import java.util.Date;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import com.rizwan.test.value_annotation_test.events.CheckoutEvent;

@Component(value = "checkoutEventPublisher")
public class CheckoutEventPublisher implements ApplicationEventPublisherAware
{
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher)
    {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void checkout(Object shoppingCart)
    {
        System.out.println("Checking out");
        CheckoutEvent checkoutEvent = new CheckoutEvent(shoppingCart, new Date());
        applicationEventPublisher.publishEvent(checkoutEvent);
    }
}
