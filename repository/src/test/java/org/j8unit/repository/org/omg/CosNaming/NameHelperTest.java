package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CosNaming.NameHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link NameHelper} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CosNaming.NameHelperTests}).
 */

@RunWith(J8Unit4.class)
public class NameHelperTest
implements NameHelperTests<NameHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CosNaming.NameHelper]

    @Override
    public NameHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CosNaming.NameHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CosNaming.NameHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CosNaming.NameHelper]

}
