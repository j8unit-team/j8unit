package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.portable.ValueFactory;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ValueFactory} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.portable.ValueFactoryClassTests}).
 */

@RunWith(J8Unit4.class)
public class ValueFactoryClassTest
implements ValueFactoryClassTests<ValueFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.portable.ValueFactory]

    @Override
    public Class<ValueFactory> createNewSUT() {
        return ValueFactory.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.portable.ValueFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.portable.ValueFactory]

}
