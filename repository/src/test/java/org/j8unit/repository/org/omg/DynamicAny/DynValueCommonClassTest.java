package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynValueCommon;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DynValueCommon} (by simply reusing the
 * J8Unit test interface {@link DynValueCommonClassTests}).
 */

@RunWith(J8Unit4.class)
public class DynValueCommonClassTest
implements DynValueCommonClassTests<DynValueCommon> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.DynamicAny.DynValueCommon]

    @Override
    public Class<DynValueCommon> createNewSUT() {
        return DynValueCommon.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.DynamicAny.DynValueCommon]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.DynamicAny.DynValueCommon]

}
