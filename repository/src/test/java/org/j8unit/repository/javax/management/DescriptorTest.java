package org.j8unit.repository.javax.management;

import javax.management.Descriptor;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Descriptor} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.management.DescriptorTests}).
 */

@RunWith(J8Unit4.class)
public class DescriptorTest
implements DescriptorTests<Descriptor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.Descriptor]

    @Override
    public Descriptor createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.Descriptor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.Descriptor]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.Descriptor]

}
