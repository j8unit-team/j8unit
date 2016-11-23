package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.DynValue;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DynValue} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.CORBA.DynValueClassTests}).
 */

@RunWith(J8Unit4.class)
@SuppressWarnings("deprecation")
public class DynValueClassTest
implements DynValueClassTests<DynValue> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.DynValue]

    @Override
    public Class<DynValue> createNewSUT() {
        return DynValue.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.DynValue]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.DynValue]

}
