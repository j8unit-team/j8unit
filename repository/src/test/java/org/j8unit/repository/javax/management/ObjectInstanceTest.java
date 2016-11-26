package org.j8unit.repository.javax.management;

import javax.management.ObjectInstance;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ObjectInstance} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.management.ObjectInstanceTests}).
 */
@RunWith(J8Unit4.class)
public class ObjectInstanceTest
implements ObjectInstanceTests<ObjectInstance> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.ObjectInstance]

    @Override
    public ObjectInstance createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.ObjectInstance], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.ObjectInstance]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.ObjectInstance]

}
