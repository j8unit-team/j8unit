package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MethodDescriptorClassTest
implements org.j8unit.repository.java.beans.MethodDescriptorClassTests<java.beans.MethodDescriptor> {

    @Override
    public Class<java.beans.MethodDescriptor> createNewSUT() {
        return java.beans.MethodDescriptor.class;
    }

}
