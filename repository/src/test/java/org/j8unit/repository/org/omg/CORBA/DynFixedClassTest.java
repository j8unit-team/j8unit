package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.DynFixed;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DynFixed} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.CORBA.DynFixedClassTests}).
 */
@RunWith(J8Unit4.class)
@SuppressWarnings("deprecation")
public class DynFixedClassTest
implements org.j8unit.repository.org.omg.CORBA.DynFixedClassTests<DynFixed> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.DynFixed]

    @Override
    public Class<DynFixed> createNewSUT() {
        return DynFixed.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.DynFixed]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.DynFixed]

}
