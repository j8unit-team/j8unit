package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DescriptorKeyClassTest
implements org.j8unit.repository.javax.management.DescriptorKeyClassTests<javax.management.DescriptorKey> {

    @Override
    public Class<javax.management.DescriptorKey> createNewSUT() {
        return javax.management.DescriptorKey.class;
    }

}
