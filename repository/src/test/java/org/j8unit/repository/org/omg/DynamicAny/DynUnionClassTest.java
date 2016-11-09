package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynUnion;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DynUnion} (by simply reusing the J8Unit
 * test interface {@link DynUnionClassTests}).
 */

@RunWith(J8Unit4.class)
public class DynUnionClassTest
implements DynUnionClassTests<DynUnion> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.DynamicAny.DynUnion]

    @Override
    public Class<DynUnion> createNewSUT() {
        return DynUnion.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.DynamicAny.DynUnion]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.DynamicAny.DynUnion]

}
