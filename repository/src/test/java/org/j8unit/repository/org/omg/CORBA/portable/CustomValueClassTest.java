package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.portable.CustomValue;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CustomValue} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.portable.CustomValueClassTests}).
 */

@RunWith(J8Unit4.class)
public class CustomValueClassTest
implements CustomValueClassTests<CustomValue> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.portable.CustomValue]

    @Override
    public Class<CustomValue> createNewSUT() {
        return CustomValue.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.portable.CustomValue]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.portable.CustomValue]

}
