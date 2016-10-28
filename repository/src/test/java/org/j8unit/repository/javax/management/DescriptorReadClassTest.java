package org.j8unit.repository.javax.management;

import javax.management.DescriptorRead;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DescriptorReadClassTest
implements org.j8unit.repository.javax.management.DescriptorReadClassTests<DescriptorRead> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.DescriptorRead]

    @Override
    public Class<DescriptorRead> createNewSUT() {
        return DescriptorRead.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.DescriptorRead]

}
