package org.j8unit.repository.javax.management;

import javax.management.Descriptor;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DescriptorClassTest
implements org.j8unit.repository.javax.management.DescriptorClassTests<Descriptor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.Descriptor]

    @Override
    public Class<Descriptor> createNewSUT() {
        return Descriptor.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.Descriptor]

}
