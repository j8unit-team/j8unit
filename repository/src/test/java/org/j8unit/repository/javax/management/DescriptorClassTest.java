package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DescriptorClassTest
implements org.j8unit.repository.javax.management.DescriptorClassTests<javax.management.Descriptor> {

    @Override
    public Class<javax.management.Descriptor> createNewSUT() {
        return javax.management.Descriptor.class;
    }

}
