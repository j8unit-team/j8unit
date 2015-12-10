package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DescriptorReadClassTest
implements org.j8unit.repository.javax.management.DescriptorReadClassTests<javax.management.DescriptorRead> {

    @Override
    public Class<javax.management.DescriptorRead> createNewSUT() {
        return javax.management.DescriptorRead.class;
    }

}
