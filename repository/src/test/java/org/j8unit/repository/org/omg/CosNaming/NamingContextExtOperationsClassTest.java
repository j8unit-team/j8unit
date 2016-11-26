package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CosNaming.NamingContextExtOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NamingContextExtOperations} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.CosNaming.NamingContextExtOperationsClassTests}).
 */
@RunWith(J8Unit4.class)
public class NamingContextExtOperationsClassTest
implements NamingContextExtOperationsClassTests<NamingContextExtOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CosNaming.NamingContextExtOperations]

    @Override
    public Class<NamingContextExtOperations> createNewSUT() {
        return NamingContextExtOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CosNaming.NamingContextExtOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CosNaming.NamingContextExtOperations]

}
