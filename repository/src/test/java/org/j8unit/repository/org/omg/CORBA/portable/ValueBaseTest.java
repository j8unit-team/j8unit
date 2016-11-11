package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.portable.ValueBase;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ValueBase} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.portable.ValueBaseTests}).
 */

@RunWith(J8Unit4.class)
public class ValueBaseTest
implements ValueBaseTests<ValueBase> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.portable.ValueBase]

    @Override
    public ValueBase createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.portable.ValueBase], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.portable.ValueBase]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.portable.ValueBase]

}
