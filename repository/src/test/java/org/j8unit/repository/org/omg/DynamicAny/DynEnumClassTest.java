package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynEnum;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DynEnum} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.DynamicAny.DynEnumClassTests}).
 */
@RunWith(J8Unit4.class)
public class DynEnumClassTest
implements DynEnumClassTests<DynEnum> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.DynamicAny.DynEnum]

    @Override
    public Class<DynEnum> createNewSUT() {
        return DynEnum.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.DynamicAny.DynEnum]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.DynamicAny.DynEnum]

}
