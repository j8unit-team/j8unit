package org.j8unit.repository.java.io;

import java.io.ObjectInput;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ObjectInput} (by simply reusing the
 * J8Unit test interface {@link ObjectInputTests}).
 */

@RunWith(J8Unit4.class)
public class ObjectInputTest
implements ObjectInputTests<ObjectInput> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.ObjectInput]

    @Override
    public ObjectInput createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.io.ObjectInput], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.ObjectInput]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.ObjectInput]

}
