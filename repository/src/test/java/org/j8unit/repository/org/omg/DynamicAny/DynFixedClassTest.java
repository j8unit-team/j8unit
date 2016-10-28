package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynFixed;

@RunWith(J8Unit4.class)
public class DynFixedClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynFixedClassTests<DynFixed> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.DynamicAny.DynFixed]

    @Override
    public Class<DynFixed> createNewSUT() {
        return DynFixed.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.DynamicAny.DynFixed]

}
