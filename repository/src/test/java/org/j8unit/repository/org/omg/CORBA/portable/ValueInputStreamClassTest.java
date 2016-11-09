package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.portable.ValueInputStream;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ValueInputStream} (by simply reusing the
 * J8Unit test interface {@link ValueInputStreamClassTests}).
 */

@RunWith(J8Unit4.class)
public class ValueInputStreamClassTest
implements ValueInputStreamClassTests<ValueInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.portable.ValueInputStream]

    @Override
    public Class<ValueInputStream> createNewSUT() {
        return ValueInputStream.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.portable.ValueInputStream]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.portable.ValueInputStream]

}
