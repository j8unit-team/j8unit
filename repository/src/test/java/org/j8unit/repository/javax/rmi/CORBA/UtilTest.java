package org.j8unit.repository.javax.rmi.CORBA;

import javax.rmi.CORBA.Util;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Util} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.rmi.CORBA.UtilTests}).
 */
@RunWith(J8Unit4.class)
public class UtilTest
implements UtilTests<Util> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.rmi.CORBA.Util]

    @Override
    public Util createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.rmi.CORBA.Util], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.rmi.CORBA.Util]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.rmi.CORBA.Util]

}
