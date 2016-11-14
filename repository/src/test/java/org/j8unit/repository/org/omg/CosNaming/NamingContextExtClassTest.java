package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CosNaming.NamingContextExt;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NamingContextExt} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CosNaming.NamingContextExtClassTests}).
 */

@RunWith(J8Unit4.class)
public class NamingContextExtClassTest
implements NamingContextExtClassTests<NamingContextExt> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CosNaming.NamingContextExt]

    @Override
    public Class<NamingContextExt> createNewSUT() {
        return NamingContextExt.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CosNaming.NamingContextExt]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CosNaming.NamingContextExt]

}
