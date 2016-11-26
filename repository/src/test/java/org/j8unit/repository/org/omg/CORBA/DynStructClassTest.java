package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.DynStruct;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DynStruct} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.CORBA.DynStructClassTests}).
 */
@RunWith(J8Unit4.class)
@SuppressWarnings("deprecation")
public class DynStructClassTest
implements DynStructClassTests<DynStruct> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.DynStruct]

    @Override
    public Class<DynStruct> createNewSUT() {
        return DynStruct.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.DynStruct]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.DynStruct]

}
