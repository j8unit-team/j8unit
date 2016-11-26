package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.DynUnion;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DynUnion} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.CORBA.DynUnionClassTests}).
 */
@RunWith(J8Unit4.class)
@SuppressWarnings("deprecation")
public class DynUnionClassTest
implements org.j8unit.repository.org.omg.CORBA.DynUnionClassTests<DynUnion> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.DynUnion]

    @Override
    public Class<DynUnion> createNewSUT() {
        return DynUnion.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.DynUnion]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.DynUnion]

}
