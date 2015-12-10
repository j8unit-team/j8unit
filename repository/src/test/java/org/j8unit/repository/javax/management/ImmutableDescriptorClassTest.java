package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImmutableDescriptorClassTest
implements org.j8unit.repository.javax.management.ImmutableDescriptorClassTests<javax.management.ImmutableDescriptor> {

    @Override
    public Class<javax.management.ImmutableDescriptor> createNewSUT() {
        return javax.management.ImmutableDescriptor.class;
    }

}
