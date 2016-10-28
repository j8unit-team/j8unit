package org.j8unit.repository.javax.management;

import javax.management.DescriptorAccess;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DescriptorAccessTest
implements org.j8unit.repository.javax.management.DescriptorAccessTests<DescriptorAccess> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.DescriptorAccess]

    @Override
    public DescriptorAccess createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.DescriptorAccess], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.DescriptorAccess]

}
