package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynValue;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DynValue} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.DynamicAny.DynValueClassTests}).
 */
@RunWith(J8Unit4.class)
public class DynValueClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynValueClassTests<DynValue> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.DynamicAny.DynValue]

    @Override
    public Class<DynValue> createNewSUT() {
        return DynValue.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.DynamicAny.DynValue]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.DynamicAny.DynValue]

}
