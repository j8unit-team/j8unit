package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.ARG_INOUT;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ARG_INOUT} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.CORBA.ARG_INOUTClassTests}).
 */
@RunWith(J8Unit4.class)
public class ARG_INOUTClassTest
implements ARG_INOUTClassTests<ARG_INOUT> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.ARG_INOUT]

    @Override
    public Class<ARG_INOUT> createNewSUT() {
        return ARG_INOUT.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.ARG_INOUT]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.ARG_INOUT]

}
