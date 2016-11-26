package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynArray;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DynArray} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.DynamicAny.DynArrayClassTests}).
 */
@RunWith(J8Unit4.class)
public class DynArrayClassTest
implements DynArrayClassTests<DynArray> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.DynamicAny.DynArray]

    @Override
    public Class<DynArray> createNewSUT() {
        return DynArray.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.DynamicAny.DynArray]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.DynamicAny.DynArray]

}
