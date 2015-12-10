package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ParameterDescriptorClassTest
implements org.j8unit.repository.java.beans.ParameterDescriptorClassTests<java.beans.ParameterDescriptor> {

    @Override
    public Class<java.beans.ParameterDescriptor> createNewSUT() {
        return java.beans.ParameterDescriptor.class;
    }

}
