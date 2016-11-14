package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.portable.ValueOutputStream;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ValueOutputStream} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.portable.ValueOutputStreamClassTests}).
 */

@RunWith(J8Unit4.class)
public class ValueOutputStreamClassTest
implements ValueOutputStreamClassTests<ValueOutputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.portable.ValueOutputStream]

    @Override
    public Class<ValueOutputStream> createNewSUT() {
        return ValueOutputStream.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.portable.ValueOutputStream]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.portable.ValueOutputStream]

}
