package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MethodDescriptorTest
implements org.j8unit.repository.java.beans.MethodDescriptorTests<java.beans.MethodDescriptor> {

    @Override
    public java.beans.MethodDescriptor createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.beans.MethodDescriptor] available.");
    }

}
