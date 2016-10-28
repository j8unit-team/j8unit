package org.j8unit.repository.javax.management;

import javax.management.DescriptorKey;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DescriptorKeyClassTest
implements org.j8unit.repository.javax.management.DescriptorKeyClassTests<DescriptorKey> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.DescriptorKey]

    @Override
    public Class<DescriptorKey> createNewSUT() {
        return DescriptorKey.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.DescriptorKey]

}
