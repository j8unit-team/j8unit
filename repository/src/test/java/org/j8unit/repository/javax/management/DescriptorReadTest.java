package org.j8unit.repository.javax.management;

import javax.management.DescriptorRead;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DescriptorReadTest
implements org.j8unit.repository.javax.management.DescriptorReadTests<DescriptorRead> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.DescriptorRead]

    @Override
    public DescriptorRead createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.DescriptorRead], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.DescriptorRead]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.DescriptorRead]

}
