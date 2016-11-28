package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.DynArray;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DynArray} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.CORBA.DynArrayClassTests}).
 */
@RunWith(J8Unit4.class)
@SuppressWarnings("deprecation")
public class DynArrayClassTest
implements org.j8unit.repository.org.omg.CORBA.DynArrayClassTests<DynArray> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.DynArray]

    @Override
    public Class<DynArray> createNewSUT() {
        return DynArray.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.DynArray]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.DynArray]

}
