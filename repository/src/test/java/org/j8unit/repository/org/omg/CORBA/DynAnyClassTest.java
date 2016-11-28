package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.DynAny;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DynAny} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.CORBA.DynAnyClassTests}).
 */
@RunWith(J8Unit4.class)
@SuppressWarnings("deprecation")
public class DynAnyClassTest
implements DynAnyClassTests<DynAny> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.DynAny]

    @Override
    public Class<DynAny> createNewSUT() {
        return DynAny.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.DynAny]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.DynAny]

}
