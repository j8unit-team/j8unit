package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IndexedPropertyDescriptorClassTest
implements org.j8unit.repository.java.beans.IndexedPropertyDescriptorClassTests<java.beans.IndexedPropertyDescriptor> {

    @Override
    public Class<java.beans.IndexedPropertyDescriptor> createNewSUT() {
        return java.beans.IndexedPropertyDescriptor.class;
    }

}
