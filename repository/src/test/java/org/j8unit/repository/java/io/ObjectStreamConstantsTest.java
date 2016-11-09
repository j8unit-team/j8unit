package org.j8unit.repository.java.io;

import java.io.ObjectStreamConstants;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ObjectStreamConstants} (by simply
 * reusing the J8Unit test interface {@link ObjectStreamConstantsTests}).
 */

@RunWith(J8Unit4.class)
public class ObjectStreamConstantsTest
implements ObjectStreamConstantsTests<ObjectStreamConstants> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.ObjectStreamConstants]

    @Override
    public ObjectStreamConstants createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.io.ObjectStreamConstants], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.ObjectStreamConstants]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.ObjectStreamConstants]

}
