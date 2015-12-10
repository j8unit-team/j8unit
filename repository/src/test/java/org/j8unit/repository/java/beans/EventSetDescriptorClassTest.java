package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EventSetDescriptorClassTest
implements org.j8unit.repository.java.beans.EventSetDescriptorClassTests<java.beans.EventSetDescriptor> {

    @Override
    public Class<java.beans.EventSetDescriptor> createNewSUT() {
        return java.beans.EventSetDescriptor.class;
    }

}
