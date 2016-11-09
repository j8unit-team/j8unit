package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.DynEnum;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DynEnum} (by simply reusing the J8Unit
 * test interface {@link DynEnumClassTests}).
 */

@RunWith(J8Unit4.class)
public class DynEnumClassTest
implements DynEnumClassTests<DynEnum> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.DynEnum]

    @Override
    public Class<DynEnum> createNewSUT() {
        return DynEnum.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.DynEnum]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.DynEnum]

}
