package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.ARG_IN;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ARG_IN} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.CORBA.ARG_INClassTests}).
 */
@RunWith(J8Unit4.class)
public class ARG_INClassTest
implements ARG_INClassTests<ARG_IN> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.ARG_IN]

    @Override
    public Class<ARG_IN> createNewSUT() {
        return ARG_IN.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.ARG_IN]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.ARG_IN]

}
