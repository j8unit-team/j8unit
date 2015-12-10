package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BeanDescriptorTest
implements org.j8unit.repository.java.beans.BeanDescriptorTests<java.beans.BeanDescriptor> {

    @Override
    public java.beans.BeanDescriptor createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.beans.BeanDescriptor] available.");
    }

}
