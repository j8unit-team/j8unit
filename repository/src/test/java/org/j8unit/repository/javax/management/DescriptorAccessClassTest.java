package org.j8unit.repository.javax.management;

import javax.management.DescriptorAccess;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DescriptorAccessClassTest
implements org.j8unit.repository.javax.management.DescriptorAccessClassTests<DescriptorAccess> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.DescriptorAccess]

    @Override
    public Class<DescriptorAccess> createNewSUT() {
        return DescriptorAccess.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.DescriptorAccess]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.DescriptorAccess]

}
