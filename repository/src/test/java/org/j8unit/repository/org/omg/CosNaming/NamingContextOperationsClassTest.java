package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CosNaming.NamingContextOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NamingContextOperations} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.org.omg.CosNaming.NamingContextOperationsClassTests}).
 */
@RunWith(J8Unit4.class)
public class NamingContextOperationsClassTest
implements NamingContextOperationsClassTests<NamingContextOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CosNaming.NamingContextOperations]

    @Override
    public Class<NamingContextOperations> createNewSUT() {
        return NamingContextOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CosNaming.NamingContextOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CosNaming.NamingContextOperations]

}
