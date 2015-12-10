package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DescriptorAccessClassTest
implements org.j8unit.repository.javax.management.DescriptorAccessClassTests<javax.management.DescriptorAccess> {

    @Override
    public Class<javax.management.DescriptorAccess> createNewSUT() {
        return javax.management.DescriptorAccess.class;
    }

}
