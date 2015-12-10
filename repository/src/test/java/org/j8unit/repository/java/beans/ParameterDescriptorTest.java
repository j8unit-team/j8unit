package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ParameterDescriptorTest
implements org.j8unit.repository.java.beans.ParameterDescriptorTests<java.beans.ParameterDescriptor> {

    @Override
    public java.beans.ParameterDescriptor createNewSUT() {
        return new java.beans.ParameterDescriptor();
    }

}
