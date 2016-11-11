package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.portable.ValueBase;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ValueBase} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.CORBA.portable.ValueBaseClassTests}).
 */

@RunWith(J8Unit4.class)
public class ValueBaseClassTest
implements ValueBaseClassTests<ValueBase> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.portable.ValueBase]

    @Override
    public Class<ValueBase> createNewSUT() {
        return ValueBase.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.portable.ValueBase]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.portable.ValueBase]

}
