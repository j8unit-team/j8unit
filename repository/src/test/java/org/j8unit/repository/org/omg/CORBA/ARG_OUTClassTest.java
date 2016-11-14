package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.ARG_OUT;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ARG_OUT} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.CORBA.ARG_OUTClassTests}).
 */

@RunWith(J8Unit4.class)
public class ARG_OUTClassTest
implements ARG_OUTClassTests<ARG_OUT> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.ARG_OUT]

    @Override
    public Class<ARG_OUT> createNewSUT() {
        return ARG_OUT.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.ARG_OUT]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.ARG_OUT]

}
