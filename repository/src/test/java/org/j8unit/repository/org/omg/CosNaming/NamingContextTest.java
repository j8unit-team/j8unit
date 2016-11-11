package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CosNaming.NamingContext;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link NamingContext} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CosNaming.NamingContextTests}).
 */

@RunWith(J8Unit4.class)
public class NamingContextTest
implements NamingContextTests<NamingContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CosNaming.NamingContext]

    @Override
    public NamingContext createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CosNaming.NamingContext], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CosNaming.NamingContext]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CosNaming.NamingContext]

}
