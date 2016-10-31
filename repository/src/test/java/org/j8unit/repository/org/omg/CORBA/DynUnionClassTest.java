package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.DynUnion;

@RunWith(J8Unit4.class)
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
