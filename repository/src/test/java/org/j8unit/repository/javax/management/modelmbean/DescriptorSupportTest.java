package org.j8unit.repository.javax.management.modelmbean;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DescriptorSupportTest
implements org.j8unit.repository.javax.management.modelmbean.DescriptorSupportTests<javax.management.modelmbean.DescriptorSupport> {

    @Override
    public javax.management.modelmbean.DescriptorSupport createNewSUT() {
        return new javax.management.modelmbean.DescriptorSupport();
    }

}
