package org.j8unit.repository.javax.management;

import javax.management.DescriptorKey;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DescriptorKey} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.management.DescriptorKeyTests}).
 */

@RunWith(J8Unit4.class)
public class DescriptorKeyTest
implements DescriptorKeyTests<DescriptorKey> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.DescriptorKey]

    @Override
    public DescriptorKey createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.DescriptorKey], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.DescriptorKey]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.DescriptorKey]

}
