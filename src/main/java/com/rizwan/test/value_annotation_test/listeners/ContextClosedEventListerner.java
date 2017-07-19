package com.rizwan.test.value_annotation_test.listeners;

import java.util.Date;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

@Component
public class ContextClosedEventListerner implements ApplicationListener<ContextClosedEvent>
{

    @Override
    public void onApplicationEvent(ContextClosedEvent event)
    {
        System.out.println("Context closed." + new Date(event.getTimestamp()));   
    }

}
