package org.j8unit.repository.javax.management.openmbean;

import javax.management.openmbean.OpenType;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link OpenType} (by simply reusing the
 * J8Unit test interface {@link OpenTypeTests}).
 */

@RunWith(J8Unit4.class)
public class OpenTypeTest<T>
implements OpenTypeTests<OpenType<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.openmbean.OpenType]

    @Override
    public OpenType<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.openmbean.OpenType], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.openmbean.OpenType]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.openmbean.OpenType]

}
