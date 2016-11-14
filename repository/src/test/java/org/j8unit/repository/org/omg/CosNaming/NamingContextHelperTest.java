package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CosNaming.NamingContextHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link NamingContextHelper} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.org.omg.CosNaming.NamingContextHelperTests}).
 */

@RunWith(J8Unit4.class)
public class NamingContextHelperTest
implements NamingContextHelperTests<NamingContextHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CosNaming.NamingContextHelper]

    @Override
    public NamingContextHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CosNaming.NamingContextHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CosNaming.NamingContextHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CosNaming.NamingContextHelper]

}
