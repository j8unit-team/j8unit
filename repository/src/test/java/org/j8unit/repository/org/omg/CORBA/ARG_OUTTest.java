package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.ARG_OUT;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ARG_OUT} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.ARG_OUTTests}).
 */
@RunWith(J8Unit4.class)
public class ARG_OUTTest
implements ARG_OUTTests<ARG_OUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.ARG_OUT]

    @Override
    public ARG_OUT createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.ARG_OUT], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.ARG_OUT]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.ARG_OUT]

}
