package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PropertyDescriptorTest
implements org.j8unit.repository.java.beans.PropertyDescriptorTests<java.beans.PropertyDescriptor> {

    @Override
    public java.beans.PropertyDescriptor createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.beans.PropertyDescriptor] available.");
    }

}
