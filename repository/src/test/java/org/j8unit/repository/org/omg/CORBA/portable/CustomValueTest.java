package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.portable.CustomValue;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CustomValue} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.portable.CustomValueTests}).
 */
@RunWith(J8Unit4.class)
public class CustomValueTest
implements CustomValueTests<CustomValue> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.portable.CustomValue]

    @Override
    public CustomValue createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.portable.CustomValue], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.portable.CustomValue]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.portable.CustomValue]

}
