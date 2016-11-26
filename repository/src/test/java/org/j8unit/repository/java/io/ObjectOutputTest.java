package org.j8unit.repository.java.io;

import java.io.ObjectOutput;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ObjectOutput} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.io.ObjectOutputTests}).
 */
@RunWith(J8Unit4.class)
public class ObjectOutputTest
implements ObjectOutputTests<ObjectOutput> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.ObjectOutput]

    @Override
    public ObjectOutput createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.io.ObjectOutput], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.ObjectOutput]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.ObjectOutput]

}
