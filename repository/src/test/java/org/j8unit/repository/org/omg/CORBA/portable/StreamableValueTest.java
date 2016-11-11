package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.portable.StreamableValue;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link StreamableValue} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.portable.StreamableValueTests}).
 */

@RunWith(J8Unit4.class)
public class StreamableValueTest
implements StreamableValueTests<StreamableValue> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.portable.StreamableValue]

    @Override
    public StreamableValue createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.portable.StreamableValue], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.portable.StreamableValue]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.portable.StreamableValue]

}
