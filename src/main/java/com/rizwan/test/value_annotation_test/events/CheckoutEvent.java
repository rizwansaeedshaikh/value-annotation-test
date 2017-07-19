package com.rizwan.test.value_annotation_test.events;

import java.util.Date;

import org.springframework.context.ApplicationEvent;

public class CheckoutEvent extends ApplicationEvent
{

    private Date checkoutTime;

    public CheckoutEvent(Object source, Date checkoutTime)
    {
        super(source);
        this.checkoutTime = checkoutTime;
    }

    public Date getCheckoutTime()
    {
        return checkoutTime;
    }

    public void setCheckoutTime(Date checkoutTime)
    {
        this.checkoutTime = checkoutTime;
    }

    /**
     * The serialVersionUID of the class.
     */
    private static final long serialVersionUID = 8156586615365067876L;

}
