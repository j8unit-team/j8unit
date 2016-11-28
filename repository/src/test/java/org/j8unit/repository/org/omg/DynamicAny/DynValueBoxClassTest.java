package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynValueBox;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DynValueBox} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.DynamicAny.DynValueBoxClassTests}).
 */
@RunWith(J8Unit4.class)
public class DynValueBoxClassTest
implements DynValueBoxClassTests<DynValueBox> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.DynamicAny.DynValueBox]

    @Override
    public Class<DynValueBox> createNewSUT() {
        return DynValueBox.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.DynamicAny.DynValueBox]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.DynamicAny.DynValueBox]

}
