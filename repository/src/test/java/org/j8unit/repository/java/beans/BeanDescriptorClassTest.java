package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BeanDescriptorClassTest
implements org.j8unit.repository.java.beans.BeanDescriptorClassTests<java.beans.BeanDescriptor> {

    @Override
    public Class<java.beans.BeanDescriptor> createNewSUT() {
        return java.beans.BeanDescriptor.class;
    }

}
