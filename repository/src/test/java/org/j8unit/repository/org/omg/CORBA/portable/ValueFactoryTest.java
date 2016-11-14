package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.portable.ValueFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ValueFactory} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.portable.ValueFactoryTests}).
 */

@RunWith(J8Unit4.class)
public class ValueFactoryTest
implements ValueFactoryTests<ValueFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.portable.ValueFactory]

    @Override
    public ValueFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.portable.ValueFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.portable.ValueFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.portable.ValueFactory]

}
