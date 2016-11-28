package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynAny;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DynAny} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.DynamicAny.DynAnyClassTests}).
 */
@RunWith(J8Unit4.class)
public class DynAnyClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynAnyClassTests<DynAny> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.DynamicAny.DynAny]

    @Override
    public Class<DynAny> createNewSUT() {
        return DynAny.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.DynamicAny.DynAny]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.DynamicAny.DynAny]

}
