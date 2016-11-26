package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.DISCARDING;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DISCARDING} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.PortableInterceptor.DISCARDINGClassTests}).
 */
@RunWith(J8Unit4.class)
public class DISCARDINGClassTest
implements DISCARDINGClassTests<DISCARDING> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.DISCARDING]

    @Override
    public Class<DISCARDING> createNewSUT() {
        return DISCARDING.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.DISCARDING]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.DISCARDING]

}
