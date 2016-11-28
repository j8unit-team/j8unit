package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.Object;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Object} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.CORBA.ObjectClassTests}).
 */
@RunWith(J8Unit4.class)
public class ObjectClassTest
implements ObjectClassTests<Object> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.Object]

    @Override
    public Class<Object> createNewSUT() {
        return Object.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.Object]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.Object]

}
