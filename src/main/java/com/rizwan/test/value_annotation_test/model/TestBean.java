package com.rizwan.test.value_annotation_test.model;

import org.springframework.beans.factory.annotation.Value;

public class TestBean
{
    @Value("${testBean.firstName}")
    private String firstName;
    
    @Value("${testBean.lastName}")
    private String lastName;

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

}
