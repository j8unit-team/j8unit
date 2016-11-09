package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CosNaming.NamingContext;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NamingContext} (by simply reusing the
 * J8Unit test interface {@link NamingContextClassTests}).
 */

@RunWith(J8Unit4.class)
public class NamingContextClassTest
implements NamingContextClassTests<NamingContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CosNaming.NamingContext]

    @Override
    public Class<NamingContext> createNewSUT() {
        return NamingContext.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CosNaming.NamingContext]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CosNaming.NamingContext]

}
