package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.HOLDING;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HOLDING} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.PortableInterceptor.HOLDINGClassTests}).
 */
@RunWith(J8Unit4.class)
public class HOLDINGClassTest
implements HOLDINGClassTests<HOLDING> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.HOLDING]

    @Override
    public Class<HOLDING> createNewSUT() {
        return HOLDING.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.HOLDING]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.HOLDING]

}
