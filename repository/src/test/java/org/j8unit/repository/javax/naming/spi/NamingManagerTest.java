package org.j8unit.repository.javax.naming.spi;

import javax.naming.spi.NamingManager;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link NamingManager} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.naming.spi.NamingManagerTests}).
 */

@RunWith(J8Unit4.class)
public class NamingManagerTest
implements NamingManagerTests<NamingManager> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.spi.NamingManager]

    @Override
    public NamingManager createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.naming.spi.NamingManager], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.spi.NamingManager]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.spi.NamingManager]

}
