package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PropertyDescriptorClassTest
implements org.j8unit.repository.java.beans.PropertyDescriptorClassTests<java.beans.PropertyDescriptor> {

    @Override
    public Class<java.beans.PropertyDescriptor> createNewSUT() {
        return java.beans.PropertyDescriptor.class;
    }

}
