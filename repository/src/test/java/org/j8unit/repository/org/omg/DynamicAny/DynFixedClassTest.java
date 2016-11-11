package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynFixed;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DynFixed} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.DynamicAny.DynFixedClassTests}).
 */

@RunWith(J8Unit4.class)
public class DynFixedClassTest
implements DynFixedClassTests<DynFixed> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.DynamicAny.DynFixed]

    @Override
    public Class<DynFixed> createNewSUT() {
        return DynFixed.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.DynamicAny.DynFixed]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.DynamicAny.DynFixed]

}
